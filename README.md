CSE-Java Pojo Consumer


## Overview
这里的代码是根据用户提供的swagger.yaml文件自动生成。生成的代码总的来说分成以下几类：

1，入口main函数在com.services.pojo.PojoConsumer这个类中。

2，com.services.pojo.csedemo.Csedemo这个类定义了由swagger.yaml里定义了的operation的函数footprint。它和service端的接口一致。

3，com.services.pojo.csedemo.model这个包下面是swagger.yaml里面定义的definitions，也就是model层的类。

4，resource目录下定义了一些配置文件，包括log4j的配置文件，微服务的配置信息，以及swagger协议文件（与service端协议文件一致）等等。

5，特别注意两点：microservice.yaml里面配置信息要填写正确，生成的有可能有些偏差；swagger.yaml里面的x-java-interface配置项一定要指定为com.services.pojo.csedemo.Csedemo。