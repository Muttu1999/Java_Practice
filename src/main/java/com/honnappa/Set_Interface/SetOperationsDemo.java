package com.honnappa.Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(7);
        hashSet1.add(4);
        hashSet1.add(1);

        Set<Integer> hashSet2 =  new HashSet<>();
        hashSet2.add(1);
        hashSet2.add(7);
        //hashSet2.add(7);

        boolean isSubset = hashSet1.containsAll(hashSet2);
        System.out.println(isSubset);
        System.out.println(hashSet1);
        System.out.println(hashSet2);


    }
}
