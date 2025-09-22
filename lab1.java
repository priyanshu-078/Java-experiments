package com.lab;

import java.util.ArrayList;
import java.util.Collections;

class Account implements Comparable<Account>{
    @Override
    public int compareTo(Account o){
        return this.balance-o.balance;
    }

    int id;
    double num;
    String name;
    int balance;

    public Account(int id, double num, String name, int balance) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return id + ", " + num + ", " + name + '\'' + ", " + balance +"     ";
    }
}

public class Lab1 {
    public static void main(String[] args) {
        ArrayList<Account> al= new ArrayList<>();
        al.add(new Account(101,989898,"priyanshu chaihan",2000));
        al.add(new Account(102,989896,"tapsaya chaihan",6000));
        al.add(new Account(103,989897,"himanshi chaihan",100));
        al.add(new Account(104,989859,"anshika chaihan",8000));
        al.add(new Account(105,989802,"krishna chaihan",7000));
        Collections.sort(al);
        System.out.println(al.get(al.size()-1));
        System.out.println(al.get(al.size()-1).name);

    }
}
