package com.company.devices;
import com.company.creatures.Human;

public class Car extends Device {
    public Double engineVolume;
    public String plates;
    public Double value;
    public Double oil;
    public Double capacitance;
    public Double gas;

    public Car(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.8;
        this.value = 0.0;
        this.plates = "GD 123AS";
        this.oil = 0.0;
        this.capacitance = 0.0;
        this.gas = 0.0;
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyk");
        System.out.println("Silnik robi wrum wrum");
        System.out.println("Wruuuuuum Wruuuuuum");
    }
    @Override
    public void Sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price){
            System.out.println("Nie stać Cię");
        } else if (seller.car != this){
            System.out.println("Nie ładnie sprzedawać coś, czego się nie ma.. OSZUŚCIE!");
        } else{
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Udało Ci się sprzedać auto za " + price + " PLN");
        }
    }

    public abstract void Refuel();

    @Override
    public String toString(){
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineVolume=" + engineVolume +
                ", plates=" + plates +
                ", value='" + value + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
