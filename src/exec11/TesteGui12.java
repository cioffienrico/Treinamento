package exec11;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TesteGui12 {

	//declaração das variáveis de referência
	private JFrame janela;
	private JList list;
	private JLabel label;
	private JPanel painelDaJanela;
	private JScrollPane scroll;
private String[] diaSemana = {"Domingo", "Segunda", "Terca",
							  "Quarta", "Quinta", "Sexta",
							  "Sabado"};

public void IniciaGui() {
	
	//criar as instancias
	janela = new JFrame("Exemplo de lista");
	painelDaJanela = (JPanel) janela.getContentPane();
	list = new JList(diaSemana);
	label = new JLabel("CTRL para multiseleções", JLabel.CENTER);
	scroll = new JScrollPane(list);
	
	//configura parametro da lista
	list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	
	list.addListSelectionListener(new ListSelectionListener(){

		public void valueChanged(ListSelectionEvent arg0) {
			label.setText(list.getSelectedValue().toString());
		}
	});	
		
		
		
	//configurações do scroll
	scroll.setBounds(10, 60, 300, 90);
	
	//atributos do rotulo(label)
	label.setOpaque(true);
	label.setBackground(Color.lightGray);
	label.setForeground(Color.black);
	label.setBounds(10, 10, 300, 30);

	//configurações do painel da janela
	painelDaJanela.setLayout(null);
	painelDaJanela.add(label);
	painelDaJanela.add(scroll);
	
	//configuração da janela
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setSize(400, 300);
	janela.setVisible(true);
	
}

	
}
