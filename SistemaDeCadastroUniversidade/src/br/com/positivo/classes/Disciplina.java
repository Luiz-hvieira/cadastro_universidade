package br.com.positivo.classes;

import java.util.ArrayList;

import br.com.positivo.modelos.Cadastravel;
import br.com.positivo.modelos.Classes;

public class Disciplina implements Cadastravel{
	//Atributos
	private Classes tipo;

	private String nome;
	private ArrayList<Estudante> listaEstudantes; 
	private Professor professor = null; 
	
	public Disciplina(String nome) {
		this.nome=nome;
		this.listaEstudantes = new ArrayList<Estudante>();
		this.tipo = Classes.DISCIPLINA;
	}
	/**
	 * @return the listaEstudantes
	 */
	public ArrayList<Estudante> getListaEstudantes() {
		return listaEstudantes;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	/**
	 * @return the professor
	 */
	public Professor getProfessor() {
		return professor;
	}
	@Override
	public String toString() {
		return (
				"Nome: "+ this.getNome() +"\n"+
				"Professor: "+this.getProfessor()+"\n"+
				"Estudantes cadastrados: "+this.getListaEstudantes()+"\n"
				)
				;
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
