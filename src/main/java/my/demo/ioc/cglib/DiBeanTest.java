package my.demo.ioc.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiBeanTest {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/lzw/Desktop/cglibclass");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiBean.class);
        DiBean diBean = context.getBean(DiBean.class);
        Boy boy = context.getBean("boy",Boy.class);
        Girl girl = (Girl) context.getBean("girl");
        boy.buy(100.00);
        girl.buy(100.00);
        System.out.println(""+diBean.toString());


//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(DiBean.class);
//        enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
//        enhancer.setCallback(new MyMethodInterceptor());
//        DiBean object = (DiBean) enhancer.create();
//        object.getStu();
//        System.out.println("object");
    }

}
