package my.demo.ioc.setter;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public interface Setter extends InitializingBean, DisposableBean {
    void show();
}
