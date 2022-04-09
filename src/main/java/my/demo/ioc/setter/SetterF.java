package my.demo.ioc.setter;

import org.springframework.context.SmartLifecycle;

public class SetterF implements SmartLifecycle,Setter {

    public void show() {
        System.out.println("showF");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("showF init complete");
    }

    public void destroy() throws Exception {
        System.out.println("showF destroy complete");
    }

    @Override
    public void start() {
        System.out.println("showF start");
    }

    @Override
    public void stop() {
        System.out.println("showF stop");
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
