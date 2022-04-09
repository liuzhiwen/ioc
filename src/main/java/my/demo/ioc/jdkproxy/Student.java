package my.demo.ioc.jdkproxy;

public class Student implements Person{
    @Override
    public void say() {
        System.out.println("我是学生...");
        reply();
    }

    public void reply() {
        System.out.println("我是教师...");
    }
}
