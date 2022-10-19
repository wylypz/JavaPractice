package 单元测试;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;


public class JunitTest {
    public static void main(String[] args) {
    }

    @BeforeClass
    public static void init() {         // 一般用于资源的初始化
        System.out.println("BeforeClass...");
    }

    @Before
    public void before() {
        System.out.println("Before...");
    }

    /*
      测试方法
      */
    @Test
    public void test1() {
        System.out.println("test1...");
    }

    /*
    测试方法
    */
    @Test
    public void test2() {
        System.out.println("test2...");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @AfterClass
    public static void destroy() {          // 一般用于释放系统资源
        System.out.println("AfterClass...");
    }

}
