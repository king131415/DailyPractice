package org.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
