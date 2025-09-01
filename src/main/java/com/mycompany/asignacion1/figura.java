package com.mycompany.asignacion1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Raquel
 */
public abstract class figura {
    
    public double x;
    public double y;
    
    public figura(){
    }
    
    
    public figura(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public abstract double CalcularVolumen();
    
    public abstract double CalcularArea();
    
}
