package exec3;

/**
 * Classe criada por armazenar os atributos de Computador
 * @author ecioffi
 * @since 11/02/2020
 * @version 0.1
 */

public class Computador extends Produto {

	String processador = "i7";
	int memoria = 100;
	String tela = "Samsung";
	int hd = 500;
	String placaVideo = "Nvidia";

	public void exibirComputador() {
	System.out.println(processador);
	System.out.println(memoria);
	System.out.println(tela);
	System.out.println(hd);
	System.out.println(placaVideo);
	exibirTudo();
	
	}
}
