package com.codeko.creationalpattern.abstractfactory;

import com.codeko.creationalpattern.factory.dto.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }

}
