package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.CalculaE;
import vista.Vista;

public class Controlador {
	
	private Vista View;
	private CalculaE model;
	
	
	public Controlador(Vista View,CalculaE model) {
		
		this.View= View;
		this.model=model;
		
		this.View.addCalculateListener(new CalculateListener());

	
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			double num1, num2;
			
			
			
			try{
			
				num1 = View.getNum1();
				num2 = View.getNum2();
				
				
				model.e(num1, num2);
				
				View.setCalcSolution(model.getCalcularEValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				View.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
	}
}


	


