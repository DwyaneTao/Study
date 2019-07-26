package com.hu;

import com.hu.bean.Person;
import com.hu.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        // 配置文件类型
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        Person person = (Person) classPathXmlApplicationContext.getBean("person");
//        System.out.println(person);

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        System.out.println(person);

        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(MainConfig.class);
        for (String s : beanNamesForType) {
            System.out.println(s);

        }

    }
}
