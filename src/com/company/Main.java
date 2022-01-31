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
        Phone motorola = new Phone("Motorola", "Moto G5 Play", 2021, 6.5, 8)

        Human student = new Human();
        Human teacher = new Human();
        Human profesor = new Human();

        Applications github = new Applications("GitHub", "1.1", 150.0);
        Applications sleepAsAndroid = new Applications("SleepAsAndroid", "1.2", 110.0);
        Applications facebook = new Applications("Facebook", "1.3", 1.0);
        Applications maps = new Applications("Google Maps", "2.0", 0.0);

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

        System.out.println("Hajs studenta przed zakupem i instalacją aplikacji" + student.cash + " PLN");
        iphone.installAnApp(student, github);
        System.out.println("Hajs studenta po zakupie i instalacji aplikacji " + student.cash + " PLN");
        System.out.println("------------------------------");
        System.out.println("Czy aplikacja " + sleepAsAndroid.name + "jest zainstalowana? " + iphone.appIsInstalled(sleepAsAndroid));
        System.out.println("Czy aplikacja " + github.name + "jest zainstalowana? " + iphone.appIsInstalled(github));
        System.out.println("Czy aplikacja " + sleepAsAndroid.name + "jest zainstalowana? " + iphone.appIsInstalled(sleepAsAndroid.name));
        System.out.println("Czy aplikacja " + maps.name + "jest zainstalowana? " + iphone.appIsInstalled(maps.name));
        iphone.allFreeApps();
        iphone.installAnApp(student, maps);
        iphone.allFreeApps();
        System.out.println("Koszt wszystkich zainstalowanych aplikacji: " + iphone.valueInstalledApps() + " PLN");
        iphone.installAnApp(student, github);
        iphone.installAnApp(student, facebook);
        iphone.allInstalledAppNames();
        iphone.allInstalledAppCheapest();
        motorola.installAnApp(teacher, github);
        motorola.installAnApp(teacher, sleepAsAndroid);

