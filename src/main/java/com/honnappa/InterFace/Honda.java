package com.honnappa.InterFace;

public class Honda implements Car,DriverLes{

    @Override
    public void siteDownRealax() {


    }

    @Override
    public void go() {
        System.out.println("Inside Honda Stop");

    }

    @Override
    public void stop() {
        System.out.println("Inside Honda Go");
    }
}
