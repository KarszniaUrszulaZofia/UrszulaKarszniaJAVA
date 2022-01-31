package com.company.creatures;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal{
    public String firstName;
    public String lastName;
    public Integer age;
    public Animal pet;
    public Car car;
    public Phone mobile;
    public Double salary;
    public Double cash;


    public Human(){
        super("homo sapiens");
        this.firstName = "";
        this.lastName = "lastName";
        this.age = 0;
        this.salary = 0.0;
        this.cash = 0.0;
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
        if(salary <= 0){
            System.out.println("Yyyyy no way - nie zapłacę Ci za to, ze pozwolisz mi pracować (no chyba, że jako pierwsza praca w IT to ok)");
        }else{
            System.out.println("Zapisano w systemie kadrowo-płacowym");
            System.out.println("Odbierz dokumenty z Działu Księgowego lub HR");
            System.out.println("Koniecze instytucje zostały poinformowane o zmianie wynagrodzenia");
            this.salary = salary;
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(salary > car.value){
            this.car = car;
            System.out.println("No i cyk, bez kredytu, za gotóweczkę auto wjechało!");
        }else if(salary > (car.value / 12)){
            this.car = car;
            System.out.println("Może i na kredyt ale auto jest!");
        }else{
            System.out.println("Buahahaha jesteś za biedny, powiedz marzeniom o aucie bye bye");
        }
    }

    public String toString(){
        return "Imie: " + firstName + " Nazwisko: " + lastName + " Wiek: " + age;
    }
}