package br.com.positivo.run;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.positivo.classes.Curso;
import br.com.positivo.classes.Disciplina;
import br.com.positivo.classes.Estudante;
import br.com.positivo.classes.Professor;
import br.com.positivo.classes.Universidade;
import br.com.positivo.modelos.Cadastravel;

public class executavelInterativo {
		@SuppressWarnings("unlikely-arg-type")
		public static void main(String[] args) {
			int opcao;
			String nome, endereco, cpf;
			double salario;
			int matricula;
			Scanner menu = new Scanner(System.in);
			ArrayList<Curso> cursosVigentes = new ArrayList<Curso>();
			ArrayList<Disciplina> disciplinasVigentes = new ArrayList<Disciplina>();
			ArrayList<Cadastravel> cadastrados = new ArrayList<>();
			ArrayList<Professor> professoresCadastrados = new ArrayList<>();
			ArrayList<Estudante> alunos = new ArrayList<>();
			do {
	
				System.out.println("Selecione sua opção ao final da lista");
		        System.out.println("--MENU--");
		        System.out.println("");
		        System.out.println("1. Cadastrar Universidade");
		        System.out.println("2. Cadastrar estudante");
		        System.out.println("3. Cadastrar professor");
		        System.out.println("4. Cadastrar curso");
		        System.out.println("5. Cadastrar disciplina");
		        System.out.println("6. Mostrar todos os dados da Universidade");
		        System.out.println("7. Sair do Menu");
		        opcao = menu.nextInt();
		        
		        while(opcao < 1 || opcao > 7) {
		        	System.out.println("Essa opção é invalida, tente novamente!");
		        	opcao = menu.nextInt();
		        }
		        	
		        switch (opcao) {
		        case 1:
		        	//Cadastro de Universidade
		            System.out.println("Nome da Universidade: ");
		            nome = menu.next();
		            System.out.println("Endereço: ");
		            endereco = menu.next();
		            
		            Universidade uv = new Universidade(nome,endereco);
		            cadastrados.add(uv);
		            
		            break;
		        case 2:
		        	// Cadastro de estudante
	                System.out.println("Matrícula: ");
	                matricula = menu.nextInt();
	                System.out.println("Nome: ");
	                nome = menu.next();
	                System.out.println("Idade: ");
	                int idade= menu.nextInt();
	                System.out.println("Cpf: ");
	                cpf = menu.next();

	                Estudante estudante = new Estudante(matricula,cpf,nome,idade);
	                cadastrados.add(estudante);
	                alunos.add(estudante);
	                break;
	            case 3:
                // Cadastrar professor
	            	System.out.println("Nome: ");
	                nome = menu.next();
	                System.out.println("Idade: ");
	                idade= menu.nextInt();
	                System.out.println("Cpf: ");
	                cpf = menu.next();
                    System.out.println("Salário: ");
                    salario = menu.nextDouble();
                    
                    Professor professor = new Professor(salario, cpf, nome, idade);
                    cadastrados.add(professor);         
                    professoresCadastrados.add(professor);
                    break;
	            case 4:
	            	//Cadastro de curso
	            	System.out.print("Nome do curso: ");
                    String nomeCurso = menu.next();
                    
                    Curso curso = new Curso(nomeCurso);
                    cursosVigentes.add(curso);
                    
                    System.out.println("Esse curso ja tem "
                    		+ "disciplinas definidas?");
                    if(resposta(menu)) {
                    	do {
                    		System.out.println("Qual o nome da disciplina? ");
                        	String nomeDisciplina = menu.next();
                        	for (Disciplina disc : disciplinasVigentes ) {
    							if(disc.equals(nomeDisciplina)) {
    								curso.getListaDisciplina().add(disc);
    								System.out.println("Adicionado com sucesso!");
    							};
    						}
                        	System.out.println("Gostaria de cadastrar mais uma?");
                    	}while(resposta(menu));
                    }
		        	break;
                case 5:
                	//Cadastro de disciplina
                	System.out.println("Nome da disciplina: ");
                	nome = menu.next();
                	
                	Disciplina disciplina = new Disciplina(nome);
                	
                	System.out.println("Esta disciplina ja tem professor definido?");
                	
                	if(resposta(menu)) {
                		do{
							System.out.println("Professor: ");
							String nomeProfessor = menu.next();
							for (Professor prof : professoresCadastrados) {
								if (prof.equals(nomeProfessor)) {
									disciplina.setProfessor(prof);
								}
							}
							if (disciplina.getProfessor() == null) {
								System.out.println("O nome desse professor " 
										+ "não foi encontrado no cadastro!");
							}
	     
		                System.out.println("Gostaria de cadastrar mais um professor?");
			        	}while(resposta(menu));
                	}
                	System.out.println("Essa disciplina tem alunos vinculados?");
                	if( resposta(menu)) {
                		do {
                			System.out.println("Qual o nome do aluno? ");
                    		String nomeAluno = menu.next();
                    		boolean encontrado=false;
                    		for (Estudante aluno : alunos) {
                    			if(aluno.equals(nomeAluno)) {
                    				encontrado = true;
                    			}
							}
                    		if( !(encontrado) ) {
                    			System.out.println("O nome desse aluno "
                    					+ "não foi encontrado no cadastro!");
                    		}
                    		System.out.println("Gostaria de cadastrar mais um aluno"
                    				+ " nessa disciplina?");
                		}while(resposta(menu));
                	}
                	cadastrados.add(disciplina);
                	disciplinasVigentes.add(disciplina);
                	break;
                case 6:
		        	for (Cadastravel obj : cadastrados) {
						switch(obj.getTipo()) {
						case PROFESSOR:
							System.out.println("Professor: ");
							break;
						case CURSO:
							System.out.println("Curso: ");
							break;
						case DISCIPLINA:
							System.out.println("Disciplina: ");
							break;
						case ESTUDANTE:
							System.out.println("Estudante: ");
							break;
						case UNIVERSIDADE:
							System.out.println("Universidade: ");
							break;
						}
						System.out.println(obj);
					}
		        	System.out.println("O total de alunos é de:"+Estudante.total);
		        	System.out.println("O total de professores é de:"+Professor.total+"/n");
		        	break;
		        }    
		        
		}while(opcao != 7);
			menu.close();
	}
		public static boolean resposta(Scanner sc){
			String resposta=sc.next();
			if( resposta.equalsIgnoreCase("sim") ) {
				return true;
			}
			return false;
		}
}


	