package exec9;

public class Trim {

	public static void main(String[] args) {
		String um = "Olá ";
		String dois = "Mundo ";
		System.out.println("antes do trim: " + um + dois + ".");
		
		um = um.trim();
		dois = dois.trim();
		System.out.println("depois do trim:"+um+dois+".");
		
		
	}
}
