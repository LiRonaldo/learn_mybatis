package com.yuxiang.li.pro.ent;

import com.yuxiang.li.pro.inf.Person;

/**
 * @program: learn_mybaties
 * @description:
 * @author: 李玉祥
 * @create: 2019-01-14 10:01
 **/

public class Student implements Person {
    private String name;
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            //假设数钱花了一秒时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "上交班费50元");
    }
}