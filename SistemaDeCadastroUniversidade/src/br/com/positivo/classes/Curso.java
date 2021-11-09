package br.com.positivo.classes;

import java.util.ArrayList;

import br.com.positivo.modelos.Cadastravel;
import br.com.positivo.modelos.Classes;

public class Curso implements Cadastravel{
	//Atributos
	private Classes tipo;

	private String nome;
	private ArrayList<Disciplina> listaDisciplina;
	private int codigoCurso;
	public Curso(String nome ) {
		this.nome=nome;
		this.listaDisciplina = new ArrayList<Disciplina>();
		this.tipo=Classes.CURSO;
	}
	/**
	 * @return the listaDisciplina
	 */
	public ArrayList<Disciplina> getListaDisciplina() {
		return listaDisciplina;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the codigoCurso
	 */
	public int getCodigoCurso() {
		return codigoCurso;
	}
	@Override
	public String toString() {
		return ( 
				"Nome: "+ this.getNome()+"\n"+
				"Disciplinas: "+this.getListaDisciplina()+"\n"
				
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
