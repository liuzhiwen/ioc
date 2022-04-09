package my.demo.ioc.setter;

public class SetterB implements Setter{

    @Override
    public void show() {
        System.out.println("showB:"+this.toString());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("showB init complete");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("showB destroy complete");
    }

    public void initMethod(){
        System.out.println("showB init");
    }
}
