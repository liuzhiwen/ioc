package my.demo.ioc.setter;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Map;

@Component
public class BeanExtends implements BeanPostProcessor, Ordered, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInit :"+beanName);
        if (bean instanceof PrototypeBean){
            ((PrototypeBean)bean).setName("zhangShang");
//            Class<?> type = bean.getClass();
//            Field[] fields = type.getDeclaredFields();
//            for (Field f : fields){
//                if (f.isAnnotationPresent(MyConfig.class)){
//                    if (!f.getType().isInterface()) {
//                        throw new BeanCreationException("RoutingInjected field must be declared as an interface:" + f.getName()
//                                + " @Class " + type.getName());
//                    }
//                    try {
//                        this.handleRoutingInjected(f, bean, f.getType());
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
        }
        return bean;
    }

    /**
     * @param field
     * @param bean
     * @param type
     * @throws IllegalAccessException
     */
    private void handleRoutingInjected(Field field, Object bean, Class type) throws IllegalAccessException {
        Map<String, Object> candidates = applicationContext.getBeansOfType(type);
        field.setAccessible(true);
        if (candidates.size() == 1) {
            field.set(bean, candidates.values().iterator().next());
        } else if (candidates.size() == 2) {
            String injectVal = field.getAnnotation(MyConfig.class).value();
            Object proxy = RoutingBeanProxyFactory.createProxy(injectVal, type, candidates);
            field.set(bean, proxy);
        } else {
            throw new IllegalArgumentException("Find more than 2 beans for type: " + type);
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }
}
