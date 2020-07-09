package com.company;

public class SalaryEmployee extends Employee{
    int salaryMounth;

    public SalaryEmployee(String name, int idNumber, int salaryMounth) {
        super(name, idNumber);
        this.salaryMounth = salaryMounth;
        setSalaryMounth(salaryMounth);
    }

    public int getSalaryMounth() {
        return salaryMounth;
    }

    public void setSalaryMounth(int salaryMounth) {
        if (salaryMounth > 0){
            this.salaryMounth = salaryMounth;
        }else {
            this.salaryMounth = (int) 0;
        }
    }

    @Override
    public double earings() {
        return salaryMounth;
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "salaryMounth=" + salaryMounth +
                ", earings=" + earings() +
                '}';
    }
}
