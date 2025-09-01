/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asignacion1;

/**
 *
 * @author krism
 */
import java.util.ArrayList;
import java.util.Random;

public class Bolsa<T> {
    private int tamBolsa;
    private int numObjetos;
    private ArrayList<T> objetos;

    // Constructor
    public Bolsa(int tamBolsa) {
        this.tamBolsa = tamBolsa;
        this.numObjetos = 0;
        this.objetos = new ArrayList<>();
    }

    public int obtenNumObjetos() {
        return numObjetos;
    }

    public boolean vacia() {
        return numObjetos == 0;
    }

    public boolean agrega(T objeto) {
        if (numObjetos < tamBolsa) {
            objetos.add(objeto);
            numObjetos++;
            return true;
        }
        return false;
    }

    public T remueve() {
        if (numObjetos == 0) return null;
        Random rand = new Random();
        int index = rand.nextInt(numObjetos);
        T eliminado = objetos.remove(index);
        numObjetos--;
        return eliminado;
    }

    public T remueve(T objeto) {
        if (objetos.contains(objeto)) {
            objetos.remove(objeto);
            numObjetos--;
            return objeto;
        }
        return null;
    }

    public void limpia() {
        objetos.clear();
        numObjetos = 0;
    }

    public int cuenta(T objeto) {
        int contador = 0;
        for (T o : objetos) {
            if (o.equals(objeto)) contador++;
        }
        return contador;
    }

    public boolean contiene(T objeto) {
        return objetos.contains(objeto);
    }

    public ArrayList<T> obtenObjetos() {
        return new ArrayList<>(objetos);
    }
}