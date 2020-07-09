package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HourlyEmployee hourlyEmployee = new HourlyEmployee("omar", 231654, 15, 50);
        SalaryEmployee salaryEmployee = new SalaryEmployee("ayman", 231654, 2000);
        
        System.out.println(hourlyEmployee.toString());
        System.out.println(salaryEmployee.toString());
    }
}
