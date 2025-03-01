/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author Alejandra Arroyo
 */
public final class Estudiante {
    
    
    private String nombre, carnet;
    private int notaFinal;

    public Estudiante(String nombre, String carnet, int notaFinal) {
        this.nombre = nombre;
        this.carnet = carnet;
        setNotaFinal(notaFinal);
    }
    
    

    public void setNotaFinal(int notaFinal) {
        if (notaFinal > 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
           
        } else {
            throw new IllegalArgumentException(" La nota debe estar entre 0 y 100.");
        }
       
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + ", Carnet: " + carnet + ", Nota: " + notaFinal ;
    }
    
    
}
