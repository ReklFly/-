package com.wtf.study.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wangtengfei
 * @since 2020/2/15 11:01
 */
public class TestLambda1 {
    public static void main(String[] args) {
        List<User> users=new User().getUsers();

        //排序：对每个user根据年龄正序排序
        List<User> userList=users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        userList.forEach(x-> System.out.println(x));
        System.out.println();
        //排序：对每个user根据年龄倒序排序
        List<User> userListDESC=users.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());
        userListDESC.forEach(x-> System.out.println(x));
        System.out.println();
        //对字符串类型进行排序//待解决
//        List<User> userListSTR=users.stream().sorted(Comparator.comparing(User::getAgeStr).reversed()).collect(Collectors.toList());
//        userListSTR.forEach(x-> System.out.println(x.toString()));

        //抽取某个属性组成新list
        List<String> names=users.stream().map(x->x.getName()).collect(Collectors.toList());
        names.forEach(x-> System.out.println(x));

        //过滤年纪大于10的
        List<User> users1=users.stream().filter(x->x.getAge()>10).collect(Collectors.toList());
        users1.forEach(x-> System.out.println(x));

        //根据部门分组,
        Map<String, List<User>> map=users.stream().collect(Collectors.groupingBy(User::getDept));
        map.forEach((k,v)-> System.out.println(k+" "+v));

        //对每个人的年龄加1
        users.forEach(x->{
            x.setAge(x.getAge()+1);
        });
    }
}
