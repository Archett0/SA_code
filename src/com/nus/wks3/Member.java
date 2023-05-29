package com.nus.wks3;

/**
 * @Author: Cooper Liu
 * @Description:
 * @Date: Created at 10:32 2023/5/29
 * @Modified by:
 */
public class Member extends Person{
    private int memberNumber;

    public Member(String surName, String firstName, int memberNumber) {
        super(surName, firstName);
        this.memberNumber = memberNumber;
    }

    public Member(String surName, String firstName, String secondName, int memberNumber) {
        super(surName, firstName, secondName);
        this.memberNumber = memberNumber;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "; Member Number: " + getMemberNumber();
    }

    public void show() {
        System.out.println("Member Name: " + this.toString());
    }
}
