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

public double frenar() {
    System.out.println("FRENAMOS!!!");
    return this.velocidad / 3;
    }

public int cambiarPinion(int pñ) {
    System.out.println("CAMBIA DE PIÑON");
    return this.pinion = pñ;
}

public int cambiarPlato(int p) {
    System.out.println("CAMBIA DE PLATO");
    return this.plato = p;
}

}