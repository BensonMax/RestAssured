package junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test3 {

    @Before
    public void before(){
        System.out.println("this is Test3 before");
    }
    @Test
    public void fun1(){
        System.out.println("this Test3 fun1");
    }


    @Test
    public void fun2(){
        System.out.println("this Test3 fun2");
    }

    @After
    public void after(){
        System.out.println("this is Test3 after");

    }
}
