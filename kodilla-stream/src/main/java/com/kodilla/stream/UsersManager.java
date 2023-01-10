package com.kodilla.stream;

/*public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .forEach(username -> System.out.println(username));
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}*/

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<User> olderThan45 = filterUsersOlderThanGivenAge(45);
        System.out.println(olderThan45);

        List<Integer> salesPosts = filterSalesGroupNumberOfPosts();
        System.out.println(salesPosts);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> filterUsersOlderThanGivenAge(int age) {
        age = 45;
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 45)
                .collect(Collectors.toList());

        return users;
    }

    public static List<Integer> filterSalesGroupNumberOfPosts() {
        List<Integer> posts = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Sales"))
                .map(UsersManager::getNumberOfPosts)
                .collect(Collectors.toList());

        return posts;
    }

    public static Integer getNumberOfPosts(User user) {
        return user.getNumberOfPost();
    }
}