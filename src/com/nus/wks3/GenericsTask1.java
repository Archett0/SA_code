package com.nus.wks3;

/**
 * @Author: Cooper Liu
 * @Description:
 * @Date: Created at 15:39 2023/5/29
 * @Modified by:
 */

import java.util.ArrayList;
import java.util.List;

public class GenericsTask1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        Swap.swap(intList);
        // output must be 2 1
        for (Integer n : intList) {
            System.out.println(n);
        }

        List<String> strList = new ArrayList<>();
        strList.add("First");
        strList.add("Second");

        Swap.swap(strList);
        // output must be Second First
        for (String st : strList) {
            System.out.println(st);
        }
    }
}

class Swap {
    // To do:
    // Write a method swap(), given a list of a generic type,
    // swap the values of the first two elements
    // Use List.get(int index) method to return the element
    // of the given position
    // Use List.set(int index, E element) to replace the
    // element of the given position
    static <T> void swap(List<T> li) {
        T e0 = li.get(0);
        T e1 = li.get(1);
        li.set(0, e1);
        li.set(1, e0);
    }
}
