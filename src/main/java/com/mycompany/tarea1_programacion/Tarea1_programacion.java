/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea1_programacion;
import curso.Curso;
import curso.Estudiante;
import ControlTemperatura.Termometro;
import Inventario.Producto;
import Temporizador.Alarma;
import Temporizador.Temporizador;
import GestionCuentasBancarias.CuentaBancaria;




/**
 *
 * @author Alejandra Arroyo
 */
public class Tarea1_programacion {

    public static void main(String[] args) {
     
        System.out.println("------------ Ejercicio 1 -----------------------------------");
        CuentaBancaria banco = new CuentaBancaria("2846105770101",20,"Alejandra","Ciudad de guatemala",30556567);
        banco.consultarSaldo();
        banco.depositarSaldo(60);
        banco.depositarSaldo(20.5);
        banco.consultarSaldo();
        banco.retirarSaldo(30);
        banco.retirarSaldo(100);
        CuentaBancaria banco2 = new CuentaBancaria("2033983838",40,"Alejandra","Ciudad de guatemala",30556567);
        
        
        
        
        System.out.println("------------ Ejercicio 2 -----------------------------------");
        Termometro temp = new Termometro(25);   
       
        temp.convertirFahrenheit();
        temp.convertirKelvin();
        temp.setGrados(90);
        temp.convertirFahrenheit();
        temp.convertirKelvin();
        
        
        
        System.out.println("------------ Ejercicio 3 -----------------------------------");
        Producto prod = new Producto("Blusa Cafe", 90);
        Producto prod2 = new Producto("Pantalon Cafe", 200);
        System.out.println("Precio " +  prod.getPrecio_producto());
        
        
 
        
        
       System.out.println("------------ Ejercicio 4 -----------------------------------");
       Alarma alarmas = new Alarma(5);
       Temporizador temporizador = new Temporizador(alarmas);
       temporizador.iniciar(10);
       
       
     
        System.out.println("------------ Ejercicio 5 -----------------------------------");
        Curso progra1 = new Curso("Programación en Java");
        Estudiante estudiante1 = new Estudiante("Raquel Lopez", "3838383", 85);
        Estudiante estudiante2 = new Estudiante("Ana Perez", "3833382", 59);
       
        progra1.addEstudiante(estudiante1);
        progra1.addEstudiante(estudiante2);
     
        
         progra1.mostrarEstudiantesAsignados();

       
        double promedio = progra1.obtenerPromedio();
        System.out.println("Promedio del curso: " + promedio);
        progra1.aprobados();
       
        
    }
}
