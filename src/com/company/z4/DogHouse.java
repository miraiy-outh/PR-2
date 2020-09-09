package com.company.z4;

import java.util.ArrayList;
public class DogHouse {
    ArrayList <Dog> dogHouse = new ArrayList();
    void getDog() {
        for (int i = 0; i < dogHouse.size(); i++) {
            System.out.println(dogHouse.get(i) + " ");
        }
    }
}
