package exec6;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class TestaAluno {

	public static void main(String[] args) {
		
		String dataCompleta = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		String data[] = dataCompleta.split("/");
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);
		
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		
		int ano1 = cal.get(Calendar.YEAR);
		int mes1 = (1+ cal.get(Calendar.MONTH));
		int dia1 = cal.get(Calendar.DAY_OF_MONTH);
		
		
		
		DateTime dataInicial = new DateTime(ano, mes, dia, 0, 0);
		DateTime dataFinal = new DateTime(ano1, mes1, dia1, 0, 0);
		
		int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
		
		System.out.println("O numero de dias vividos é: " + dias);
		
		
		
		//Aluno al1 = new Aluno("Enrico", 1999, "ADS", "Osasco", "09/06/1999");
		//al1.ExibirTudo();
		
		
		}
		
		
	}
