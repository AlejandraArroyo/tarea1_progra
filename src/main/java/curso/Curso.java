/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author Alejandra Arroyo
 */
public class Curso {
       private String nombreCurso;
       private Estudiante listadoEstudiantes[] = new Estudiante[50];
       private int indice = 0; 
     
        

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        
        
        
    }
    
    public void addEstudiante(Estudiante estudiante){
       listadoEstudiantes[indice] = estudiante;
       indice++;
    }
    
      
    public void mostrarEstudiantesAsignados(){
        for(int i = 0; i < indice; i++){
            System.out.println(listadoEstudiantes[i]);
        }
    }
    
    public double obtenerPromedio(){
        double suma = 0;
        for(int i = 0; i < indice; i++){
           suma += listadoEstudiantes[i].getNotaFinal();
        }
        return suma / indice;
        
    }
    
    
    public void aprobados() {
        System.out.println("------ Estudiantes aprobados ---------");
        for (int i = 0; i < indice; i++) {
            if (listadoEstudiantes[i].getNotaFinal() > 61) {
                System.out.println(listadoEstudiantes[i].getNombre() + " (" + listadoEstudiantes[i].getCarnet() + ")");
            }
        }
    }
        
        

 
    
}
