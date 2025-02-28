/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

/**
 *
 * @author Alejandra Arroyo
 */
public final class Producto {
    
    private int codigo_producto;
    private String nombre_producto;
    private double precio_producto;
    private static int contador = 100;
    public Producto(String nombre_producto, double precio_producto) {
        this.nombre_producto = nombre_producto;
        setPrecio_producto(precio_producto);
        this.codigo_producto = contador++; 
        
        
        System.out.println("PRODUCTO " + codigo_producto + " ha sido creado.");
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        if(precio_producto > 0){
           this.precio_producto = precio_producto;
        }
        else{
            throw new IllegalArgumentException("El precio no debe ser negativo");
        }
        
    }
    
    
    
    
}
