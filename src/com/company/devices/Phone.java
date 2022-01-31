package com.company.devices;

import com.company.Applications;
import com.company.creatures.Human;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Phone extends Device {
    private static final String DEFAULT_APP_VERSION = "latest";
    private static final String DEFAULT_APP_SERVER = "server.app.com";
    private static final int DEFAULT_PORT_SERVER = 8;
    private static final String DEFAULT_PROTOCOL_SERVER = "https";
    public Double screenSize;
    public String OS;
    public Integer ramSize;
    public List<Applications> appList;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Integer ramSize){
        super(producer, model, yearOfProduction, "white");
        this.screenSize = 0.0;
        this.ramSize = 0;
        this.OS = "Not assigned";
        this.appList = new ArrayList<>();
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
    public void installAnApp(Human human, Applications appName){
        if(human.cash > appName.price){
            if(appList.contains(appName)){
                System.out.println("Ta aplikacja jest juz zainstalowana - " + appName.name);
            }else {
                appList.add(appName);
                human.cash -= appName.price;
                System.out.println("==================");
                System.out.println("Sprawdzanie docelowego adresu");
                System.out.println("Sprawdzanie rozmiaru aplikacji");
                System.out.println("Sprawdzanie dostępnego miejsca na telefonie");
                System.out.println("Obsługa platnosci");
                System.out.println("Pobranie aplikacji");
                System.out.println("Rozpakowanie aplikacji");
                System.out.println("Instalacja aplikacji " + appName.name);
                System.out.println("==================");
                appName.appIsInstalled = true;
            }
    }
}
    public boolean appIsInstalled(Applications appName){
        return appName.appIsInstalled;
    }
    public boolean appIsInstalled(String appName){
        for (Applications app: appList) {
            if(Objects.equals(app.name, appName) && app.appIsInstalled){
                return true;
            }
        }
        return false;
    }

    public void allFreeApps(){
        System.out.println("Lista aplikacji za darmo");
        int counter = 0;
        for (Applications app:appList) {
            if(app.price == 0.0){
                System.out.println("1) " + app);
                counter += 1;
            }
        }
        if(counter == 0){
            System.out.println("Brak bezpłatnych aplikacji");
        }
    }

    public Double valueInstalledApps(){
        double value = 0.0;
        for (Applications app:appList) {
            if(app.appIsInstalled){
                value += app.price;
            }
        }
        return value;
    }


    public void allInstalledAppNames(){
        System.out.println("Lista aplikacji w kolejnosci alfabetycznej: ");
        String[] tempNames = new String[appList.size()];
        int counter = 0;
        for (Applications app:appList) {
            if(app.appIsInstalled){
                tempNames[counter] = app.name;
                counter += 1;
            }
        }
        Arrays.sort(tempNames);
        for(int i = 0; i < tempNames.length; i ++){
            System.out.println(i+1 + ") " + tempNames[i]);
        }
    }

    public void allInstalledAppCheapest(){
        Double[] tempPrices = new Double[appList.size()];
        System.out.println("Lista aplikacji rosnąco po cenie: ");
        int counter = 0;
        for (Applications app:appList) {
            if(app.appIsInstalled){
                tempPrices[counter] = app.price;
                counter += 1;
            }
        }
        Arrays.sort(tempPrices);
        for(int i = 0; i < tempPrices.length; i ++){
            System.out.println(i+1 + ") " + tempPrices[i]);
        }
    }
}