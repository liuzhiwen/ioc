package my.demo.ioc.cglib;

import org.springframework.stereotype.Component;

@Component
public class Girl implements IBuy{
    @Override
    public String buy(double price) {
        System.out.println("女孩买了一件漂亮的衣服");
        return "衣服";
    }
}
