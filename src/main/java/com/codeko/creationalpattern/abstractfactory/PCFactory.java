package com.codeko.creationalpattern.abstractfactory;

import com.codeko.creationalpattern.factory.dto.Computer;
import com.codeko.creationalpattern.factory.dto.PC;

public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }


    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
