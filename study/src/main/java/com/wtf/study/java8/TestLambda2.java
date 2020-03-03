package com.wtf.study.java8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author wangtengfei
 * @since 2020/2/26 17:48
 */
public class TestLambda2 {
    public static void main(String[] args) {
        List<User> users=new User().getUsers();

        //统计名为a1的个数
//        int count = (int) users.stream().filter(x -> x.getName().equals("a1")).count();


    }
}
