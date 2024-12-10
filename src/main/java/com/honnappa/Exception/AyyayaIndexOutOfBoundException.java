package com.honnappa.Exception;

import java.util.logging.Logger;

public class AyyayaIndexOutOfBoundException {
    private static Logger logger = Logger.getLogger(AyyayaIndexOutOfBoundException.class.getName());

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5,};
            System.out.println(numbers[4]);
        } catch (Exception exception) {
            logger.severe("Invalid array index. please enter proper index value");
        }
    }
}