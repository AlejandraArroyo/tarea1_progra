/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1_programacion;

/**
 *
 * @author Alejandra Arroyo
 */
public class Termometro {
    
    private double grados;
    private double Fahrenheit ,kelvin;

    public Termometro(double grados) {
        this.grados = grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    public double getFahrenheit() {
        return Fahrenheit;
    }

    public double getKelvin() {
        return kelvin;
    }
    
    
    public void convertirFahrenheit(){
        Fahrenheit = (this.grados * 9/5) + 32;
        
        System.out.println("El equivalente a Fahrenheit es " + getFahrenheit());
    }
    
    public void convertirKelvin(){
        kelvin = this.grados + 273.15;
        System.out.println("El equivalente en kelvin es de : " + getKelvin());
        
    }
    
}
