package com.wtf.study.javabasic;

/**
 * @author wangtengfei
 * @since 2020/3/3 13:35
 */
public class OutErr {
    public static void main(String[] args) {
        //顺序不定
        //out有缓存，输出的东西不一定实时输出，
        //err不带缓存，会实时输出
        //System.out与System.err两者是不同步的，他们的顺序基于CPU的调度
        System.out.println("1");
        System.err.println("2");
    }
}
