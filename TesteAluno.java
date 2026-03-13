package aula2;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		AlunoTec at = new AlunoTec();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = into.next();
		System.out.println("Digite o curso do aluno: ");
		aluno.curso = into.next();
		System.out.println("Digite o n1 do aluno: ");
		aluno.n1 = into.nextDouble();
		System.out.println("Digite o n2 do aluno: ");
		aluno.n2 = into.nextDouble();
		aluno.calcMedia();
		
		System.out.println("Digite o nome do aluno Técnico: ");
		at.nome = into.next();
		System.out.println("Digite o curso do aluno: ");
		at.curso = into.next();
		System.out.println("Digite o n1 do aluno: ");
		at.n1 = into.nextDouble();
		System.out.println("Digite o n2 do aluno: ");
		at.n2 = into.nextDouble();
		System.out.println("Digite o n3 do aluno: ");
		at.n3 = into.nextDouble();
		at.calcMedia();
		
		
		
		System.out.println("O nome do aluno: "+aluno.nome);
		System.out.println("O curso do aluno: "+aluno.curso);
		System.out.println("A media do aluno: "+aluno.media);
		
		

	}

}
