package com.honnappa.Collections.maps;

import java.util.Map;
import java.util.WeakHashMap;

public class WeekHasMap {

    public static void main(String[] args) throws InterruptedException {

        Map<User, String> map = new WeakHashMap<>();

        User u = new User();
        map.put(u, "Tom");

        System.out.println(map);

        u=null;

        System.gc();

        Thread.sleep(50000);

        System.out.println(map);

    }
}
