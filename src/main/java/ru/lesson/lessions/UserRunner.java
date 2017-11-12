package ru.lesson.lessions;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class UserRunner {
    public static void main(String[] args) {


        List<User> usersList = new ArrayList<User>();
        usersList.add(new User("1","ivan"));
        usersList.add(new User("2","max"));
        usersList.add(new User("1","ivan"));

        System.out.println("ArrayList");
        for (User user:usersList){
            System.out.println(user);
        }
        Set<User> usersSet = new HashSet<User>();
        usersSet.add(new User("1","ivan"));
        usersSet.add(new User("2","max"));
        usersSet.add(new User("1","ivan"));

        System.out.println("HashSet");
        for (User user:usersSet){
            System.out.println(user);
        }
        Map<String,User> usersMap = new HashMap<String, User>();
        usersMap.put("1", new User("1","ivan"));
        usersMap.put("2", new User("2","max"));
        usersMap.put("1", new User("1","ivan"));

        System.out.println("usersMap");
        for (Map.Entry<String,User>user:usersMap.entrySet()){
            System.out.println(user);
        }
    }
}
