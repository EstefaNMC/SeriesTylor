import controlador.Controlador;
import modelo.CalculaE;
import vista.Vista;

public class Main {

    public static void main(String[] args) {
    	
    	Vista View = new Vista();
        
    	CalculaE model= new CalculaE();
        
        Controlador controlador = new Controlador(View,model);
    
        View.setVisible(true);
        
    }
}

