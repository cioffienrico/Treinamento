package exec3;

/**
 * Classe criada por armazenar os atributos de Caneca
 * @author ecioffi
 * @since 11/02/2020
 * @version 0.1
 */

public class Caneca extends Produto {

	boolean estampa = true;
	String material = "Vidro";
	int medida = 10;
	
	public void exibirCaneca() {
		if (estampa = true){
			System.out.println("Possui estampa");
		}else{
			System.out.println("não possui estampa");
		}
				
		if	(material != null && medida >0){
			System.out.println(material);
			System.out.println(medida);
			exibirTudo();
		}else{
			System.out.println("Algum dos campos é nulo");
		}
				
		}
}
