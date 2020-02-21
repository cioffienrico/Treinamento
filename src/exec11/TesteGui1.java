package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui1 {

	//Declarar as variaveis de referencia
	private static JFrame janela;
	private static JButton botao;
	
	public static void main(String[] args) {
		
		//Criar uma nova tela(instancia)
		janela = new JFrame("Minha primeira tela");
		//Criar um novo botão
		botao = new JButton("Clique aqui!");
		//Adicionar o botao ao painel da janela
		janela.getContentPane().add(botao);
		
		//configura o tamanho da tela 
		janela.setSize(300, 300);
		//Configurar a visibilidade da tela (true/false)
		janela.setVisible(true);
		//Informar que a tela nao tem layout pre definido
		janela.getContentPane().setLayout(null);
		
		
		
	}
}
