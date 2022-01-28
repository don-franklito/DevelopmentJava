
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
public class Operativo extends Trabajador{

    //Métodos de Encapsulación
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    //Variables
    private int horasTrabajadas;
    
    //Constructores
    public Operativo () {
        super();
        this.horasTrabajadas = 0;
    }
    
    public Operativo (int cla,double sue,String nom,int hor) {
        super(cla,sue,nom);
        this.horasTrabajadas = hor;
    }
    
    public Operativo (Operativo ope) {
        super(ope);
        this.horasTrabajadas = ope.horasTrabajadas;
    }
    
    @Override
    public void capturar (){
        Scanner buffer = new Scanner(System.in);
        super.capturar();
        System.out.print("Horas Trabajadas: "); this.horasTrabajadas = buffer.nextInt(); buffer.nextLine();
    }
    
    @Override
    public void calcularSalario() {
        double sueHora = (super.getSueldoDiario() / 8);
        if(this.horasTrabajadas <= 40) {
            System.out.print("El salario es: " + (sueHora * this.horasTrabajadas));
        } else {
            int horasExtras = (this.horasTrabajadas - 40);
            double sueDoble = ((sueHora * horasExtras)*2);
            System.out.print("Salario = " + (((sueHora * 40)) + sueDoble));
        }     
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.print(" " + this.horasTrabajadas);
    }
}
