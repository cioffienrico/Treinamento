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
 * Classe responsável por demonstrar a utilização de JCheckBox
 * 
 * @author ecioffi
 */

public class TesteGui5 {

	// declaração das variáveis
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

		// Configurações da label escolha
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento: ");
		lblEscolha.setBounds(42, 15, 208, 18);

		// Configurações da label resposta
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta: ");
		lblResposta.setBounds(42, 230, 300, 18);

		// configurações do check box Cartão de credito
		cbCC.setText("Cartão de Crédito: ");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);

		// configurações do check box Deposito bancario
		cbDB.setText("Depósito Bancário: ");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);

		// configurações do check box Boleto Bancario
		cbBB.setText("Boleto Bancário: ");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);

		// configurações do botão
		btnResposta.setText("Resposta");
		btnResposta.setBounds(146, 196, 83, 28);
		
		// adicionar ação do botão
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

		// configurações da tela
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
