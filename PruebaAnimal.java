//Clase de Prueba herencia 
//Animal > Perro && Pez
//Juan Francisco Lizárraga Luna
import java.util.Scanner;


public class PruebaAnimal {
     public static void main(String[] args) {
            Scanner buffer = new Scanner(System.in);
            //Objetos
            Animal a = new Animal();
            Perro p = new Perro();
            Pez pz = new Pez();
    
            //Clase Padre Animal
            System.out.println("Animal");
            System.out.print("Nombre: ");
            String nom = buffer.nextLine(); a.setNombre(nom);
            System.out.print("Especie: ");
            String esp = buffer.nextLine(); a.setEspecie(esp);
            System.out.print("Edad: ");
            int ed = buffer.nextInt(); buffer.nextLine(); a.setEdad(ed);
            System.out.print("Color: ");
            String col = buffer.nextLine(); a.setColor(col);
            
            //Clase Hija Perro
            System.out.println("Perro");
            System.out.print("Nombre: ");
            String nomb = buffer.nextLine(); p.setNombre(nomb);
            System.out.print("Especie: ");
            String espe = buffer.nextLine(); p.setEspecie(espe);
            System.out.print("Edad: ");
            int eda = buffer.nextInt(); buffer.nextLine(); p.setEdad(eda);
            System.out.print("Color: ");
            String colo = buffer.nextLine(); p.setColor(colo);
            System.out.print("Raza: ");
            String raz = buffer.nextLine(); p.setRaza(raz);
            
            //Clase Hija Pez
            System.out.println("Pez");
            System.out.print("Nombre: ");
            String nombr = buffer.nextLine(); pz.setNombre(nombr);
            System.out.print("Especie: ");
            String espec = buffer.nextLine(); pz.setEspecie(espec);
            System.out.print("Edad: ");
            int edad = buffer.nextInt(); buffer.nextLine(); pz.setEdad(edad);
            System.out.print("Color: ");
            String color = buffer.nextLine(); pz.setColor(color);
            System.out.print("Alimento: ");
            String tip = buffer.nextLine(); pz.setTipoAlimento(tip);
            
            
            //Impresión de los métodos
            //Datos Animal
            System.out.println("Animal: ");
            a.imprimir();
            //Datos Perro
            System.out.println("");
            System.out.println("Perro: ");
            p.imprimir();
            //Datos Pez
            System.out.println("");
            System.out.println("Pez: ");
            pz.imprimir();
        }
}
