package exec3;

/**
 * Classe criada por armazenar os atributos de Produto
 * @author ecioffi
 * @since 11/02/2020
 * @version 0.1
 */

public class Produto {
			
	String nome = "Papel";
	int quant = 1000 ; 
	double custo = 1;
	int quantVen = 400;
	double lucro = 0.3 ;
	
	public void exibirNome(){
	if (nome != null) {
		System.out.println("O produto de nome: " + nome);	
	}else{
		System.out.println("O campo nome é nulo");
	}
	
}
	public void exibirValor(){
	if (custo > 0 && lucro > 0){
		System.out.println((custo * lucro)  + custo);
	}else{
		System.out.println("o campo valor é nulo");
	}	
}
	
	public void exibirLucro(){
	if(custo> 0 && lucro > 0){
		System.out.println(custo * lucro);
	}else{
		System.out.println("o campo lucro é nulo");
	}	
}
	public void exibirTudo(){
	exibirNome();
	exibirValor();
	exibirLucro();
	
	}
}



