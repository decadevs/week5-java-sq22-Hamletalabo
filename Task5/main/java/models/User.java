package models;

import enums.Gender;
import enums.Role;

public class User {
    private  String name;
    private  int age;
    private  Gender gender;
    private  Role role;

    public User(String name, int age, Gender gender, Role role) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }
}
