package com.codeko.creationalpattern.abstractfactory;

import com.codeko.creationalpattern.factory.dto.Computer;

public class TestAbstractFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2,9 GHz"));
        System.out.println("Factory PC Config " + pc.toString());
        System.out.println("Factory Server Config " + server.toString());
    }
}
