/**
 * 
 */
package br.com.positivo.classes;

import br.com.positivo.modelos.Cadastravel;
import br.com.positivo.modelos.Classes;
import br.com.positivo.modelos.Pessoa;

public class Estudante extends Pessoa implements Cadastravel{
	//Atributos
	private Classes tipo;
	private int matricula; 
	public static int total;
	public Estudante(int matricula,String cpf, String nome, int idade) {
		super(cpf,nome,idade);
		this.matricula = matricula;
		total++;
		this.tipo = Classes.ESTUDANTE;
	}
	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}
	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}
	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	@Override
	public String toString() {
		
		return ("Classe: "+this.getClass()+
		"Nome: "+this.getNome() +"\n"+
		"Cpf: "+this.getCpf() +"\n"+
		"Idade: "+this.getIdade() +"\n"+
		"Matricula: "+this.getMatricula() +"\n"
		
		);
	}
	@Override
	public boolean equals(Object obj) {
		return obj.equals(this.getNome());
	}
	/**
	 * @return the tipo
	 */
	public Classes getTipo() {
		return tipo;
	}
	
}
