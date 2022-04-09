package my.demo.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApp {
    public static void main(String[] args) {
        System.out.println("hello");
        SpringApplication.run(StartApp.class,args);
    }
}
