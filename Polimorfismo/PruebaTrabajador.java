
import java.util.Scanner;


public class PruebaTrabajador {
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);
    
         System.out.println("Número de Trabajadores");
         int n = buffer.nextInt(); buffer.nextLine();
         
         //Arreglo de Trabajador
         Trabajador[] trab = new Trabajador[n];
         
         int i = 0, op;
         do{
            System.out.println("");
            System.out.println("Tipos de Trabajadores");
            System.out.println("1. Administrativo ");
            System.out.println("2. Operativo ");
            System.out.print("Seleccione una opción: ");
            op = buffer.nextInt();  buffer.nextLine();
            
             switch(op){
                 case 1:
                     trab[i] = new Administrativo();
                     break;
                 case 2:
                     trab[i] = new Operativo(); //Polimorfismo
                     break;
                 default:
                     trab[i] = new Trabajador(); //Polimorfismo
                     break;
             }
             trab[i].capturar();
             trab[i].calcularSalario();
             i++;
         }while(i<n);
         
        System.out.println(" Registro de los trabajadores ");
        for(Trabajador t:trab){ //Uso de for extendido   
            System.out.println("");
            t.imprimir();           
        }
    }
}
