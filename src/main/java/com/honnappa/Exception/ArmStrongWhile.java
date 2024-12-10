package com.honnappa.Exception;

public class ArmStrongWhile {

    public static void main(String[] args) {

        int i =100, result;
        System.out.println("Armstrong numbers between 100 to 999");
        while (i<1000) {
            result = armstrongOrNot(i);
            if (result == i)
                System.out.println(i);
            i++;

        }
    }

    static int armstrongOrNot(int numm){
        int digit, sum=0;
        while (numm!=0){
            digit=numm%10;
            sum=sum+(digit*digit*digit);
            numm/=10;
        }
        return sum;
    }
}
