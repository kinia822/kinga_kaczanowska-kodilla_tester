package com.kodilla.abstracts.homework2;

public class Veterinarian extends Job {
    public Veterinarian(int salary, String responsibilities) {
        super(4500, "Animal treatment, animal vaccinacion, visiting farmers");
        getResponsibilities();
    }
}
