package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private List<Integer> students = new ArrayList<>();

    public School(String name, List<Integer> students) {
        this.students = students;
        this.name = name;
    }

    public int getSum() {
        int sum = 0;
        for (int quantity : students)
            sum += quantity;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}