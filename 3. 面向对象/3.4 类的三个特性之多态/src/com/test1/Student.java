package com.test1;

public class Student extends Person {
    @Override
    public void talk() {
        System.out.println("student");
    }
    public void writeHomework() {
        System.out.println("writeHomework");
    }
}
