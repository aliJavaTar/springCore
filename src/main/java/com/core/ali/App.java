package com.core.ali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        Animal animal = (Animal) context.getBean("dog");
        animal.move();
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println("first name " + dog.getName());
        Dog dog1 = context.getBean("dog", Dog.class);
        dog1.setName("jan");
        System.out.println("-------------------");
        System.out.println(dog.getName());
        System.out.println(dog1.getName());
        Cat cat = context.getBean("cat", Cat.class);
        cat.move();
    }
}
