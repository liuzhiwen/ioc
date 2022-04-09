package my.demo.ioc.setter;

public class SetterC implements Setter{
    @Override
    public void show() {
        System.out.println("showC");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("showC init complete");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("showC destroy complete");
    }
}
