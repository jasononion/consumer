package com.service.controller;

import com.service.model.Person;


public interface Cloud {

    Integer add(Integer a, Integer b);


    String sayHei(String name);


    String sayHello(String name);


    String sayHi(String name);


    String saySomething(String prefix, Person user);

}