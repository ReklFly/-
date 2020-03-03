package com.wtf.study.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1.5.7.【强制】不要在 foreach 循环里进行元素的 remove/add 操作。remove 元素请使用 Iterator方式，如果并发操作，需要对 Iterator 对象加锁。
 * 正例：
 * List<String> list = new ArrayList<>();
 * list.add("1");
 * list.add("2");
 * Iterator<String> iterator = list.iterator();
 * while (iterator.hasNext()) {
 * String item = iterator.next();
 * if (删除元素的条件) {
 * iterator.remove();
 * }
 * }
 * 反例：
 * for (String item : list) {
 * if ("1".equals(item)) {
 * list.remove(item);
 * }
 * }
 * @author wangtengfei
 * @since 2020/2/19 15:41
 */
public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("2".equals(item)) {
                iterator.remove();
            }
        }
//        for (String item : list) {
//            if ("2".equals(item)) {
//                list.remove(item);
//            }
//        }
        list.forEach(x-> System.out.println(x.toString()));
    }
}
