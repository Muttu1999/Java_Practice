package Multithreading.interrupted.interrupted;

public class Pump extends Thread {
    private Tank tank;
    private int pumpingRate;

    public Pump(Tank tank, int pumpingRate) {
        this.tank = tank;
        this.pumpingRate = pumpingRate;
    }

    @Override
    public void run() {
        while (!interrupted()){

            try {
                tank.pumpWater(pumpingRate);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + "thred interrupted. stopping pumping.");
                interrupted();
            }
        }
    }
}
