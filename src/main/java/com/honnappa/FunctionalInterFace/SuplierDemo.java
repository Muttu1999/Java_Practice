package com.honnappa.FunctionalInterFace;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SuplierDemo {

    public static void main(String[] args) {
        Supplier<Integer> getCurrentMonth = () -> LocalDate.now().getMonthValue();
        System.out.println(getCurrentMonth.get());

        Supplier<Integer> getCurrentMonthofMonth = () -> LocalDate.now().getDayOfMonth();
        System.out.println(getCurrentMonthofMonth.get());

        Supplier<String> getCurrentDayName = () ->LocalDate.now().getDayOfWeek().name();
        System.out.println(getCurrentDayName.get());
    }
}
