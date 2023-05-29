package com.nus.wks2;

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

    public void show() {
        if (description == null) {
            System.out.println(name);
        }
        else {
            System.out.println(name + ": \"" + description + "\"");
        }
    }
}
