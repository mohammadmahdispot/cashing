package org.example;

public class Main {
    public static void main(String[] args) {
        UserCash cach = new UserCash();

        cach.addUser(new User(1, "mohammad"));
        cach.addUser(new User(2, "ali"));
        cach.addUser(new User(3, "mina"));

        int userId = 2;
        User user = cach.getUser(userId);

        if ((user != null)){
            System.out.println("User found in cache: ID = " + user.getId() + ", Name = " + user.getName());
        } else {
            System.out.println("User not found in cache!!!!");
        }
    }
}
