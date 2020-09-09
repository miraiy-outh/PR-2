package com.company.z4;

public class Dog {
    String name;
    int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return this.age;
    }
    int humanAge() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
