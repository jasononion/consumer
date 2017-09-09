package com.services.pojo;

import com.services.pojo.csedemo.Csedemo;
import com.services.pojo.csedemo.model.Person;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;
import io.servicecomb.provider.pojo.RpcReference;
import org.springframework.stereotype.Component;

@Component
public class PojoConsumer {
    @RpcReference(microserviceName = "service", schemaId = "csedemo")
    private static Csedemo demo;

    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init();

        consumerDemo();
    }

    private static void consumerDemo() throws InterruptedException {
        while (true) {
            System.out.println("Add: " + demo.add(3, 6));
            System.out.println("Sayhi: " + demo.sayHi("Tom"));
            System.out.println("SaySomething: " + demo.saySomething("Something", new Person().name("Jim")));
            Thread.sleep(3000);
        }
    }
}
