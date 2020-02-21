package exec9;

public class Matematica {

	public static void main(String[] args) {
		
		double x = 10, y = 20.3, z = -30;
		double abs = Math.abs(z);
		
		//Valor absoluto
		System.out.println(abs);
	
		double ceil = Math.ceil(y);
		
		//retorna menor valor inteiro
		
		System.out.println(ceil);
		
		double floor = Math.floor(y);
		System.out.println(floor);
	
		double log = Math.log(x);
		System.out.println(log);
		
		double max = Math.max(x, y);
		System.out.println(max);
	
		double min = Math.min(x, y);
		System.out.println(min);
	
		// calcula a potencia
		double pow = Math.pow(x, 3);
		System.out.println(pow);
		
		// Calcula Raiz quadrada
		double sqrt = Math.sqrt(x);
		System.out.println(sqrt);
	
		//calcula o cosseno
		double cos = Math.cos(y);
		System.out.println(cos);
		
		//calcula o seno
		double sin = Math.sin(y);
		System.out.println(sin);
		
		//Calcula a tangente
		double tan = Math.tan(y);
		System.out.println(tan);
		
		
		
	}

}
