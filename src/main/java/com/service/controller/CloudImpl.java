package com.service.controller;

import com.service.model.Person;
import io.servicecomb.provider.pojo.RpcSchema;
import org.springframework.beans.factory.annotation.Autowired;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoCodegen", date = "2017-11-13T09:49:11.309Z")

@RpcSchema(schemaId = "cloud")
public class CloudImpl implements Cloud{

    @Autowired
    private CloudDelegate cloudDelegate;


    public Integer add(Integer a, Integer b) {

        return cloudDelegate.add(a, b);
    }


    public String sayHei(String name) {

        return cloudDelegate.sayHei(name);
    }


    public String sayHello(String name) {

        return cloudDelegate.sayHello(name);
    }


    public String sayHi(String name) {

        return cloudDelegate.sayHi(name);
    }


    public String saySomething(String prefix, Person user) {

        return cloudDelegate.saySomething(prefix, user);
    }

}
