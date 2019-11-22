package com.company;

public class Person {
    private final Integer age;
    private final String gender;

    public Person(Integer age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public static boolean isAdult(Person person) {
        return (person.gender.equals("w") && (person.age > 15)) || (person.gender.equals("m") && (person.age > 35));
    }
}
