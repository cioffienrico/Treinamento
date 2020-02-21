package exec10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Teste04 {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("entrada.txt");
			InputStreamReader isr = new InputStreamReader(is);
			
			BufferedReader leitor = new BufferedReader(isr);
			
			String texto = leitor.readLine();
		
			while(texto != null){
				System.out.println(texto);
			texto = leitor.readLine();
			}
		}
		catch (Exception e) {
			System.out.println("arquivo de entrada nao encontrado");
		}
		
	
	}

}
