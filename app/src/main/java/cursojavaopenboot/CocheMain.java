package cursojavaopenboot;

public class CocheMain {


  public static void main(String[] args) {

    String coche ="alfa romeo";
    Coche cocheObj = new Coche();

    Coche cocheObj2 = new Coche("rojo", "Honda", "civic", 150.45, 5.4,0);
    
    cocheObj2.acelerar(50);
    System.out.println(cocheObj2);
    }
    
}
