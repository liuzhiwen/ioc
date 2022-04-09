package my.demo.ioc.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean  {

    @Autowired
    private PrototypeBean bean;

    @Autowired
    private ApplicationContext context;

    public void print() {
        PrototypeBean bean2= context.getBean(PrototypeBean.class);
        PrototypeBean bean3= getPrototypeBean();
        System.out.println("Bean SingletonBean's HashCode :"+bean.hashCode());
        System.out.println("Bean2 SingletonBean's HashCode :"+bean2.hashCode());
        assert bean3 != null;
        System.out.println("Bean3 SingletonBean's HashCode :"+bean3.hashCode());
        bean3.say();



    }

    @Lookup
    public PrototypeBean getPrototypeBean(){
       return null;
    }
}
