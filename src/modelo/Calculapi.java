package modelo;

public class Calculapi {
	private double CalcularPiValue=0;

	//Método para calcular pi
	
	
		public static double pi(int n,int s) {
			
			int den=1, signo=1;
			double operacion, suma=0;
			
			for(int i=1; i<=n;i++) {
			
				operacion=(double) 1/den*signo;
				suma+= operacion;
				den+=2;
				signo*=-1;
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

		public double getCalcularEValue() {
			
			return CalcularPiValue;
		}
}
