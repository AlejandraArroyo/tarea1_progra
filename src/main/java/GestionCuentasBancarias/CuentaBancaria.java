

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionCuentasBancarias;

/**
 *
 * @author Alejandra Arroyo
 */
public final class CuentaBancaria {
    
    private int  telefono;

    private String dpi,nombre, numero_cuenta, direccion;
    private double saldo_cuenta;
    private double bandera;
    

    public CuentaBancaria(String dpi, double saldo_inicial, String nombre,String direccion, int telefono) {
        this.dpi = dpi;
        saldoInicial(saldo_inicial);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numero_cuenta = asignarCuenta(dpi);

        System.out.println("Cuenta número " + this.numero_cuenta + " creada exitosamente");
          
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
    
    
    public void saldoInicial(double monto){
     if (monto > 0) {
            this.saldo_cuenta = monto;
           
        } else {
            throw new IllegalArgumentException("El saldo inicial debe ser mayor a 0");
        }
    
    }
    
    
    public String asignarCuenta(String dpi){
    
         int numero = 10000 + (int) (Math.random() * 90000);
        String primeros5 = dpi.substring(0, 5);
          
        String numeroCuenta = primeros5 + numero;
        
        return numeroCuenta;
    }
    
        
}
