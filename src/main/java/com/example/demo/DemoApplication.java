package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        Bank bank = new Bank();
//        bank.createPin(bank);

        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        BankService bankService = context.getBean("Service", ATM.class);
//        Random rand = new Random();
//
//        Client randomClient = bankService.getBank().getClients().get(rand.nextInt(bankService.getBank().getClients().size()));
//        bankService.createPin(randomClient);
//        ((ClassPathXmlApplicationContext) context).close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.example.demo");
        context.refresh();
        BankService bankService = context.getBean("Service", ATM.class);
        Random rand = new Random();

        Client randomClient = bankService.getBank().getClients().get(rand.nextInt(bankService.getBank().getClients().size()));
        bankService.createPin(randomClient);
        ((AnnotationConfigApplicationContext) context).close();

    }
}
