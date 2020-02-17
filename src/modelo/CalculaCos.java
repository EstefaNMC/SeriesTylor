package modelo;

public class CalculaCos {
	
	private double CalcularCosValue=0;

	public double CalculaCos( int coseno) {
		double suma=0, resul;
		int x=0;
		
		for(int i=0; i< coseno; i++) {
			
			resul=Math.pow(x, i)/factorial(i);
			
			suma+=resul;
			
			
			
		}
		return suma;
		
	}
	
	
		
	//Metodo para calcular factorial
	
		public static double factorial(int fact) {
			
			double aux=1;
			
			for(int i=2; i<=fact;i++) {
				
				aux*=i;
			}
			return aux;
		}
public double getCalcularCosValue() {
			
			return CalcularCosValue;
		}

}
