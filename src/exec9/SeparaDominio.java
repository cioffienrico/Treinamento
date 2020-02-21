package exec9;

import javax.swing.JOptionPane;

public class SeparaDominio {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog(null, "Informe o email: ", "validador de email", 3);
		//String email = JOptionPane.showInputDialog("Informe o email: ");
	int cont = email.indexOf("@");
	if (cont > 0) {
	System.out.println("Posição do @: " + cont);
	}
	String dominio = email.substring(cont+1);
	System.out.println("Dominio do email: " + dominio);
	
	String usuario = email.substring(0, cont);
	
	System.out.println("Usuario do email: " + usuario);
	
	}
}
