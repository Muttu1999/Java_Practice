package com.honnappa.Set_Interface;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("India");
        treeSet.add("USA");
        treeSet.add("Germany");


        System.out.println(treeSet);
        treeSet.remove("Germany");
        System.out.println("Treeset after Removal " +treeSet);
        System.out.println("size of treeset : " +treeSet.size());
        System.out.println("Is indi preset in ytreset :" +treeSet.contains("India"));
        System.out.println("First element of treeset : " +treeSet.first());
        System.out.println("Last element of the tree set : " +treeSet.last());
    }
}
