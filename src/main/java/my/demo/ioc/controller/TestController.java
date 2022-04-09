package my.demo.ioc.controller;

import my.demo.ioc.setter.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private SetterB setterB;

    @Autowired
    private SetterB setterBB;

    @Autowired
    private SetterC setterC;

    @Autowired
    private SetterD setterD;

    @Autowired
    private SetterF setterF;

    @Autowired
    private SingletonBean singletonBean;

    @RequestMapping("app/setter/testB")
    public String testB(){
        setterB.show();
        return "ok";
    }

    @RequestMapping("app/setter/testBB")
    public String testBB(){
        setterBB.show();
        return "ok";
    }

    @RequestMapping("app/setter/testC")
    public String testC(){
        setterC.show();
        return "ok";
    }

    @RequestMapping("app/setter/testD")
    public String testD(){
        setterD.show();
        return "ok";
    }

    @RequestMapping("app/setter/testF")
    public String testF(){
        setterF.show();
        return "ok";
    }

    @RequestMapping("app/setter/Prototype")
    public String testPrototypeBean(){
        singletonBean.print();
        return "ok";
    }
}
