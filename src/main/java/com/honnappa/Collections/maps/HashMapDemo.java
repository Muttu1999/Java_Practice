package com.honnappa.Collections.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("John",70);
        map.put("Tom",60);
        map.put("Lee",99);
        map.put("Brand ",80);


        Set<String> KeySet = map.keySet();
        System.out.println("Keys : " +KeySet);

        Collection<Integer> values =map.values();
        System.out.println("Values :" + values);

        for (String key : KeySet){
            System.out.println("Key : " + key + "Value " + map.get(key));
        }
    }
}
