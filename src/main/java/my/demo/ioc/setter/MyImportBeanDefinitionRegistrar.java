package my.demo.ioc.setter;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(SetterD.class);
        RootBeanDefinition beanDefinitionF = new RootBeanDefinition(SetterF.class);
        //注册一个Bean，指定bean名
        registry.registerBeanDefinition("setterD", beanDefinition);
        registry.registerBeanDefinition("setterF", beanDefinitionF);
//        boolean definition = registry.containsBeanDefinition("my.demo.ioc.SetterB");
//        boolean definition2 = registry.containsBeanDefinition("my.demo.ioc.SetterC");
//        if (definition && definition2) {
//            //指定Bean定义信息作用域都可以在这里定义；（Bean的类型，Bean。。。）
//            RootBeanDefinition beanDefinition = new RootBeanDefinition(SetterD.class);
//            //注册一个Bean，指定bean名
//            registry.registerBeanDefinition("setterD", beanDefinition);
//        }
    }
}
