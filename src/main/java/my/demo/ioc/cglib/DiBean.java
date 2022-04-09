package my.demo.ioc.cglib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("my.demo.ioc.cglib")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DiBean {

    @Bean
    public Student getStu(){
        return new Student("aaa",12);
    }

    @Bean
    public UserService getUserService(){
        getStu();
        return new UserService();
    }
}
