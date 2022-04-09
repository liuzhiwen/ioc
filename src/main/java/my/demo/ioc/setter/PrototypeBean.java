package my.demo.ioc.setter;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {

    private String name;

    @MyConfig
    private String config;

    public void say() {
        System.out.println("say something...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @MyConfig
    public String testPost(){
        return null;
    }
}
