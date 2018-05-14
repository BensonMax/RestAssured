package junitdemo;

import org.junit.*;

public class Test1 {
    @BeforeClass
    public static  void beforeClass(){
        System.out.println("this is Test1 beforeClass");
    }

    @Before
    public void before(){
        System.out.println("this is Test1 before");
    }
    @Test
    public void fun1(){
        System.out.println("this is Test1 fun1");
    }

    @Test
    public void fun2(){
        System.out.println("this is Test1 fun2");
    }
    @Test
    public void fun3(){
        System.out.println("this is Test1 fun3");
    }
    @Test
    public void fun4(){
        System.out.println("this is Test1 fun4");
    }
    @Test
    public void fun5(){
        System.out.println("this is Test1 fun5");
    }



    @After
    public void after(){
        System.out.println("this is Test1 after");

    }
    @AfterClass
    public static  void afterClass(){
        System.out.println("this is Test1 afterClass");
    }
}
