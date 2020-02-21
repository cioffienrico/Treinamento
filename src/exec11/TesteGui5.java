package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Classe respons�vel por demonstrar a utiliza��o de JCheckBox
 * 
 * @author ecioffi
 */

public class TesteGui5 {

	// declara��o das vari�veis
	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btnResposta;
	private JPanel painelDaJanela;

	public void iniciaGui() {

		// criar as instancias
		janela = new JFrame("Exemplo de check box");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbBB = new JCheckBox();
		cbDB = new JCheckBox();
		btnResposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// Configura��es da label escolha
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento: ");
		lblEscolha.setBounds(42, 15, 208, 18);

		// Configura��es da label resposta
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta: ");
		lblResposta.setBounds(42, 230, 300, 18);

		// configura��es do check box Cart�o de credito
		cbCC.setText("Cart�o de Cr�dito: ");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);

		// configura��es do check box Deposito bancario
		cbDB.setText("Dep�sito Banc�rio: ");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);

		// configura��es do check box Boleto Bancario
		cbBB.setText("Boleto Banc�rio: ");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);

		// configura��es do bot�o
		btnResposta.setText("Resposta");
		btnResposta.setBounds(146, 196, 83, 28);
		
		// adicionar a��o do bot�o
		btnResposta.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						verificaSelecionado();
						
					}
				});


		// Adicionar componentes no painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(cbCC);
		painelDaJanela.add(cbDB);
		painelDaJanela.add(cbBB);
		painelDaJanela.add(btnResposta);
		painelDaJanela.add(lblResposta);

		// configura��es da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(390, 300);
		janela.setVisible(true);

		// fim do metodo iniciaGui

	}
	
	public void verificaSelecionado() {
		//verificar qual radio button foi selecionado
		String resposta = "";
		if(cbCC.isSelected()) {
		resposta += cbCC.getText();
		}
		if(cbDB.isSelected()) {
		resposta += cbDB.getText();
		}
		if(cbBB.isSelected()) {
		resposta += cbBB.getText();
		}
		
		if(!resposta.equals("")) {
			
			lblEscolha.setText(resposta);
		}
		resposta = "";
	}
	
	

	public static void main(String[] args) {
		new TesteGui5().iniciaGui();

	}
}
