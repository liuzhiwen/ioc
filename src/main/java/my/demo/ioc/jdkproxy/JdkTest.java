package my.demo.ioc.jdkproxy;


import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

public class JdkTest {

    public static void writeClassToDisk(String path){
        byte[] classFile = ProxyGenerator.generateProxyClass("$Student", new Class[]{Person.class});
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
            fos.write(classFile);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {

        JdkTest jdkTest = new JdkTest();
        jdkTest.array("123","456","789");

        //生成$Proxy0的class文件
        Student one = new Student();
        one.say();
        Person stu = (Person) Proxy.newProxyInstance(JdkTest.class.getClassLoader(),Student.class.getInterfaces(),new JdkProxy(new Student()));
        stu.say();
        JdkTest.writeClassToDisk("/Users/lzw/Desktop/cglibclass/$Student.class");

    }


    public void array(String ... name){
        getArray(name);
    }

    public void getArray(String[] names){
        for (String item:names){
            System.out.println("item:"+item);
        }
    }
}
