package br.com.positivo.modelos;

public abstract class Pessoa {
	//Atributos
	private String cpf, nome; 
	private int idade;
	 
	 public Pessoa(String cpf, String nome, int idade) {
		 this.cpf = cpf;
		 this.idade = idade;
		 this.nome = nome;
	 }
	 /**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}
}
