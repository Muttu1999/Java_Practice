package com.honnappa.abstractFactory;

import com.honnappa.abstractFactory.model.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
