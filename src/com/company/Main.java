package com.company;

public class Main {

    public static void main(String[] args) {
	Human student = new Human("Urszula", "Karsznia", 32);
    Human teacher = new Human("Łukasz", "Karsznia", 30);
    Animal dog = new Animal ("piesu");
    Animal dog2 = new Animal("pieseczek");
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.feed();
    System.out.println("----------------------------------------------");
    Animal cat = new Animal("kotecek");
    cat.feed();
    cat.feed();
    cat.feed();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    cat.takeForAWalk();
    System.out.println("----------------------------------------------");
    student.setPet(dog);
    System.out.println(student.getPet().species);
    student.pet.feed();
    student.pet.takeForAWalk();
    System.out.println("----------------------------------------------");
    teacher.setPet(dog2);
    System.out.println(teacher.getPet().species);
    teacher.pet.feed();
    teacher.pet.takeForAWalk();
    System.out.println("----------------------------------------------");

    Car volkswagen = new Car("T-Roc", "Volkswagen", "Magenta", 2021);
    Car trabant = new Car("601", "Trabant", "blue", 1976);
    student.car = trabant;
    teacher.car = volkswagen;
    System.out.println("Imie: " + student.firstName);
    System.out.println("Nazwisko: " + student.lastName);
    System.out.println("Wiek: " + student.age);
    System.out.println("Model auta: " + student.car.model);
    System.out.println("Producent auta: " + student.car.producer);
    System.out.println("Kolor brumbrumka: " + student.car.colour);
    System.out.println("Rok produkcji auta: " + student.car.yearOfProduction);
    System.out.println("-------------------------------------------------------");
    System.out.println("Imie: " + teacher.firstName);
    System.out.println("Nazwisko: " + teacher.lastName);
    System.out.println("Wiek: " + teacher.age);
    System.out.println("Model auta: " + teacher.car.model);
    System.out.println("Producent auta: " + teacher.car.producer);
    System.out.println("Kolor brumbrumka: " + teacher.car.colour);
    System.out.println("Rok produkcji auta: " + teacher.car.yearOfProduction);
    System.out.println("-------------------------------------------------------");
    student.setSalary(0.0);
    System.out.println("---------------------------------------------");
    System.out.println(student.getSalary());
    System.out.println("---------------------------------------------");
    student.setSalary(-1.0);
    System.out.println("---------------------------------------------");
    System.out.println(student.getSalary());
    System.out.println("---------------------------------------------");
    student.setSalary(100.0);
    System.out.println("---------------------------------------------");
    System.out.println(student.getSalary());
    System.out.println("---------------------------------------------");

    }
    }

