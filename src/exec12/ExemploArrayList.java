package exec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

public static void main(String[] args) {
	
	//criar um objeto ArrayList
	List <String> arrayList = new ArrayList<String>();
	
	//adicionar elementos ao final da lista, usamos o metodo add
	arrayList.add("Elemento nº1");
	arrayList.add("Elemento nº2");
	arrayList.add("Elemento nº3");
	
	System.out.println("Posição 1 contem: "+  arrayList.get(0));
	System.out.println("Posição 2 contem: "+  arrayList.get(1));
	System.out.println("Posição 3 contem: "+  arrayList.get(2));

	for (String s: arrayList) {
		System.out.println(s);
	}

	//também podemos adicionar um elemento numa posição qualquer
	arrayList.add(1, "Elemento nº1,5");
	System.out.println("\nApós adicionar o elemento 1,5: \n");
	
	for (String s: arrayList) {
		System.out.println(s);
			
	}

	//obter o tamanho da lista
	System.out.println("\nO tamanho da lista é: " + arrayList.size() + "\n");

	//podemos ver um determinado valor na lista
	if(arrayList.contains("Elemento nº1,5")) {
		System.out.println("Elemento 1,5 existe");
	}else { 
		System.out.println("Elemento 1,5 não existe");
	}
	
	int indice = arrayList.indexOf("Elemento nº1,5");
	System.out.println("\nO indice do Elemento 1,5 é: " + indice );
	
	//remover um elemento da lista
	System.out.println("\nRemovendo elemento 1,5\n");
	arrayList.remove("Elemento nº1,5");
	System.out.println("Lista atualizada");		
	
	for (String s: arrayList) {
		System.out.println(s);
	}

	//remover com base no indice = remover ultimo registro
	System.out.println("\nRemovendo o ultimo elemento\n");
	arrayList.remove(arrayList.size() -1);
	System.out.println("Lista Atualizada");
	
	for (String s: arrayList) {
		System.out.println(s);

	}

	//adicionando elementos na lista
	System.out.println("\nAdicionando elementos na lista");
	arrayList.add("Elemento nº5");
	arrayList.add("Elemento nº9");
	arrayList.add("Elemento nº4");
	arrayList.add("Elemento nº0");
	arrayList.add("Elemento nº8");

	//exibir a lista atualizada
	System.out.println("\nLista com elementos adicionados");
	for (String s: arrayList) {
		System.out.println(s);

	}

	//ordenando array list
	Collections.sort(arrayList);
	System.out.println("\nLista ordenada");
	for (String s: arrayList) {
		System.out.println(s);
	}

	//criando uma lista de objeto - filme
	List<Filme> arrayListFilme = new ArrayList<Filme>();
	
	//criando 3 filmes
	Filme filme1 = new Filme();
	filme1.setCodigo(1);
	filme1.setNome("Codigo de conduta");
	
	Filme filme2 = new Filme();
	filme2.setCodigo(2);
	filme2.setNome("Era do Gelo");
	
	Filme filme3 = new Filme();
	filme3.setCodigo(3);
	filme3.setNome("Matrix");
	
	if (filme1.equals(filme2)) {
		System.out.println("\nFilmes Iguais\n");
	}else {
		System.out.println("\nFilmes diferentes\n");
	}

	//adicionar na lista os filmes instanciados
	arrayListFilme.add(filme1);
	arrayListFilme.add(filme2);
	arrayListFilme.add(filme3);

	//exibindo a lista de filme
	for (Filme f : arrayListFilme) {
		System.out.println(f);
	}

	//ordenar uma lista
	/*System.out.println("Lista ordenada");
	Collections.sort((List<T>)arrayListFilme);
	for (Filme f : arrayListFilme) {
		System.out.println(f);
	
}*/

}
}