package cursojavaopenboot.interfaces;

import cursojavaopenboot.Coche;

public class InterfacesMain {
 public static void main(String[] args) {
    CocheServices cocheServices = new CocheServicesClassicImpl();
    CocheServices cocheServices2 = new CocheServiceSpotrImpl();

   Coche coche1= cocheServices.crearCocheDemo();    
   Coche coche2= cocheServices2.crearCocheDemo(); 

 }
    

}
