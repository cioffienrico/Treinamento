package exec9;

public class ConversorString {

	public static void main(String[] args) {
		
		String lista[] = new String[5];
		lista[0]= "java";
		String str = lista[0];
		String maiuscula = str.toUpperCase();
		String minuscula = str.toLowerCase();
		System.out.println("Original: " + str);
		System.out.println("Maiuscula: " + maiuscula);
		System.out.println("Minuscula: " + minuscula);
		
	}
}
