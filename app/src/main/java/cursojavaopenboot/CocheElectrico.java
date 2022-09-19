package cursojavaopenboot;

public class CocheElectrico extends Coche {
    String motorElectrico;

    public CocheElectrico() {
    }

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad,String motorElectrico) {
        super( color,  fabricante,  modelo,  peso,  largo,  velocidad);
        this.motorElectrico= motorElectrico;
    }
    @Override
    public void acelerar(Integer cantidad){
        Integer cantidadAjustada = cantidad*2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "Coche {color=" + color + ", fabricante=" + fabricante + ", largo=" + largo + ", modelo=" + modelo
        + ", peso=" + peso + ", velocidad=" + velocidad + ", motorElectrico=" + motorElectrico + "}";
    }

}
