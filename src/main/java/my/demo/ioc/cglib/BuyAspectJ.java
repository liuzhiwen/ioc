package my.demo.ioc.cglib;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BuyAspectJ {

    @Pointcut("execution(* my.demo.ioc.cglib.IBuy.buy(..)) && within(my.demo.ioc.cglib.*) && bean(boy)")
    public void point(){}

    @Before("point()")
    public void before(){
        System.out.println("男孩女孩都买自己喜欢的东西:before");
    }

    @After("point()")
    public void after(){
        System.out.println("男孩女孩都买自己喜欢的东西:after");
    }

    @AfterReturning("point()")
    public void returning(){
        System.out.println("男孩女孩都买自己喜欢的东西:returning");
    }

    @AfterThrowing("point()")
    public void throwing(){
        System.out.println("男孩女孩都买自己喜欢的东西:throwing");
    }

    @Pointcut("execution(String my.demo.ioc.cglib.IBuy.buy(double)) && args(price) && bean(girl)")
    public void gif(double price) {
    }

    @Around("gif(price)")
    public String hehe(ProceedingJoinPoint pj, double price){
        try {
            pj.proceed();
            if (price > 68) {
                System.out.println("女孩买衣服超过了68元，赠送一双袜子");
                return "衣服和袜子";
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return "衣服";
    }
}