package com.kodilla.abstracts.Homework;

public abstract class Job {
    private int Salary;
    private String Responsibilities;

    public Job(int Salary) {
        this.Salary = Salary;
    }

    public int getSalary() {
        return Salary;
    }
    public Job(String Responsibilities){
        this.Responsibilities = Responsibilities;
    }
    public String getResponsibilities(){
        return Responsibilities;
    }
}
