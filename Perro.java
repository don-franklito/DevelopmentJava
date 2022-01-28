// Clase Perro //
//Juan Francisco Lizárraga Luna

    public class Perro extends Animal{

        //Métodos de Encapsulamiento
        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }
        
        //Variables
        private String raza;
        
        //Constructores
        public Perro () {
            super();
            this.raza = "";
        }
        
        public Perro (String nom,String esp,int ed,String col,String raz) {
            super(nom,esp,ed,col);
            this.raza = raz;
        }
        
        public Perro (Perro per) {
            super(per);
            per.raza = this.raza;
        }
        
        @Override
        public void imprimir() {
            super.imprimir();
            System.out.print(" " + this.raza);
        }
    } 