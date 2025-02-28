/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temporizador;

/**
 *
 * @author Alejandra Arroyo
 */
public class Alarma {
    private int tiempoObjetivo;
    private boolean activaAlarma = false;

    public Alarma(int tiempoObjetivo) {
        this.tiempoObjetivo = tiempoObjetivo;
    }
    
    
    public void verificar(int tiempoActual) {
        if (tiempoActual >= tiempoObjetivo && !activaAlarma) {
            activaAlarma = true;
            System.out.println(" Se ha activado la alarma en  " + tiempoActual + " segundos");
        }
    }
}
