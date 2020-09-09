package com.company.z4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        int age;
        Dog dog1;
        DogHouse house1 = new DogHouse();
        do {
            age = scan.nextInt();
            name = scan.nextLine();
            if (age != 0) {
                dog1 = new Dog(name, age);
                house1.dogHouse.add(dog1);
            }
        } while (age != 0);
        house1.getDog();
    }
}
