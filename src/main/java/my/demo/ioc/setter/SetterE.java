package my.demo.ioc.setter;

public class SetterE implements Setter{
    @Override
    public void show() {
        System.out.println("showE");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("showE init complete");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("showE destroy complete");
    }
}
