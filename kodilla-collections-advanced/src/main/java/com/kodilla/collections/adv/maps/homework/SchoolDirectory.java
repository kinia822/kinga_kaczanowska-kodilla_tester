package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();
        Principal thomas = new Principal("Thomas", "Johnson");
        Principal rita = new Principal("Rita", "Santos");
        Principal lucius = new Principal("Lucius", "Madway");

        School thomasSchool = new School("Whitewater High School", Arrays.asList(21, 24, 22));
        School ritaSchool = new School("Valley View Secondary School", Arrays.asList(30, 28, 26));
        School luciusSchool = new School("Laguna Bay Elementary", Arrays.asList(21, 31, 28));

        schoolDirectory.put(thomas, thomasSchool);
        schoolDirectory.put(rita, ritaSchool);
        schoolDirectory.put(lucius, luciusSchool);

        for (Map.Entry<Principal, School> principalInfo : schoolDirectory.entrySet()) {
            System.out.println(principalInfo.getKey().getFirstname() + " " + principalInfo.getKey().getLastname() + " is a principal of The " + principalInfo.getValue().getName());
            System.out.println("Total number of students: " + principalInfo.getValue().getSum());
        }
    }
}
