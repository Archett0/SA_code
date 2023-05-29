package com.nus.test;

/**
 * @Author: Cooper Liu
 * @Description:
 * @Date: Created at 14:33 2023/5/29
 * @Modified by:
 */
public class MyFind {

    static <T> boolean exists(T[] target_list, T target) {
        for (T cur : target_list) {
            if (cur.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> T findMax(T item1, T item2, T item3) {
        T max = item1;

        if (item2.compareTo(max) > 0) {
            max = item2;
        }

        if (item3.compareTo(max) > 0) {
            max = item3;
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] tl = new Integer[]{1, 2, 3};
        System.out.println(exists(tl, 5));
        String[] ts = new String[]{"hi", "hello"};
        System.out.println(exists(ts, "hi"));

        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        System.out.println(findMax(account1, account2, account3));
    }
}
