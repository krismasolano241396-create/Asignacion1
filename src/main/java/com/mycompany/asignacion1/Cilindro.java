package com.mycompany.asignacion1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author krism
 */
public class Cilindro extends figura {
    private double radio;
    private double altura;

    // Constructor vacío
    public Cilindro() {}

    // Constructor con parámetros
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        // Área total = 2πr(h + r)
        return 2 * Math.PI * radio * (radio + altura);
    }

    @Override
    public double CalcularVolumen() {
        // Volumen = πr²h
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
