package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Sea", "2.5x2.5", "stamped"));
        stamps.add(new Stamp("Horse", "2.5x2.5", "stamped"));
        stamps.add(new Stamp("Sea", "2.5x2.5", "stamped"));
        stamps.add(new Stamp("Moon", "2.5x3", "unstamped"));
        stamps.add(new Stamp("Raven", "3x3", "unstamped"));
        stamps.add(new Stamp("Raven", "3x3", "stamped"));
        stamps.add(new Stamp("Sea", "2.5x2.5", "stamped"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
