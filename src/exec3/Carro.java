package exec3;

/**
 * Classe criada por armazenar os atributos de Carro
 * @author ecioffi
 * @since 11/02/2020
 * @version 0.1
 */

public class Carro extends Produto{

	String marca = "Honda";
	String modelo = "Civic";
	int ano = 2005;
	String cor = "vermelho";
	String motor = "2.0";
	
	public void exibirCarro() {
		if(marca != null && modelo != null && ano >0 && cor != null && motor != null){
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(ano);
		System.out.println(cor);
		System.out.println(motor);
		exibirTudo();
		}else{
			System.out.println("Algum dos campos é nulo");
		}
		}
	
}
