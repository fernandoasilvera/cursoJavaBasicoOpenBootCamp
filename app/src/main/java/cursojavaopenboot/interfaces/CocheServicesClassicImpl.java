package cursojavaopenboot.interfaces;

import cursojavaopenboot.Coche;
import cursojavaopenboot.CocheElectrico;

public class CocheServicesClassicImpl implements CocheServices {

    @Override
    public Coche crearCocheDemo() {
        // TODO Auto-generated method stub
        return new CocheElectrico();
    }
    
}
