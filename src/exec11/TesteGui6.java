package exec11;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteGui6 {

		private JFrame janela;
		private JPanel paineldaJanela;
		private JComboBox cbox;
		private String[] equipamentos = {"Monitor", "Teclado", "Mouse", "Scanner", "Modem"};
	
		public void IniciarGui() {
		
		//criar instancias
		janela = new JFrame("Exemplo de combo box: ");
		paineldaJanela = (JPanel) janela.getContentPane();
		cbox = new JComboBox(equipamentos);
	
		//configurações do combo box
		cbox.setSelectedIndex(-1);
		cbox.setBounds(10, 10, 300, 30);
		cbox.setMaximumRowCount(10);
		
		//configurações do painel da tela
		paineldaJanela.setLayout(null);
		paineldaJanela.add(cbox);
		
		//configurações da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 400);
		janela.setVisible(true);
		
	}
		
	public static void main(String[] args) {
		new TesteGui6().IniciarGui();
	}

}
