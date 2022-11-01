package edu.hyjsxx;

/**
 * This program display an XML document as a tree in JSON format
 *
 * @auther Zhukeming
 * @Data: 2022 - 11 - 01 - 15:12
 * @Description: edu.hyjsxx
 * @Version 2.01
 */
public class ClassPathXmlApplicationContext extends ApplicationContext {
    public ClassPathXmlApplicationContext( String... configLocations  ) {
        super(configLocations);
    }

}
