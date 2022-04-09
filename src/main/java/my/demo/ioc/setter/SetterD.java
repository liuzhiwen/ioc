package my.demo.ioc.setter;

public class SetterD implements Setter{
    @Override
    public void show() {
        System.out.println("showD");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("showD init complete");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("showD destroy complete");
    }
}
