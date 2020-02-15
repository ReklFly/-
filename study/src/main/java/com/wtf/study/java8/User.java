package com.wtf.study.java8;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试Lambda专用对象
 * @author wangtengfei
 * @since 2020/2/15 10:46
 */
@Data
public class User {
    private String name;
    private int age;
    private String dept;
    private String ageStr;

    public User() {
    }

    public User(String name, int age, String dept,String ageStr) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.ageStr=ageStr;
    }

    List<User> getUsers(){
        List<User> users=new ArrayList<>();
        users.add(new User("a1",10,"aaa","10"));
        users.add(new User("a2",12,"aaa","12"));
        users.add(new User("b1",11,"bbb","11"));
        users.add(new User("b2",20,"bbb","20"));
        users.add(new User("b3",5,"bbb","5"));
        users.add(new User("c1",9,"ccc","9"));
        users.add(new User("c2",10,"ccc","10"));
        return users;
    }
}
