package com.yuxiang.li.pro.ent;

/**
 * @program: learn_mybaties
 * @description:
 * @author: 李玉祥
 * @create: 2019-01-14 10:03
 **/

public class MonitorUtil {

    private static ThreadLocal<Long> tl = new ThreadLocal();

    public static void start() {
        tl.set(System.currentTimeMillis());
    }

    //结束时打印耗时
    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时" + (finishTime - tl.get()) + "ms");
    }
}