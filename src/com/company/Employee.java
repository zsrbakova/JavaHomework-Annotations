package com.company;

public class Employee {
     int ID;
     String name;
     String surname;
     int dailyАllowance;
     int workingDays;
     int bonuses;

     public Employee()
     {

     }
    public Employee(int ID,String name,String surname,int dailyАllowance,int workingDays,int bonuses)
    {
        this.ID=ID;
        this.name=name;
        this.surname=surname;
        this.dailyАllowance=dailyАllowance;
        this.workingDays=workingDays;
        this.bonuses=bonuses;


    }

    public int getdailyАllowance() {
        return dailyАllowance;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public int getBonuses() {
        return bonuses;
    }

    @Deprecated
    /**
     @deprecated Use the new method NewSallaryCalculation instead.
     */
    public int SallaryCalculation(int dailyАllowance,int workingDays)
    {
        return (dailyАllowance*workingDays);

    }

    public int NewSallaryCalculation(int dailyАllowance,int workingDays,int bonuses)
    {
        int total=(dailyАllowance*workingDays)+bonuses;
        return total;

    }
}
