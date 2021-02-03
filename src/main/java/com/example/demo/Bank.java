package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank{

    String number;
    int size;

    public Bank() {
        System.out.println("Добавить карточку 6 сиволов : ");
        Bank bank = new Bank("123123",1000);
        createPin(bank);
    }

    public Bank(String number, int size) {
        this.number = number;
        this.size = size;
    }

    public void createPin(Bank bank){
        ArrayList<Bank> banks = new ArrayList<Bank>();
        Scanner scan = new Scanner(System.in);
        bank.number = scan.next();
        int length = bank.number.length();
        if (length == 6){
            if (banks.add(bank) == true){
                while (true) {
                    System.out.println("1 Пополнить баланс \n2 Снять \n3 Посмотреть");
                    int num = scan.nextInt();
                    switch (num) {
                        case (1):
                            setMoney();
                            break;
                        case (2):
                            getMoney();
                            break;
                        case (3):
                            printInfo();
                            break;
                    }
                }
            }
        }else{
            System.out.println("Вы вели не правильный пин должен быть ровно 6 значений");
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMoney()
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Сколько желаете внести? ");
        n=in.nextInt();
        size+=n;
    }

    public void getMoney()
    {
        Scanner in=new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Сколько желаете снять? ");
            n= in.nextInt();
            if(n>size)
                System.out.println("У вас таких средств нет! Запросите меньшую сумму.");
        }
        while(n>size);
        size-=n;
    }

    public void printInfo()
    {
        System.out.println("Текущее состояние счёта: ");
        System.out.println("Номер счета: "+ number);
        System.out.println("Колчество средств на счёте: "+ size);
    }
}
