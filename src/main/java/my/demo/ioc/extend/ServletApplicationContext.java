package my.demo.ioc.extend;

import org.springframework.beans.BeansException;

public class ServletApplicationContext extends WebApplicationContext{

    @Override
    public void refresh() throws BeansException, IllegalStateException {
        super.refresh();
    }

    @Override
    protected void onRefresh() throws BeansException {
        System.out.println("this is sub subclass onRefresh");
    }

    public static void main(String[] args) {
        AbstractApplicationContext webApplicationContext = new WebApplicationContext();
        webApplicationContext.refresh();
    }

}
