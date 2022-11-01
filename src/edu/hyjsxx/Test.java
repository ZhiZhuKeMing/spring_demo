package edu.hyjsxx;

/**
 * This program display an XML document as a tree in JSON format
 *
 * @auther Zhukeming
 * @Data: 2022 - 11 - 01 - 15:11
 * @Description: edu.hyjsxx
 * @Version 2.01
 */

public class Test {

    public static void main(String[] args ){
        //1.获取工厂
            ApplicationContext act = new ClassPathXmlApplicationContext("/edu/hyjsxx/resources/applicationContext.xml");
        //2.通过工厂类获得对象
            UserService userService = (UserService) act.getBean("userService");
        //3.调用方法
            userService.print();
         }
    }

