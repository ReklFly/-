package com.wtf.study.generic;

/**
 * @author wangtengfei
 * @since 2020/3/4 18:15
 */
public class  Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Generic<Integer> genericInteger=new Generic<>(123456);
//        Generic<String> genericString=new Generic<>("key_value");
//
//        System.out.println(genericInteger.getKey());
//        System.out.println(genericString.getKey());
//
        Generic<Integer> gInteger=new Generic<Integer>(123);
        Generic<Number> gNumber=new Generic<>(456);
//        gNumber.showKeyValue1(gNumber);
//
//        gInteger.showKeyValue2(gInteger);

        Generic g=new Generic();
        Object obj=g.genericMethod(Class.forName("com.wtf.study.generic.Generic"));

        g.showKeyValue3(gNumber);
        g.showKeyValue3(gInteger);
    }
}
