package exec8;

import javax.swing.JOptionPane;

public class CaixaEletronico {
	
	static int nota50 = 0;
	static int nota20 = 0;
	static int nota10 = 0;
	static int nota5 = 0;
	static int nota2 = 0;
	public static void main(String[] args) {
			
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado: "));
		
		if(valor == 1 || valor == 3 || valor <= 0) {
			JOptionPane.showMessageDialog(null, "Não é possível sacar esse valor");
			}else {
		
		if (valor <= 3 && valor != 2) { 
			nota5 = 0;
			String notas = "Notas de 50: " + nota50 + "\nNotas de 20: " +  nota20 + "\nNotas de 10: " + nota10 + "\nNotas de 5: " + nota5 + "\nNotas de 2: " + nota2;
			JOptionPane.showMessageDialog(null, notas );
			}else if(valor == 2){
				String notas = "Notas de 50: " + nota50 + "\nNotas de 20: " +  nota20 + "\nNotas de 10: " + nota10 + "\nNotas de 5: " + nota5 + "\nNotas de 2: " + nota2 + 1;
				JOptionPane.showMessageDialog(null, notas );
			}else {
				
		if(valor %2 == 1) {	
		
		valor = valor -5;
		nota5 = nota5 +1;	
		}	
		
		while(valor >= 50) {
			valor = valor - 50;
			nota50 = nota50 +1;
	
		}
		
		while(valor >= 20) {
			valor = valor - 20;
			nota20 = nota20 +1;
	
		}
		
		while(valor >= 10) {
			valor = valor - 10;
			nota10 = nota10 +1;
	
		}
		
		while(valor >= 2) {
			valor = valor - 2;
			nota2 = nota2 +1;
	
		}
		
		
		
		String notas = "Notas de 50: " + nota50 + "\nNotas de 20: " +  nota20 + "\nNotas de 10: " + nota10 + "\nNotas de 5: " + nota5 + "\nNotas de 2: " + nota2;
		JOptionPane.showMessageDialog(null, notas );
		
		}
		}
	}
}