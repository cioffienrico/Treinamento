package exec7;

import javax.swing.JOptionPane;

public class Locadora {

	String todos = "0";
	String cor = "0";
	String modelo = "0";
	static Carro carro[] = new Carro[10];
	static Carro auxiliar[];
	boolean mostrar = false;
	String message;

	public static void main(String[] args) {

		carro[0] = new Carro("ONIX", "ABC 1234", 150, "ALCOOL", 10000, "A");
		carro[1] = new Carro("FORD KA", "ABD 1235", 180, "GASOLINA", 15000, "PRETO");
		carro[2] = new Carro("PRISMA", "ABE 1236", 190, "FLEX", 20000, "BRANCO");
		carro[3] = new Carro("RENEGADE", "ABF 1237", 170, "ALCOOL", 25000, "PRETO");
		carro[4] = new Carro("GOL", "ABG 1238", 200, "GASOLINA", 30000, "BRANCO");
		carro[5] = new Carro("ECOSPORT", "ABH 1239", 160, "FLEX", 35000, "CINZA");
		carro[6] = new Carro("CIVIC", "ABI 1240", 160, "ALCOOL", 40000, "PRETO");
		carro[7] = new Carro("RANGER", "ABJ 1241", 170, "GASOLINA", 42000, "CINZA");
		carro[8] = new Carro("FIORINO", "ABK 1242", 180, "FLEX", 38000, "PRETO");
		carro[9] = new Carro("ONIX", "ABL 1243", 190, "ALCOOL", 37000, "A");

		Locadora locadora = new Locadora();
		locadora.escOpcao();
	}

	public void escOpcao() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"Insira numero 1 para modelo, 2 para velocidade, 3 para combustivel, 4 para exibir todos, 5 para cor ou 6 para realizar a compra:  "));
		switch (opcao) {
		case 1:
			String modelo = JOptionPane.showInputDialog("Insira o modelo: ").toUpperCase();
			pesMod(modelo);

			break;

		case 2:
			int veloMax = (Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade: ")));
			pesVelo(veloMax);

			break;

		case 3:
			String combustivel = JOptionPane.showInputDialog("Insira o tipo de combustivel: ").toUpperCase();
			pesComb(combustivel);

			break;

		case 4:
			buscarTodos();

			break;
		case 5:
			String cor = JOptionPane.showInputDialog("Insira a cor: ").toUpperCase();
			pesCor(cor);

			break;

		case 6:
			cor = JOptionPane.showInputDialog("Insira a cor").toUpperCase();
			modelo = JOptionPane.showInputDialog("Insira o modelo").toUpperCase();
			compra(cor, modelo);

			break;

		default:
			System.out.println("Digite apenas 1, 2, 3, 4, 5 ou 6");

			break;
		}
	}

	public void pesComb(String combustivel) {
		boolean encontrou = false;
		for (int I = 0; I < carro.length; I++) {
			if (carro[I].combustivel.equals(combustivel)) {
				System.out.println(carro[I].modelo);
				System.out.println(carro[I].placa);
				System.out.println(carro[I].veloMax);
				System.out.println(carro[I].combustivel);
				System.out.println(carro[I].valor);
				System.out.println(carro[I].cor);
				System.out.println("\n");
				encontrou = true;
			}
		}
		if (!encontrou) {
			System.out.println("Não foi encontrado");
		}
	}

	public void pesMod(String modelo) {
		boolean encontrou = false;
		for (int I = 0; I < carro.length; I++) {
			if (carro[I].modelo.equals(modelo)) {
				System.out.println(carro[I].modelo);
				System.out.println(carro[I].placa);
				System.out.println(carro[I].veloMax);
				System.out.println(carro[I].combustivel);
				System.out.println(carro[I].valor);
				System.out.println(carro[I].cor);
				System.out.println("\n");
				encontrou = true;

			}
		}
		if (!encontrou) {
			System.out.println("Não foi encontrado");
		}
	}

	public void pesVelo(int veloMax) {
		boolean encontrou = false;
		for (int I = 0; I < carro.length; I++) {
			if (carro[I].veloMax == veloMax) {
				System.out.println(carro[I].modelo);
				System.out.println(carro[I].placa);
				System.out.println(carro[I].veloMax);
				System.out.println(carro[I].combustivel);
				System.out.println(carro[I].valor);
				System.out.println(carro[I].cor);
				System.out.println("\n");
				encontrou = true;
			}
		}
		if (!encontrou) {
			System.out.println("Não foi encontrado");

		}
	}

	public void pesCor(String cor) {
		boolean encontrou = false;
		for (int I = 0; I < carro.length; I++) {
			if (carro[I].cor.equals(cor)) {
				System.out.println(carro[I].modelo);
				System.out.println(carro[I].placa);
				System.out.println(carro[I].veloMax);
				System.out.println(carro[I].combustivel);
				System.out.println(carro[I].valor);
				System.out.println(carro[I].cor);
				System.out.println("\n");
				encontrou = true;
			}
		}
		if (!encontrou) {
			System.out.println("Não foi encontrado");

		}
	}

	public void buscarTodos() {
		for (int I = 1; I < carro.length; I++) {

			for (int j = 0; j < I; j++) {
				if (carro[I].valor > carro[j].valor) {
					Carro temp = new Carro();
					temp = carro[I];
					carro[I] = carro[j];
					carro[j] = temp;
				}
			}
		}

		for (int i = 0; i < carro.length; i++) {
			message = "\nmodelo: " + carro[i].modelo + "\n placa: " + carro[i].placa + "\n velocidade maxima: "
					+ carro[i].veloMax + "\n tipo de combustivel: " + carro[i].combustivel + "\n valor do carro: "
					+ carro[i].valor + "\n cor do carro: " + carro[i].cor + "\n";
			JOptionPane.showMessageDialog(null, message);

		}
	}

	public void compra(String cor, String modelo) {
		boolean encontrou = false;
		String message = "";

		int j = 0;
		for (int i = 0; i < carro.length; i++) {
			if (carro[i].cor.equals(cor) && carro[i].modelo.equals(modelo)) {

				message = message + j + "\nmodelo: " + carro[i].modelo + "\n placa: " + carro[i].placa + "\n velocidade maxima: "
						+ carro[i].veloMax + "\n tipo de combustivel: " + carro[i].combustivel + "\n valor do carro: "
						+ carro[i].valor + "\n cor do carro: " + carro[i].cor + "\n";
				auxiliar[j] = carro[i];
				j++;
				encontrou = true;
			}
			
		}
		
		if (!encontrou) {
			System.out.println("Não foi encontrado");
		}else { 
			String opcao = JOptionPane.showInputDialog(message);
			int num = Integer.parseInt(opcao);
			double valorPago = Double.parseDouble(JOptionPane.showInputDialog("insira o quanto irá pagar: "));
			double troco = (valorPago - auxiliar[num].valor);
			
			
			
			if (valorPago > auxiliar[num].valor) {
				JOptionPane.showMessageDialog(null, "O carro foi comprado com sucesso e o troco é: " + troco);
			} else {
				if (valorPago == auxiliar[num].valor) {
					JOptionPane.showMessageDialog(null, "O carro foi comprado com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "voce nao possui dinheiro suficiente para comprar esse carro");
				}
			}	
			
			
		}
		

		
		
		

		

		

	}
}
