package com.company;

public class HourlyEmployee extends Employee{

    private int hourlyWage;
    private int hourWorkes;

    public HourlyEmployee(String name, int idNumber, int hourlyWage , int hourWorkes) {
        super(name, idNumber);
        setHourlyWage(hourlyWage);
        setHourWorkes(hourWorkes);
    }

    public int getHourlyWage() {

        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
       if (hourlyWage > 0){
           this.hourlyWage = hourlyWage;
       }else {
           this.hourlyWage =  0;
       }
    }

    public int getHourWorkes() {
        return hourWorkes;
    }

    public void setHourWorkes(int hourWorkes) {
        if (hourWorkes > 0){
            this.hourWorkes = hourlyWage;
        }else {
            this.hourWorkes = 0;
        }
    }


    @Override
    public double earings() {
        return hourlyWage * hourWorkes;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", hourWorkes=" + hourWorkes +
                ", earings=" + earings() +
                '}';
    }
}
