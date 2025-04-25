package com.example.expert;

public class Main {
    public static void main(String[] args) {
        User user = new User("Іван Петренко");
        Address address = new Address("Київ", "вул. Хрещатик, 22", "01001");
        user.setAddress(address);
        System.out.println("Користувач: " + user.getName());
        System.out.println("Адреса: " + user.getAddress());
    }
}
