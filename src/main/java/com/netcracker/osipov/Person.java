package com.netcracker.osipov;

import java.time.LocalDate;

public class Person {

    private Integer id;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private Integer age;

    public Person(Integer id, String name, String surname, LocalDate birthdate, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthday(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /** Here I will make getters and setters
         */
    }
}
