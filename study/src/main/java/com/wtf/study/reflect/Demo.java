package com.wtf.study.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author wangtengfei
 * @since 2020/3/4 9:39
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        Test test=new Test();
        Class c=test.getClass();
//        System.out.println(c.getMethods());
        Constructor[] constructors;
        constructors=c.getDeclaredConstructors();
        for(int i=0;i<constructors.length;i++){
            System.out.println(constructors[i]);
            //获取访问控制符
            System.out.println(Modifier.toString(constructors[i].getModifiers()));
            Class[] parameterTypes=constructors[i].getParameterTypes();
            for(int j=0;j<parameterTypes.length;j++){
                System.out.println(parameterTypes[j].getName());
            }
        }
        System.out.println("===========");

        Class[] p = {int.class,String.class};
        try {

            Constructor  constructor= c.getDeclaredConstructor(p);
            Class[] parameterTypes=constructor.getParameterTypes();
            for(int i=0;i<parameterTypes.length;i++){
                System.out.println(parameterTypes[i].getName());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("===========");
        //获取公有构造方法
            Constructor constructor1=c.getDeclaredConstructor(int.class,String.class);
            constructor1.newInstance(21,"wtf");
        System.out.println("===========");
        //获取私有构造方法
        Constructor constructor2=c.getDeclaredConstructor(String.class);
        //只需setAccessible为true
        constructor2.setAccessible(true);
        constructor2.newInstance("wtf");

        System.out.println("===========");
        Method method=c.getDeclaredMethod("welcome1",String.class);
        method.setAccessible(true);
        Object[] arg1s={"欢迎wtf"};
        method.invoke(test,arg1s);

        System.out.println("===========");
        Constructor cc=c.getDeclaredConstructor(String.class);
        Field field=c.getDeclaredField("name");
        field.setAccessible(true);
        field.set(cc,"wwww");
        System.out.println(field.get(cc.toString()));

    }
}
