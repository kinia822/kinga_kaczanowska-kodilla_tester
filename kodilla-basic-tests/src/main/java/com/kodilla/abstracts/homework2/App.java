package com.kodilla.abstracts.homework2;

public class App {
    public static void main(String[] args) {
        Person henry = new Person("Henry", 42, new Veterinarian(4500, "Animal treatment"));
        System.out.println("Henry's responsibilities: " + henry.job.getResponsibilities());

        Person anna = new Person("Anna", 50, new Teacher(3000, "Teaching"));
        System.out.println("Anna's responsibilities: " + anna.job.getResponsibilities());

        Person jeremy = new Person("Jeremy", 35, new Programmer(10000, "Coding"));
        System.out.println("Jeremy's responsibilities: " + jeremy.job.getResponsibilities());
    }
}
