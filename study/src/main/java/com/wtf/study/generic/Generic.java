package com.wtf.study.generic;

import java.util.List;

/**
 * @author wangtengfei
 * @since 2020/3/4 18:12
 */
public class Generic<T> {
    private T key;

    public Generic(T key){
        this.key=key;
    }

    public  T getKey(){
        return key;
    }
    Generic(){

    }

    public void showKeyValue1(Generic<Number> obj){
        System.out.println("key value is "+obj.getKey());
    }

    public void showKeyValue2(Generic<?> obj){
        System.out.println("key value is "+obj.getKey());
    }

    public void showKeyValue3(Generic<? extends Number> obj){
        System.out.println("key value is "+obj.getKey());
    }

    public <T> T genericMethod(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        T instance=tClass.newInstance();
        return  instance;
    }

    public <T extends Number>T showKeyName(Generic<T> container){
        System.out.println(container);
        T t=container.getKey();
        return t;
    }

    public Object showKeyName1(List<? super Integer> a){
//        System.out.println(container);

        return a.get(0);
    }

}
