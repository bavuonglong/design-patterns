package com.codeko.creationalpattern.factory.dto;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("Ram=");
        sb.append(getRAM());
        sb.append(", HDD=");
        sb.append(getHDD());
        sb.append(", CPU=");
        sb.append(getCPU());
        sb.append('}');
        return sb.toString();
    }
}
