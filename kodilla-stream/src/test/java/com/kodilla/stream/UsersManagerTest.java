package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        // given
        UsersManager manager = new UsersManager();
        // when
        List<String> result = manager.filterChemistGroupUsernames();
        // then
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Walter White");
        expectedResult.add("Gale Boetticher");
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFilterUsersOlderThanGivenAge() {
        // given
        UsersManager manager = new UsersManager();
        // when
        List<User> result = manager.filterUsersOlderThanGivenAge(45);
        // then
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(new User("Walter White", 50, 7, "Chemists"));
        expectedResult.add(new User("Gus Firing", 49, 0, "Board"));
        expectedResult.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFilterSalesGroupNumberOfPosts() {
        // given
        UsersManager manager = new UsersManager();
        // when
        List<Integer> result = manager.filterSalesGroupNumberOfPosts();
        // then
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4648);
        assertEquals(expectedResult, result);
    }
}
