package com.nus.wks2;

/**
 * @Author: Cooper Liu
 * @Description:
 * @Date: Created at 14:34 2023/5/26
 * @Modified by:
 */
public class ClubApplication {
    public static void main(String[] args) {
        Person person = new Person("Tan", "Ah", "Beng");
        Person person2 = new Person("Stan", "Laurel");
        person.show();
        person2.show();

        Facility facility = new Facility("Fac", "demo desc");
        Facility facility2 = new Facility("Fac");
        facility.show();
        facility2.show();
    }
}
