package com.wtf.study.java8;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @author wangtengfei
 * @since 2020/2/26 11:57
 */
public class TestBig {
    public static void main(String[] args) {
        BigDecimal a1=new BigDecimal(1);
        BigDecimal b1=new BigDecimal(3);
        NumberFormat percent = NumberFormat.getPercentInstance();  //建立百分比格式化引用
        percent.setMaximumFractionDigits(3); //百分比小数点最多3位
        System.out.println(percent.format(a1.divide(b1,3,BigDecimal.ROUND_HALF_DOWN)));
    }
}
