package modelo;

public class CalculaSen {

	//Metodo para calcular sen
	private double CalcularSenValue=0;
	
		public static double sen(int seno) {
			
			double suma=0, resultado;
			int signo=1,x = 0;
			
			for(int i=0; i<seno; i++) {
				
				resultado=Math.pow(x, i)/factorial(i)*signo;
				signo*=-1;
				suma+=resultado;
				
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

		public double getCalcularSenValue() {
			
			return CalcularSenValue;
		}
}
