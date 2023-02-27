package com.mycompany.biciversiones;

public class Bicicleta {
private int velocidad;
private int plato;
private int pinion;

public Bicicleta () {
    this.velocidad = 30;
    this.plato = 2;
    this.pinion = 5;
    System.out.println("BIKE CREATED");
    }

public double acelerar() {
    System.out.println("ACELERAMOS!!!");
    return this.velocidad * 3;
    }

}