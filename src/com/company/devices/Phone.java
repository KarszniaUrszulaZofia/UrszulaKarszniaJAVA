package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {
    private static final String DEFAULT_APP_VERSION = "latest";
    private static final String DEFAULT_APP_SERVER = "server.app.com";
    private static final int DEFAULT_PORT_SERVER = 8;
    private static final String DEFAULT_PROTOCOL_SERVER = "https";
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
    public void installAnApp(List<String> appNames){
        System.out.println("Instalowanie aplikacji z listy");
        for(String appName : appNames){
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName){
        System.out.println("Instalowanie aplikacji wedlug nazwy: " + appName);
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }
    public void installAnApp(String appName, String version){
        System.out.println("Instalowanie aplikacji wedlug nazwy: " + appName + " i wersji: " + version);
        this.installAnApp(appName, version, DEFAULT_APP_SERVER);
    }
    public void installAnApp(String appName, String version, String server){
        System.out.println("Instalowanie aplikacji wedlug nazwy: " + appName + " oraz wersji: " + version + " z serwera: " + server);
        try {
            URL url = new URL(DEFAULT_PROTOCOL_SERVER, server, DEFAULT_PORT_SERVER, appName + "-" + version);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url){
        System.out.println("Sprawdzanie docelowego adresu");
        System.out.println("Sprawdzanie rozmiaru aplikacji");
        System.out.println("Sprawdzanie dostępnego miejsca na telefonie");
        System.out.println("Obsługa platnosci");
        System.out.println("Pobranie aplikacji");
        System.out.println("Rozpakowanie aplikacji");
        System.out.println("Instalacja");
    }
}
