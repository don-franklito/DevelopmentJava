
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
public class Administrativo extends Trabajador{

    //Métodos de Encapsulación
    public int getNumDiasTrabajo() {
        return numDiasTrabajo;
    }

    public void setNumDiasTrabajo(int numDiasTrabajo) {
        this.numDiasTrabajo = numDiasTrabajo;
    }
    
    //Variables
    private int numDiasTrabajo;
    
    //Constructores
    public Administrativo () {
        super();
        this.numDiasTrabajo = 0;
    }
    
    public Administrativo (int cla,double sue,String nom,int ndt) {
        super(cla,sue,nom);
        this.numDiasTrabajo = ndt;
    }
    
    public Administrativo (Administrativo adm) {
        super(adm);
        this.numDiasTrabajo = adm.numDiasTrabajo;
    }
    
    //Sobre-escritura de métodos
    @Override
    public void capturar(){
        Scanner buffer = new Scanner(System.in);
        super.capturar();
        System.out.print("Dias Trabajados: "); this.numDiasTrabajo = buffer.nextInt(); buffer.nextLine();
    }
    
    @Override
    public void calcularSalario(){  
       System.out.print("Salario = " + (super.getSueldoDiario() * this.numDiasTrabajo));
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.print(" " + this.numDiasTrabajo);
    }
}
