package com.nus.wks3;

/**
 * @Author: Cooper Liu
 * @Description:
 * @Date: Created at 14:34 2023/5/26
 * @Modified by:
 */
public class Person {

    private String surName;
    private String firstName;
    private String secondName;

    public Person(String surName, String firstName) {
        this.surName = surName;
        this.firstName = firstName;
    }

    public Person(String surName, String firstName, String secondName) {
        this.surName = surName;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        if (secondName == null) {
            return (surName + " " + firstName);
        }
        else {
            return (surName + " " + firstName + " " + secondName);
        }
    }

    public void show() {
        System.out.println(this.toString());
    }
}
