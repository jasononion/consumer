package com.services.pojo;

import com.service.controller.Cloud;
import com.services.pojo.csedemo.Csedemo;
import com.services.pojo.csedemo.model.Person;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;
import io.servicecomb.provider.pojo.RpcReference;
import org.springframework.stereotype.Component;

@Component
public class PojoConsumer {
//    @RpcReference(microserviceName = "service", schemaId = "csedemo")
//    private static Csedemo demo;
    @RpcReference(microserviceName = "cloud", schemaId = "cloud")
    private static Cloud cloud;

    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init();

        consumerDemo();
    }

    private static void consumerDemo() throws InterruptedException {
        while (true) {
//            System.out.println("Cal: " + demo.bmi(80, 1.75));
            System.out.println("Sayhi: " + cloud.sayHi("Tom"));
            Thread.sleep(3000);
        }
    }
}
