package com.yuxiang.li.entity;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by yuxiang.li on 2018/12/6.
 */

public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    private int deleteFlag;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }




}
