package com.wtf.study.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author wangtengfei
 * @since 2020/3/4 11:05
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        Test test=new Test();
        Class c=test.getClass();
//        Constructor cc=c.getDeclaredConstructor(String.class);
//        Field field=c.getDeclaredField("name");
//        field.setAccessible(true);
//        cc.setAccessible(true);
//        cc.newInstance("a");
//        field.set(cc,"wwww");
//        System.out.println(field.get(cc.toString()));

        Field[] fields=c.getDeclaredFields();

        for (int i=0;i<fields.length;i++){
//            fields[i].setAccessible(true);
            System.out.println(fields[i]);
        }

        Field f1=c.getDeclaredField("name");
        System.out.println(f1.getName());


    }
}
