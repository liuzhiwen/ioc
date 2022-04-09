package my.demo.ioc.extend;

import org.springframework.beans.BeansException;

public class WebApplicationContext extends AbstractApplicationContext{

    @Override
    public  void refresh() throws BeansException, IllegalStateException {
        super.refresh();
    }

    @Override
    protected void onRefresh() throws BeansException {
        System.out.println("this is subclass onRefresh");
    }

}
