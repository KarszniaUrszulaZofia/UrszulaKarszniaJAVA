package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Diesel opel = new Diesel("Opel", "Astra", 1999, "Silver");
        Electric tesla = new Electric("Tesla", "v1", 2020, "Red");
        LPG vwagen = new LPG("Volkswagen", "golf 4", 2000, "Black");
        Phone iphone = new Phone("Apple", "ios", 2020, 5.3, 8);

        Human student = new Human();
        Human teacher = new Human();
        Human profesor = new Human();
        opel.value = 10000.00;
        tesla.value = 100000.00;
        vwagen.value = 1000.00;
        student.firstName = "Urszula";
        student.lastName = "Karsznia";
        student.age = 32;
        teacher.firstName = "Łukasz";
        teacher.lastName = "Karsznia";
        teacher.age = 30;
        profesor.firstName = "Tadeusz";
        profesor.lastName = "Riedl";
        profesor.age = 83;
        student.cash = 1000.00;
        teacher.cash = 100000.00;
        profesor.cash = 10000000000.00;
        student.salary = 10000.00;
        teacher.salary = 1000000.00;
        profesor.salary = 1000000.00;
        System.out.println("-----------------------");
        student.addCar(opel);
        opel.carOwners();
        System.out.println("-----------------------");
        student.setCar(opel, 1);
        opel.carOwners();
        System.out.println("-----------------------");
        opel.Sale(student, teacher, 100.0);
        opel.carOwners();
        System.out.println("-----------------------");
        student.addCar(opel);
        opel.Sale(student, teacher, 100.0);
        System.out.println("-----------------------");
        System.out.println("Czy auto było wcześniej na kogoś zarejestrowane? " + opel.checkOwners());
        System.out.println("Czy auto było wcześniej na kogoś zarejestrowane? " + tesla.checkOwners());
        System.out.println("-----------------------");
        System.out.println("Łączna liczba transakcji dla tego auta to: " + opel.transactionCount());
        System.out.println("-----------------------");
        System.out.println("Sprawdzanie, czy kiedykolwiek nastąpiła sprzedaż na linii student - nauczyciel?" + opel.checkSelling(student, teacher));
        System.out.println("Sprawdzanie, czy kiedykolwiek nastąpiła sprzedaż na linii nauczyciel - student? " + opel.checkSelling(teacher, student));
        System.out.println("Sprawdzanie, czy kiedykolwiek nastąpiła sprzedaż na linii nauczyciel - profesor?" + opel.checkSelling(teacher, profesor));
        System.out.println("Sprawdzanie, czy kiedykolwiek nastąpiła sprzedaż na linii profesor - nauczyciel?" + opel.checkSelling(profesor, teacher));
        System.out.println("Sprawdzanie, czy kiedykolwiek nastąpiła sprzedaż na linii student - profesor?" + opel.checkSelling(student, profesor));
        System.out.println("Sprawdzanie, czy kiedykolwiek nastąpiła sprzedaż na linii profesor - student?" + opel.checkSelling(profesor, student));
