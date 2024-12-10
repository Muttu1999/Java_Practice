package com.honnappa.Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> visitedCountries = new HashSet<>();
        visitedCountries.add("India");
        visitedCountries.add("USA");
        visitedCountries.add("Dubhai");
        visitedCountries.add("Singapore");
        visitedCountries.add("France");
        visitedCountries.add("India");

        System.out.println(visitedCountries.size());
        System.out.println(visitedCountries);
        boolean germany = visitedCountries.contains("Germany");
        System.out.println(germany);

        boolean singapore = visitedCountries.remove("Singapore");
        System.out.println(singapore);

        System.out.println(visitedCountries);


    }
}
