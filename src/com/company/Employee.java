package com.company;

public abstract class Employee {
    private String name;
    private int idNumber;

    public Employee(String name, int idNumber ){
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    public abstract double earings();
}
