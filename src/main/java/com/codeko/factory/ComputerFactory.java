package com.codeko.factory;

import com.codeko.factory.dto.Computer;
import com.codeko.factory.dto.PC;
import com.codeko.factory.dto.Server;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
        return null;
    }
}
