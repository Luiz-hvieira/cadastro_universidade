package br.com.positivo.classes;

import br.com.positivo.modelos.Cadastravel;
import br.com.positivo.modelos.Classes;
import br.com.positivo.modelos.Pessoa;

public class Professor extends Pessoa implements Cadastravel{
	//Atributos 
	private Classes tipo;
	private double salario; 
	public static int total;
	public Professor(double salario, String cpf, String nome, int idade) {
		super(cpf,nome,idade);
		this.salario = salario;
		total++;
		tipo=Classes.PROFESSOR;
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	@Override
	public int getIdade() {
		return super.getIdade();
	}
	@Override
	public String getCpf() {
		return super.getCpf();
	}
	@Override
	public String getNome() {
		return super.getNome();
	}
	@Override
	public String toString() {
		return ("Nome: "+this.getNome() +"\n"+
				"Cpf: "+this.getCpf() +"\n"+
				"Idade: "+this.getIdade() +"\n"+
				"Salario: "+this.getSalario() +"\n"
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
