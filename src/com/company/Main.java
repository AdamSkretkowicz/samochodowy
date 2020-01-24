package com.company;

import com.company.Car;
public class Main {

    public static void main(String[] args) {


        Engine silnik1 = new Engine();
        Engine silnik2 = new Engine();
        silnik1.capacity = 1000;
        silnik1.power = 100;
        silnik2.capacity = 2000;
        silnik2.power = 200;

        System.out.println("===========1a================");
        System.out.println(silnik1.capacity);
        System.out.println(silnik1.power);
        System.out.println(silnik2.capacity);
        System.out.println(silnik2.power);
        System.out.println("===========1b================");

        Car samochod1 = new Car();
        Car samochod2 = new Car();
        samochod1.setMaxSpeed(30);
        samochod1.name = "sam1";
        samochod1.RodzajSilnik.power = 300;
        samochod1.RodzajSilnik.capacity = 3000;
        samochod2.setMaxSpeed(40);
        samochod2.name = "sam2";
        samochod2.RodzajSilnik.power = 400;
        samochod2.RodzajSilnik.capacity = 4000;

        System.out.println(samochod1.getMaxSpeed());
        System.out.println(samochod1.name);
        System.out.println(samochod1.RodzajSilnik.power);
        System.out.println(samochod1.RodzajSilnik.capacity);
        System.out.println(samochod2.getMaxSpeed());
        System.out.println(samochod2.name);
        System.out.println(samochod2.RodzajSilnik.power);
        System.out.println(samochod2.RodzajSilnik.capacity);
        System.out.println("===========2a================");
        samochod1.nazwaCar();
        samochod2.nazwaCar();
        System.out.println("===========2b================");
        Engine silnik3 = new Engine();
        silnik3.power = 500;
        silnik3.capacity = 5000;
        silnik3.engineCapacity();
        silnik3.enginePower();
        System.out.println("===========2c================");

    }
}
