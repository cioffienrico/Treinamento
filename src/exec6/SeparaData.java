package exec6;

public class SeparaData {

	public static void main(String[] args) {

		//M�todo para separar o dia, m�s, ano
		String data2 = "09/06/1999";
		String datas2[] = data2.split("/");
		System.out.println("Segunda separa��o");
		System.out.println(datas2[0]);
		System.out.println(datas2[1]);
		System.out.println(datas2[2]);
	}

}
