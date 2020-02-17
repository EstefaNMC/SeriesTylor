package modelo;

public class CalculaE {
	
	private double CalcularEValue=0;

	//Metodo para calcular e 
	public void e(double num1, double num2) {
		
		double  operar;
		
		for(int i=0; i<num1; i++) {
			
			operar=1/factorial(i);
			CalcularEValue+=operar;			
			
		}
		
		
		
	}
	

	//Metodo para calcular factorial
	
		public static double factorial(int fact) {
			
			double aux=1;
			
			for(int i=2; i<=fact;i++) {
				
				aux*=i;
			}
			return aux;
		}
		
		public double getCalcularEValue() {
			
			return CalcularEValue;
		}
		

}
