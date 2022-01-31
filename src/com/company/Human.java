package com.company;

import com.company.Animal;

public class Human {
    public String firstName;
    public String lastName;
    public Integer age;
    public Animal pet;
    public Car car;
    public Double salary;

    public Human(String firstName, String lastName, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Animal getPet() {
        return pet;
    }
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            System.out.println("Yyyyy no way - nie zapłacę Ci za to, ze pozwolisz mi pracować (no chyba, że jako pierwsza praca w IT to ok)");
        } else {
            System.out.println("Zapisano w systemie kadrowo-płacowym");
            System.out.println("Odbierz dokumenty z Działu Księgowego lub HR");
            System.out.println("Koniecze instytucje zostały poinformowane o zmianie wynagrodzenia");
            this.salary = salary;
        }
    }
}
