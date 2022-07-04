package com.course.testng;

import org.testng.annotations.Test;

public class MultipleThreadOnThread {

    @Test
    public void test1(){
        System.out.println(1);
        System.out.println("ID:"+Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.println(1);
        System.out.println("ID:"+Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.println(1);
        System.out.println("ID:"+Thread.currentThread().getId());
    }

    @Test
    public void test4(){
        System.out.println(1);
        System.out.println("ID:"+Thread.currentThread().getId());
    }

    @Test
    public void test5(){
        System.out.println(1);
        System.out.println("ID:"+Thread.currentThread().getId());
    }

    @Test
    public void test6(){
        System.out.println(1);
        System.out.println("ID:"+Thread.currentThread().getId());
    }

    @Test
    public void test7(){
        System.out.println(1);
        System.out.println("ID:"+Thread.currentThread().getId());
    }


    public void test8(){
        System.out.println(1);
        System.out.println("ID:"+Thread.currentThread().getId());
    }


    public void test9(){
        System.out.println(1);
        System.out.println("ID:"+Thread.currentThread().getId());
    }


    public void test10(){
        System.out.println(1);
        System.out.println("ID:"+Thread.currentThread().getId());
    }
}

