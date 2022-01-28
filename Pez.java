//Clase Pez
//Juan Francisco Lizárraga Luna 
public class Pez extends Animal{

        //Métodos de Encapsulación Pez
        public String getTipoAlimento() {
            return tipoAlimento;
        }

        public void setTipoAlimento(String tipoAlimento) {
            this.tipoAlimento = tipoAlimento;
        }
        //Variables Pez
        private String tipoAlimento;
        //Constructores Pez
        public Pez() {
            super();
            this.tipoAlimento = "";
        }
        
        public Pez (String nom,String esp,int ed,String col,String tip) {
            super(nom,esp,ed,col);
            this.tipoAlimento = tip;
        }
        
        public Pez (Pez pz) {
            super(pz);
            pz.tipoAlimento = this.tipoAlimento;
        }
        
        @Override
        public void imprimir(){
            super.imprimir();
             System.out.print(" " + this.tipoAlimento);
        }
    }