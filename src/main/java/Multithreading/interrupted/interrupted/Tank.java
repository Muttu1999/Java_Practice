package Multithreading.interrupted.interrupted;

public class Tank {
    private  int capacity;
    private int cuuentLevel=0;

    public Tank(int capacity) {
        this.capacity = capacity;
    }

    public  synchronized void pumpWater(int pumpingRate) throws InterruptedException{
        if (cuuentLevel + pumpingRate >capacity){
            System.out.println("Tank is full. waiting for consumption");
            wait();
        }

        cuuentLevel +=pumpingRate;
        System.out.println("Pumping " + pumpingRate + " liters of watwer . Current level : " + cuuentLevel);

    }

    public synchronized void consumeWater(int amount){
        if(amount <= cuuentLevel){
            cuuentLevel -=amount;
            System.out.println("consumning " + amount + "liters(s) of water . Current level :  " + cuuentLevel);
            notify();
        }
    }
}
