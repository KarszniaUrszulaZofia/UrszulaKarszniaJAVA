package com.company.creatures;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;

public class Human extends Animal{
    private static final int DEFAULT_GARAGE_SIZE = 10;
    public String firstName;
    public String lastName;
    public Integer age;
    public Animal pet;
    public Car[] garage;
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
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
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

    public Car getCar(Integer space) {
        return garage[space];

    public void setCar(Car car, Integer space) {
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

        public boolean hasCar(Car newCar) {
            for (Car car : this.garage) {
                if (car != null && car.equals(newCar)) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFreeSpace() {
            for (Car car : this.garage) {
                if (car != null) {
                    return true;
                }
            }
            return false;
        }

        public void removeCar(Car car) {
            for(int i = 0; i < this.garage.length; i++){
                if(this.garage[i] == car){
                    this.garage[i] = null;
                    i = this.garage.length;
                    System.out.println("Usunieto auto " + car + " z garazu");
                }else{
                    System.out.println("Nie masz takiego auta w garazu");
                }
            }
        }

        public void addCar(Car car) {
            Integer space = 0;
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = car;
                    System.out.println("Dodano auto do garazu na miejsce nr: " + i);
                    i = this.garage.length;
                }else{
                    if(i == this.garage.length - 1){
                        System.out.println("Nie masz miejsca w garazu");
                    }
                }
            }

        }

        public Double getGarageValue(){
            Double totalValue = 0.0;
            for (Car car : this.garage) {
                if (car != null) {
                    totalValue += car.value;
                }
            }
            System.out.println("Łączna wartość aut w garazu:");
            return totalValue;
        }

    }