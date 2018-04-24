package junitdemo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {
    @BeforeClass
    public static  void beforeClass(){
        System.out.println("this is Test2 beforeClass");
    }
    @Test
    public void fun1(){
        System.out.println("this is Test2 fun1");
    }
    @Test
    public void fun2(){
        System.out.println("this is Test2 fun2");
    }

    @AfterClass
    public static  void afterClass(){
        System.out.println("this is Test2 afterClass");
    }
}
