package exec3;

/**
 * Classe criada por armazenar os atributos de Caneta
 * @author ecioffi
 * @since 11/02/2020
 * @version 0.1
 */

public class Caneta extends Produto{

	String cor = "vermelho";
	String formato = "circular";
	String marca = "bic";
	
	public void exibirCaneta() {
		if(cor != null && formato != null && marca != null){
		System.out.println(cor);
		System.out.println(formato);
		System.out.println(marca);
		exibirTudo();
	}else{
		System.out.println("Algum dos campos é nulo");
		}
	}
}
