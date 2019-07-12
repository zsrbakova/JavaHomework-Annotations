package com.company;

public class Main {

    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Employee e = new Employee(1,"Ana","Stojanova",1300,20,5000);

        System.out.println(e.SallaryCalculation(e.getdailyАllowance(),e.getWorkingDays()));
        System.out.println(e.NewSallaryCalculation(e.getdailyАllowance(),e.getWorkingDays(),e.getBonuses()));
	// write your code here
    }
}
