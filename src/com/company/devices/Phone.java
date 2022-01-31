package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {
    public Double screenSize;
    public String OS;
    public Integer ramSize;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Integer ramSize){
        super(producer, model, yearOfProduction, "white");
        this.screenSize = 0.0;
        this.ramSize = 0;
        this.OS = "Not assigned";
    }

    @Override
    public void turnOn() {
        System.out.println("Włączanie..");
        System.out.println("Czarny ekran");
        System.out.println("Inicjalizacja systemu i charakterystyczny dźwięk systemu..");
        System.out.println("Czekaj...");
        System.out.println("Czekaj...");
        System.out.println("Czekaj...");
        System.out.println("Urządzenie zostało uruchomione a na ekranie pojawiła się prośba o hasło!");
    }

    @Override
    public void Sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price){
            System.out.println("Nie stać Cię");
        } else if (seller.mobile != this){
            System.out.println("Nie ładnie sprzedawać coś, czego się nie ma.. OSZUŚCIE!");
        } else{
            seller.cash += price;
            buyer.cash -= price;
            seller.mobile = null;
            buyer.mobile = this;
            System.out.println("Udało Ci się sprzedać telefon za " + price + " PLN");
        }
    }

    @Override
    public String toString(){
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                ", os='" + OS + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
