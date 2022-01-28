
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jfliz
 */
public class Trabajador {
    //Métodos de Encapsulación
    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public double getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(double sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Variables
    private int clave;
    private double sueldoDiario;
    private String nombre;
    
    //Constructores
    public Trabajador() {
        this.clave = 0;
        this.sueldoDiario = 0.0;
        this.nombre = "";
    }
    
    public Trabajador(int cla,double sue,String nom){
        this.clave = cla;
        this.sueldoDiario = sue;
        this.nombre = nom;
    }
    
     public Trabajador(Trabajador trab){
        this.clave = trab.clave;
        this.sueldoDiario = trab.sueldoDiario;
        this.nombre = trab.nombre;
    }
    
     //Acciones
     public void capturar(){
          Scanner buffer = new Scanner(System.in);
          System.out.print("Clave: "); this.clave = buffer.nextInt(); buffer.nextLine();
          System.out.print("Sueldo Diario: "); this.sueldoDiario = buffer.nextDouble(); buffer.nextLine();
          System.out.print("Nombre: "); this.nombre = buffer.nextLine();
     }
     
     public void calcularSalario() {
          System.out.print("No se puede calcular nada"); 
     }
     
     public void imprimir() {
          System.out.print(this.clave);
          System.out.print(" " + this.sueldoDiario);
          System.out.print(" " + this.nombre);
     }
}
