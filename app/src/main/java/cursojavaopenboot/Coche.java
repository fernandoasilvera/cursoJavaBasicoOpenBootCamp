package cursojavaopenboot;

public class Coche {

    //atributos
    String color;
    String fabricante; 
    String modelo; 
    Double peso ;
    Double largo;
    Integer velocidad =0;

    //constructores
    public  Coche() {
        
    }
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
        this.velocidad = velocidad;
    }

    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <=1000){
            this.velocidad =cantidad;
            System.out.println(this.velocidad);
        }
    }
    @Override
    public String toString() {
        return "Coche {color=" + color + ", fabricante=" + fabricante + ", largo=" + largo + ", modelo=" + modelo
                + ", peso=" + peso + ", velocidad=" + velocidad + "}";
    }
    
}
    
