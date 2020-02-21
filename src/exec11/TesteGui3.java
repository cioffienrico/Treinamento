package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TesteGui3 {

	//Declarar os componentes de tela
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;
	
	public TesteGui3() {
		IniciaGui();
	}
	
	public void IniciaGui() {
		
		//cria a janela (instancia)
		janela = new JFrame();
		//cria a area de texto
		area = new JTextArea();
		//Criar o primeiro botão
		botao1 = new JButton("Clique aqui");
		//Adicionar o metodo desenvolvido na classe TextoListener
		botao1.addActionListener(new TextoListener());
		
		//Criar o segundo botão
		botao2 = new JButton("Trocar cor");
		
		//Adicionar o metodo desenvolvido na classe CorListener
		botao2.addActionListener(new CorListener());
		
		//Cria um campo para digitar texto
		campo = new JTextField();	
		//Adicionar o metodo desenvolvido na classe TextoListener
		campo.addActionListener(new TextoListener());
		//Adicionar o botão 1 ao painel da janela
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		//Adicionar o botão 2 ao painel da janela
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		//Adicionar a area ao painel da janela
		janela.getContentPane().add(BorderLayout.CENTER, area);
		//Adicionar JTextField ao painel da janela
		janela.getContentPane().add(BorderLayout.NORTH, campo);
		//Configurar o tamanho da tela
		janela.setSize(300, 300);
		//Configurar a visibilidade da tela
		janela.setVisible(true);
		
	}
	
	public class TextoListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			area.append(campo.getText() + "\n");
			campo.setText("");
			
		}
	}
	
	public class CorListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			//se fundo for neutro troca para preto
			if (area.getBackground().equals(Color.BLACK)) {
				//fundo
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);
			}else {
				area.setBackground(Color.BLACK);
				area.setForeground(Color.WHITE);
			
			}
		}	
	}
	public static void main(String[] args) {
		new TesteGui3();
	
	}
	
}

