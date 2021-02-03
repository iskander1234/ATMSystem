package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        Bank bank = new Bank();
//        bank.createPin(bank);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    }
}
