package exec5;

import java.util.Scanner;

public class AlugaFilme {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		double valAlug = 5;
		System.out.println("Digite o valor pago: ");
		double valPago = scan.nextDouble();
		System.out.println("Digite quantos dias irá alugar");
		int dias = scan.nextInt();
		boolean incDis = true;
		boolean stoDis = true;
		double troco = (valPago - (valAlug * dias));
		System.out.println("Digite 1 para Inception e 2 para Stolen");
		int filme = scan.nextInt();

		if (filme == 1) {
			if (incDis == true) {
				if (valPago > (valAlug * dias)) {
					System.out.println("o filme foi alugado com sucesso e o seu troco é: " + troco);
				} else if (valPago < (valAlug * dias)) {
					System.out.println("Valor pago insuficiente");
				} else
					System.out.println("Filme alugado com sucesso");
			} else
				System.out.println("O filme não está disponível");
		} else if(filme ==2){
			if (stoDis == true) {
				if (valPago > (valAlug * dias)) {
					System.out.println("o filme foi alugado com sucesso e o seu troco é: " + troco);
				} else if (valPago < (valAlug * dias)) {
					System.out.println("Valor pago insuficiente");
				} else
					System.out.println("Filme alugado com sucesso");
			} else
				System.out.println("O filme não está disponível");
		}else { System.out.println("O filme não está no catalogo");
		
		
	}
	}
}
