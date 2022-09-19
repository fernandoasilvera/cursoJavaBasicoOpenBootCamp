package cursojavaopenboot;

public class CocheMain {

  public static void main(String[] args) {

    String coche = "alfa romeo";
    Coche cocheObj = new Coche();

    Coche cocheObj2 = new Coche("rojo", "Honda", "civic", 150.45, 5.4, 0);

    cocheObj2.acelerar(50);
    System.out.println(cocheObj2);


    CocheElectrico cocheElectrico = new CocheElectrico();
    cocheElectrico.motorElectrico="Ejemplo motor";
    cocheElectrico.color="rosa";
    cocheElectrico.fabricante="tesla";
    cocheElectrico.modelo="hibrdo";
    cocheElectrico.velocidad=120;
    System.out.println(cocheElectrico);
    CocheElectrico cocheElectrico2 = new CocheElectrico("naranja","mazda", "camioneta", 1500.2, 11.2, 100,"teslaMotor");
    cocheElectrico2.acelerar(170);
    System.out.println(cocheElectrico2);
  }

}
