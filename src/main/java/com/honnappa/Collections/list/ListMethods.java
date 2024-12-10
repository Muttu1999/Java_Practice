package com.honnappa.Collections.list;

import Multithreading.interrupted.interrupted.InterruptrdApp;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i = 10; i<= 100; i++){
            list.add(i);
        }

        System.out.println("List : " + list);

        list.add(2,100);
        System.out.println("List aftyer insert : " + list);

        list.set(3,200);
        System.out.println("List after replacement : " +list);

        List<Integer> secondlIST = new ArrayList<>();
        secondlIST.add(111);
        secondlIST.add(222);
        secondlIST.add(333);


        System.out.println("Second List : " + secondlIST);

        list.addAll(4,secondlIST);

        System.out.println("First List " + list);

        if(list.contains(222)){
            System.out.println("List has the value");
        }else{
            System.out.println("List does not have value");
        }


        System.out.println("Elements ion the list are :");
            for (int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }

            list.remove(3);
        System.out.println("List after deletion " + list);


    }
}
