package com.honnappa.IMDApp;

public class IMDApp {
    public static void main(String[] args) {
        String actorName = "Tom Cruice";
        int yearOfBirth = 1962;
        int age = 2020-yearOfBirth;

        String[] movieTitels={
                "The last Summer","Minority Report","Top Gun",
                "Rain Man","The Mummy","American Made"
        };
        float[] moviRatings ={
                7.7F,7.6F,6.9f,
                8.0F,5.9F,7.1F
        };

        System.out.println("Actor name: " +actorName);
        System.out.println("Born: "+ yearOfBirth + "(" + age +"Years old)");


        System.out.println("Movies");

        for (int i = 0; i<movieTitels.length; i++){
            System.out.println(movieTitels[i] + " - " +getRating(moviRatings[i]));

        }
    }
    static String getRating(float rating){
        if (rating<=5.0){
            return "bad";
        }else if (rating>5.0 && rating <=6.5){
            return "average";
        } else if (rating >6.5 && rating<=7.0) {
            return "Good";
        } else if (rating>7.0 && rating<=8.0) {
            return "very good";
        }else {
            return "amazing";
        }
    }
}
