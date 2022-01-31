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
        if (space != null) {
            return garage[space];
        } else {
            return null;
        }
    }

    public void setCar(Car car, Integer space) {
        if (salary > car.value) {
            if (garage[space] != null) {
                this.garage[space] = car;
                System.out.println("No i cyk, bez kredytu, za gotóweczkę auto wjechało!");
            } else {
                System.out.println("To miejsce w garazu jest juz zajete przez inne auto");
            }
        } else if (salary > (car.value / 12)) {
            if (garage[space] != null) {
                this.garage[space] = car;
                System.out.println("Może i na kredyt ale auto jest!");
            } else {
                System.out.println("To miejsce w garazu jest juz zajete przez inne auto");
            }
        } else {
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
    public boolean hasFreeSpace() {
        int counterSpace = DEFAULT_GARAGE_SIZE;
        for (Car car : this.garage) {
            if (car != null) {
                counterSpace -= 1;
            }
        }
        return counterSpace != 0;
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
    public void carList() {
        int counter = 0;
        System.out.println("Lista samochodów w garazu, " + firstName);
        for (Car car : garage) {
            if (car != null) {
                counter += 1;
            }
        }
        if (counter > 0) {
            for (int i = 0; i < garage.length; i++) {
                if (this.garage[i] != null) {
                    System.out.println(garage[i]);
                } else {
                    System.out.println("Puste miejsce nr." + i);
                }
            }
        } else {
            System.out.println("Nie masz aut w garazu");
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
    public void sortCars() {
        Car temp;
        int carNumberCounter = 0;
        Car[] temporaryGarage = new Car[DEFAULT_GARAGE_SIZE];
        for (Car car : garage) {
            if (car != null) {
                carNumberCounter += 1;
            }
        }
        int arrayCounter = 0;
        Integer[] tempArray = new Integer[carNumberCounter];
        for (Car car : garage) {
            if (car != null) {
                tempArray[arrayCounter] = car.yearOfProduction;
                arrayCounter += 1;
            }
        }
        Arrays.sort(tempArray);
        for(int i = 0; i < tempArray.length; i++){
            for (Car car : garage) {
                if (car != null && Objects.equals(tempArray[i], car.yearOfProduction)) {
                    temp = car;
                    temporaryGarage[i] = temp;
                }
            }
        }
        garage = temporaryGarage;
    }
}

    }