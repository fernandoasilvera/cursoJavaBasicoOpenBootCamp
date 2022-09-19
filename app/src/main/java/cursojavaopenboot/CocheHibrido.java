package cursojavaopenboot;

public class CocheHibrido extends Coche {

    
        String tipoMotor;
    
        public CocheHibrido() {
        }
    
        public CocheHibrido(String tipoMotor) {
            this.tipoMotor = tipoMotor;
        }
    
        public CocheHibrido(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad,String tipoMotor) {
            super( color,  fabricante,  modelo,  peso,  largo,  velocidad);
            this.tipoMotor= tipoMotor;
        }
        @Override
        public void acelerar(Integer cantidad){
            Integer cantidadAjustada = cantidad*4;
            super.acelerar(cantidadAjustada);
        }
    
        @Override
        public String toString() {
            return "Coche {color=" + color + ", fabricante=" + fabricante + ", largo=" + largo + ", modelo=" + modelo
            + ", peso=" + peso + ", velocidad=" + velocidad + ", tipoMotor=" + tipoMotor + "}";
        }
    
   
    
}
