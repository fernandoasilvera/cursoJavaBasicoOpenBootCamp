package cursojavaopenboot;

public class PoloformimoMain {
    public static void main(String[] args) {
        //Coche coche = new Coche("azul","alfa",null, (double) 15, null, null);
        Coche coche1 = new Coche();
        CocheElectrico cocheElectrico1 = new CocheElectrico();
        CocheHibrido cocheHibrido1 = new CocheHibrido();
    

        //polimorfismo

        Coche coche2 = new CocheElectrico();
        Coche coche3 = new CocheHibrido(); 

        if (coche2 instanceof Coche){
            System.out.println("coche");
        } 

        if (coche2 instanceof CocheElectrico){
            System.out.println("electrico");
        } 
        if (coche2 instanceof CocheHibrido){

            System.out.println("hibrido");
        }

        
    }
    
    
}
