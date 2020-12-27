package ru.ghostrog.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //Использование наших настроек из xml файла
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Создание бина(нашего объекта)
        TestBean testBean = context.getBean("testBeans", TestBean.class);

        System.out.println(testBean.getName() + " " + testBean.getSurname() + " " + testBean.getAge());

        //обязательно необходимо закрывать
        context.close();
    }
}
