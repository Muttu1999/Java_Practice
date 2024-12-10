package com.honnappa.Set_Interface;

import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        var visitedcountries = new LinkedHashSet<String>();
        visitedcountries.add("India");
        visitedcountries.add("Usa");
        visitedcountries.add("Dubhai");
        visitedcountries.add("Singapore");
        visitedcountries.add("France");


        for (String Name : visitedcountries){
            System.out.println(Name);
        }
        SequencedSet<String> reversedVsitedCountries = visitedcountries.reversed();
        System.out.println(reversedVsitedCountries);
    }
}
