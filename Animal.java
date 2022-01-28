//Juan Francisco Lizárraga Luna
public class Animal {

    //Métodos de Encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Variables
    private String nombre;
    private String especie;
    private int edad;
    private String color;
    
    //Constructores
    public Animal () {
        this.nombre = "";
        this.especie = "";
        this.edad = 0;
        this.color = "";
    }
    
    public Animal (String nom,String esp,int ed,String col) {
        this.nombre = nom;
        this.especie = esp;
        this.edad = ed;
        this.color = col;
    }
    
    public Animal (Animal an) {
       an.nombre = this.nombre;
       an.especie = this.especie;
       an.edad = this.edad;
       an.color = this.color;
    }
    
    public void imprimir () {
        System.out.print("Datos del Animal: "
            + this.nombre + " "
            + this.especie + " "
            + this.edad + " "
            + this.color
        );
    }
      
}


