package my.demo.ioc.cglib;

import org.springframework.stereotype.Component;

@Component
public class Boy implements IBuy{
    @Override
    public String buy(double price) {
        System.out.println("男孩买了一个游戏机");
        return "游戏机";
    }
}
