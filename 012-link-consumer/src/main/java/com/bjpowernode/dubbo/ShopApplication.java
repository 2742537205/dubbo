package com.bjpowernode.dubbo;

import com.bjpowernode.dubbo.service.ShopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:ShopApplication
 * Package:com.bjpowernode.dubbo
 * Description:
 *
 * @date:2020/3/9 12:10
 * @author:蛙课网
 */
public class ShopApplication {

    public static void main(String[] args) {

        String path = "dubbo-link-consumer.xml";
        //获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);

        //启动spring容器
//        ((ClassPathXmlApplicationContext) applicationContext).start();

        //获取指定bean
        ShopService shopService = (ShopService) applicationContext.getBean("shopService");

        String hello = shopService.hello();

        System.out.println(hello);
    }
}
