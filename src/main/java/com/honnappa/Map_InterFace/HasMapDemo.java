package com.honnappa.Map_InterFace;

import java.util.HashMap;

public class HasMapDemo {
    public static void main(String[] args) {
        var countryMap = new  HashMap<String,String>();
        countryMap.put("India","New Delhi");
        countryMap.put("USA","WEashing Dc");
        countryMap.put("France","Paris");
        countryMap.put(null,null);

        System.out.println(countryMap.get("India"));
        countryMap.remove(null);
        System.out.println(countryMap.size());
    }
}
