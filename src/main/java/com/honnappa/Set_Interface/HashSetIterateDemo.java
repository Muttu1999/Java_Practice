package com.honnappa.Set_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterateDemo {

    public static void main(String[] args) {

        //superpowers and their abiliiities unique abilities
        Set<String> superPowers = new HashSet<>();
        superPowers.add("Invisibility");
        superPowers.add("Teleportation");
        superPowers.add("Mind Reading");
        superPowers.add("super sytength");
        superPowers.add("Time travel");

        //viilians and their mischevious powers
        superPowers.add("Laser vision");
        superPowers.add("weather manipulation");
        superPowers.add("Telikness");
        superPowers.add("shape shiofting");
        superPowers.add("chaos induction");

        for (String superPower:superPowers){
            System.out.println(superPower.toUpperCase());
        }

        Iterator<String> iterator = superPowers.iterator();

        while (iterator.hasNext()){
            String superPower = iterator.next();
            System.out.println(superPower.toLowerCase());
        }
    }
}
