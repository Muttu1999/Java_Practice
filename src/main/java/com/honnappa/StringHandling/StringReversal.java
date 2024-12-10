package com.honnappa.StringHandling;

public class StringReversal {

    public  String firstWay(String actual) {
        String reversed = "";
        for (int i =actual.length();i>0; i--){
            reversed+=actual.charAt(i-1);
        }
        return reversed ;
    }
}
