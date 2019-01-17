package com.yuxiang.li.pro.test;

import com.yuxiang.li.pro.ent.StuInvocationHandler;
import com.yuxiang.li.pro.ent.Student;
import com.yuxiang.li.pro.inf.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: learn_mybaties
 * @description:
 * @author: 李玉祥
 * @create: 2019-01-14 10:06
 **/

public class ProxyTest {
    public static void main(String[] args) {

        //创建一个实例对象，这个对象是被代理的对象
        Person zhangsan = new Student("张三");

        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangsan);

        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);

        //代理执行上交班费的方法
        stuProxy.giveMoney();
    }
}
