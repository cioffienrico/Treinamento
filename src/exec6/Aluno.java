package exec6;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Aluno  {
		
	String nome;
	int anoNascimento;
	String curso;
	String cidade;
	String dataNascimento;
	public Aluno() {
	
	}
	

	public Aluno(String nome, int anoNascimento, String curso, String cidade, String dataNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.curso = curso;
		this.cidade = cidade;
		this.dataNascimento = dataNascimento;
	}
	
	public int ExibirIdade() {
		
		Year y = Year.now();
		int anoAtual = y.getValue();
		int idade = (anoAtual - anoNascimento);
		return idade;
	}
	
	public void ExibirTudo() {
		
		System.out.println(ExibirIdade());
		System.out.println(nome);
		System.out.println(curso);
		System.out.println(cidade);
		System.out.println(anoNascimento);
	
	}
}