package com.honnappa.Set_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImutableSetDemo {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(Arrays.asList("a","b","c","d"));
        stringSet= Collections.unmodifiableSet(stringSet);

        Set<String > stringSet1 =Set.of("a","b","c");
        processSet(stringSet1);
    }
    public static void processSet(Set<String > stringSet){
        for (String element:stringSet){
            System.out.println(element.toUpperCase());
        }
    }
}
