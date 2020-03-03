package com.wtf.study.javabasic;

/**
 * 测试break和continue的区别
 * 1.break会结束距离自己最近的一次循环
 * 2.continue不会结束循环，会直接进入下一次循环（当前的不生效）
 * @author wangtengfei
 * @since 2020/3/3 11:55
 */
public class BreakContinue {
    public static void main(String[] args) {
//        for(int j=0;j<10;j++){
//            for(int i=0;i<10;i++){
//                System.out.println(i);
//                if (i==3){
////                    break;
//                    continue;
//                }
//            }
//            System.out.println(j+"--J");
//        }


        System.out.println("-------");
//
        for(int i=0;i<10;i++){
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
