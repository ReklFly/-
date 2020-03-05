package com.wtf.study.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @author wangtengfei
 * @since 2020/3/3 14:52
 */
public class Test {
    private int age;
    private String name;
    private int testInt;

    public Test(int age){
        this.age=age;
    }

    public Test(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println("hello,"+name+" i am "+age);
    }

    private Test(String name){
        this.name=name;
        System.out.println("My name is "+name);
    }
    public Test(){
    }

    private void welcome1(String tips){
        System.out.println(tips);
    }

}
