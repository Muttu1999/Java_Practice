package com.honnappa.Collections.maps;

import Multithreading.interrupted.interrupted.InterruptrdApp;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHasMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new IdentityHashMap<>();
        int x = 10;
        Integer id1 = 10;
        Integer id2=10;
        map.put(id1,"Bharath");
        map.put(id2,"Sarath");

        System.out.println(map);
    }
}
