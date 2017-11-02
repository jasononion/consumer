package com.services.pojo.csedemo;

import com.services.pojo.csedemo.model.Person;

public interface Csedemo {

    Integer add(Integer a, Integer b);

    double bmi(Integer weight, double height);

    String sayHei(String name);


    String sayHello(String name);


    String sayHi(String name);


    String saySomething(String prefix, Person user);

}