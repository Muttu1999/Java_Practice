package com.honnappa.arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[5];

        lotteryNumbers[0] =17;
        lotteryNumbers[1] =23;
        lotteryNumbers[2]=67;
        lotteryNumbers[3]=37;
        lotteryNumbers[4]=11;


        for (int lotterNumber :lotteryNumbers){
            System.out.println(lotterNumber);
        }

        int[][] weekLotterNumbers = {
                {1,2,3,4,5},
                {10,20,30,40,50},
                {13,24,35,46,57},
                {10,23,35,48,58}
        };

        for (int i = 0;i<weekLotterNumbers.length;i++){
            for (int j=0;j<weekLotterNumbers[i].length;j++){
                System.out.print(weekLotterNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
