package com.honnappa.MultiThreading;

public class PriorityExapmle implements Runnable{

    private final String name;

    public PriorityExapmle(String name){
        this.name=name;

    }
    @Override
    public void run() {
        for (int i = 1; i<5; i++){
            System.out.println(name + "- count : " + i + ", priority : "+Thread.currentThread().getPriority());
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}
