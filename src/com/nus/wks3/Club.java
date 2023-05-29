package com.nus.wks3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Cooper Liu
 * @Description:
 * @Date: Created at 10:52 2023/5/29
 * @Modified by:
 */
public class Club {
    private int currentNumber;
    private List<Member> members;

    public Club() {
        this.currentNumber = 1;
        this.members = new ArrayList<>();
    }

    public Member addMember(String surName, String firstName) {
        Member member = new Member(surName, firstName, currentNumber);
        members.add(member);
        this.currentNumber += 1;
        return member;
    }

    public Member addMember(String surName, String firstName, String secondName) {
        Member member = new Member(surName, firstName, secondName, currentNumber);
        members.add(member);
        this.currentNumber += 1;
        return member;
    }

    public void showMember() {
        for (Member member: members) {
            member.show();
        }
    }

    public int removeMembers(int memberNumber) {
        for (Member member: members) {
           if (member.getMemberNumber() == memberNumber) {
               this.members.remove(member);
               return 0;
           }
        }
        return 1; // removal failed
    }

}
