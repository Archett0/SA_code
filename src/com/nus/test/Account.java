package com.nus.test;

/**
 * @Author: Cooper Liu
 * @Description:
 * @Date: Created at 14:18 2023/5/26
 * @Modified by:
 */
public class Account implements Comparable<Account>{
    private String number;
    private double balance;

    @Override
    public boolean equals(Object obj) {
        // TODO: Can write this way
        if (!(obj instanceof Account)) {
//        if (obj.getClass() == Account.class) {
            Account anotherAcc = (Account)obj;
            return this.number.equals(anotherAcc.number);
        }
        else {
            return false;
        }
    }

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public Account() {
        this ("", 0);
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(String acc, double bal) {
        if (!acc.equals(this.number)) {
            return;
        }
        if (bal > 0.0) {
            this.balance += bal;
        }
    }


    @Override
    public int compareTo(Account o) {
        return 0;
    }
}
