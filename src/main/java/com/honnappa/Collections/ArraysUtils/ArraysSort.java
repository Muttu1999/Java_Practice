package com.honnappa.Collections.ArraysUtils;

import java.util.Arrays;
import java.util.List;

public class ArraysSort {
    public static void main(String[] args) {

        int[] a = {40,10,15,7};

        System.out.println("Before sort");
        for (int eachelement: a){
            System.out.println(eachelement);
        }
        Arrays.sort(a);

        System.out.println("After sorting");
        for (int eachEement : a){
            System.out.println(eachEement);
        }

        String[] s = {"v", "A", "z","P"};

        Arrays.sort(s,new MyComparator());

        for (String eachString : s){
            System.out.println(eachString);
        }

        List<String> list = Arrays.asList(s);
        s[1]= "Y";
        list.add("0");
        System.out.println(list);
    }

}
