/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temporizador;

import Temporizador.Alarma;

/**
 *
 * @author Alejandra Arroyo
 */
public class Temporizador {
    private int tiempo_actual;
    private Alarma alarma;
    
    
    public Temporizador(Alarma alarma){
        this.tiempo_actual = 0;
        this.alarma = alarma;
    
    }
    
  public void iniciar(int duracion) {
        System.out.println("----------Inicio Temporizador---------------");

        long inicio = System.currentTimeMillis();

        while (tiempo_actual <= duracion) {
            long tiempoT = (System.currentTimeMillis() - inicio) / 1000;

            if (tiempoT > tiempo_actual) {
                tiempo_actual = (int) tiempoT;
                System.out.println(tiempo_actual + " segundos!");

               alarma.verificar(tiempo_actual);
                
            }
        }

        System.out.println("️------- final temporizador -----------");
    }
    
}
