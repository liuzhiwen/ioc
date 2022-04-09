package my.demo.ioc.extend;

import org.springframework.beans.BeansException;

public class AbstractApplicationContext {

    public void refresh() throws BeansException, IllegalStateException {
        System.out.println("this:"+this);
        this.onRefresh();
    }

    protected void onRefresh() throws BeansException {
        System.out.println("this is parent onRefresh");
    }

}
