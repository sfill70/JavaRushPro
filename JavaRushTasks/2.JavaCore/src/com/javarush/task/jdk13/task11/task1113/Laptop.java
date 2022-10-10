package com.javarush.task.jdk13.task11.task1113;

public class Laptop {
    private final String name;
    private final OperationSystem os;

    public Laptop(String laptopName, String osName, String version) {
        this.name = laptopName;
        this.os = new OperationSystem(osName,version);
    }

    public String getName() {
        return name;
    }

    public void updateOs(String version) {
        this.os.setVersion(version);
    }

    public void printInfo() {
        System.out.println(name + " - " + os.getName() + os.getVersion());
    }
}
