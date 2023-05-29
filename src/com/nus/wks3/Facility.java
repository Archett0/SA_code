package com.nus.wks3;

/**
 * @Author: Cooper Liu
 * @Description:
 * @Date: Created at 14:35 2023/5/26
 * @Modified by:
 */
public class Facility {

    private String name;
    private String description;

    public Facility(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Facility(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        if (description == null) {
            return (name);
        }
        else {
            return (name + ": \"" + description + "\"");
        }
    }

    public void show() {
        System.out.println(this.toString());
    }
}
