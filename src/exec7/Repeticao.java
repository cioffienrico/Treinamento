package exec7;

import javax.swing.JOptionPane;

public class Repeticao {

	boolean exit = false;
	
	public Repeticao() {
		while(!exit) {
			processar();	
		}
	testaWhile();
	
	}
	
	public void testaWhile() {
		int i = 10;
		while(i < 10) {
			System.out.println(i + " ao cubo é " + ((i * i ) * i));
			i = i + 1;	
		}
	}
	
	public void testaDoWhile() {
		int i = 10;
		do {
			System.out.println(i + " ao cubo é " + ((i * i) * i));
			i++;
			
		}while (i < 15);
	}
	
	public void processar() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção: "));
		
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Opção 1");
			break;

		case 2:
			JOptionPane.showMessageDialog(null, "Opção 2");
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "Opção 3");
			break;
			
		case 9:
			exit = true;
		
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida");
			
			break;
		}
	}

	public static void main(String[] args) {
		new Repeticao();
}

	
	
	
	//JOptionPane.showMessageDialog(null, carro[I].modelo + );
	//JOptionPane.showMessageDialog(null, carro[I].placa);
	//JOptionPane.showMessageDialog(null, carro[I].veloMax);
	//JOptionPane.showMessageDialog(null, carro[I].combustivel);
	//JOptionPane.showMessageDialog(null, carro[I].valor);
	//JOptionPane.showMessageDialog(null, carro[I].cor);
	

}
