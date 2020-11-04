package com.test1;

public class Demo {
    public static void main(String[] args) {
        Person person = new Student();
        Person person1 = new Teacher();

        School school = new School();
        school.tick(person);
    }
}
