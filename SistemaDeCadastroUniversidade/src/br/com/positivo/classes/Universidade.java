package br.com.positivo.classes;

import java.util.ArrayList;

import br.com.positivo.modelos.Cadastravel;
import br.com.positivo.modelos.Classes;

public class Universidade implements Cadastravel {
	//Atributos 
	private String nome, endereco; 
	private ArrayList<Curso> listaCursos ;
	private Classes tipo;

	public Universidade(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
		this.listaCursos = new ArrayList<Curso>();
		this.tipo = Classes.UNIVERSIDADE;
	}
	/**
	 * @return the listaCursos
	 */
	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	@Override
	public String toString() {
		return ("Nome: "+this.getNome()+"\n"+
	"Endereço: "+this.getEndereco()+"\n"+
	"Lista dos cursos: "+this.getListaCursos()+"\n"
				);
	}
	/**
	 * @return the tipo
	 */
	public Classes getTipo() {
		return tipo;
	}
	
}
