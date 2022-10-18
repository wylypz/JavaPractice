package 注解;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Test01 {
        @Test
        public void test1() throws IllegalAccessException, InstantiationException{
        System.out.println("类上注解信息：");
        //获取字节码对象
        Class<TestComputer> clazz= TestComputer.class;
            Computer c = clazz.getAnnotation(Computer.class);
        if(clazz.isAnnotationPresent(Computer.class)){
            //获取注解对象

            //通过注解对象获取注解上的值
            String name = c.name();
            double price = c.price();
            String[] factories = c.factories();

            System.out.println(name);
            System.out.println(price);
            System.out.println(Arrays.toString(factories));
            System.out.println("-------------");
        }}

        @Test
        public void test2() throws IllegalAccessException, InstantiationException, NoSuchMethodException {
            System.out.println("方法上注解信息：");
            //获取字节码对象
            Class<TestComputer> clazz= TestComputer.class;
            Method method =clazz.getDeclaredMethod("buyComputer");
            Computer c = method.getAnnotation(Computer.class);
            //判断该方法上是否使用了Compute注解，或者该注解的生命周期是否是RUNTIME
            if(method.isAnnotationPresent(Computer.class)){
                //通过方法对象获取该方法上的注解

                //通过注解对象获取注解上的值
                String name = c.name();
                double price = c.price();
                String[] factories = c.factories();

                System.out.println(name);
                System.out.println(price);
                System.out.println(Arrays.toString(factories));

            }


    }
}
