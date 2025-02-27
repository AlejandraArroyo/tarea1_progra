

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1_programacion;

/**
 *
 * @author Alejandra Arroyo
 */
public class CuentaBancaria {
    
    private int  telefono;

    private String dpi,nombre, numero_cuenta, direccion;
    private double saldo_cuenta;
    private double bandera;
    

    public CuentaBancaria(String dpi, double saldo_inicial, String nombre,String direccion, int telefono) {
        this.dpi = dpi;
        this.saldo_cuenta = saldo_inicial;
        
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        int numero = 10000 + (int) (Math.random() * 90000);
        String primeros5 = dpi.substring(0, 5);
          
        String numeroCuentaStr = primeros5 + numero;
        
        this.numero_cuenta = numeroCuentaStr;

        System.out.println("Cuenta número " + numeroCuentaStr + " creada exitosamente");
          
    }
    
    
    
    public void consultarSaldo(){
    
        System.out.println("El saldo de su cuenta número : " + this.numero_cuenta + " es de : " + this.saldo_cuenta);
    }
    
    public void depositarSaldo(double monto){
  
        if(monto > 0){
            System.out.println("Deposito de efectivo");
          this.saldo_cuenta = this.saldo_cuenta + monto;
           System.out.println("Su nuevo saldo es de : " + this.saldo_cuenta);
        
        
        }else{
        System.err.println("El monto debe ser mayor a 0");
        }
    }
    
    public void retirarSaldo(double monto){
        if(monto > 0){
            System.out.println("Retiro de efectivo");
         if(monto > saldo_cuenta){
         System.err.println("Esta intentando retirar mas dinero del que posee en la cuenta");
         }
         else{
         this.saldo_cuenta = this.saldo_cuenta - monto;
             System.out.println("Su nuevo saldo es de : " + this.saldo_cuenta);
         }
         
            
            
        }else{
            System.err.println("El monto debe ser mayor a 0");
        }
    
    }
    
        
}
