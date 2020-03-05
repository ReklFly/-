package com.wtf.study.generic;

import java.util.Random;

/**
 * @author wangtengfei
 * @since 2020/3/5 9:16
 */
public class FruitGenerator<T> implements Generator<String> {

    private String[] fruits=new String[]{"apple","banana","pear"};
    @Override
    public String next() {
        Random random=new Random();
        return fruits[random.nextInt(3)];
    }

    public static void main(String[] args) {
        FruitGenerator f=new FruitGenerator();
        System.out.println(f.next());
    }
}
