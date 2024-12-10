package com.honnappa.abstractFactory;

import com.honnappa.abstractFactory.model.Computer;
import com.honnappa.abstractFactory.model.Server;

public class SaveFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;


    public SaveFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }


    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}
