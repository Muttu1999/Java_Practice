package com.honnappa.Collections.list;

import Multithreading.interrupted.interrupted.InterruptrdApp;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        //integers.add(new Integer(20));
        integers.add(10);
        integers.add(30);

        Iterator<Integer> itr =integers.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(integers);
    }
}
