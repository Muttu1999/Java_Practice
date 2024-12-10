package com.honnappa.FunctionalInterFace;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> converAndDisplay = input-> System.out.println(input.toUpperCase());
        converAndDisplay.accept("Honnappa Kamatar");


        Consumer<Integer> squreOff = num-> System.out.println(num*num);
        List<Integer> numberOfList = Arrays.asList(1,2,3,4,5,67);
        numberOfList.forEach(squreOff);

        Consumer<String> appendInput = input-> System.out.println("New value after appending in HELLO " + input);
        appendInput.andThen(converAndDisplay).accept("Lambda Expression");
    }
}
