package my.demo.ioc.setter;

import org.springframework.context.annotation.*;

@Configuration
@Import({SetterC.class,MyImportBeanDefinitionRegistrar.class})
public class SetterA {

    @Bean(initMethod = "initMethod")
    @Scope("prototype")
    public SetterB getSetterB(){
        return new SetterB();
    }
}
