package com.nus.wks3;

/**
 * @Author: Cooper Liu
 * @Description:
 * @Date: Created at 14:34 2023/5/26
 * @Modified by:
 */
public class ClubApplication {
    public static void main(String[] args) {
//        Member person = new Member("Tan", "Ah", "Beng", 1);
//        Member person2 = new Member("Stan", "Laurel", 2);
        Club club = new Club();
        Member member = club.addMember("Tan", "Ah", "Beng");
        Member member2 = club.addMember("Stan", "Laurel");
//        member.show();
//        member2.show();
        club.showMember();
        System.out.println("-------------removing member 1------------");
        System.out.println("removal status: " + club.removeMembers(1));
        club.showMember();

//        Facility facility = new Facility("Fac", "demo desc");
//        Facility facility2 = new Facility("Fac");
//        facility.show();
//        facility2.show();
    }
}
