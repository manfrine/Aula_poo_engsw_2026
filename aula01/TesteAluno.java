package aula1;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = into.next();
		System.out.println("Digite a disciplina do aluno: ");
		aluno.disciplina= into.next();
		System.out.println("Digite o n1 do aluno: ");
		aluno.n1 = into.nextDouble();
		System.out.println("Digite o nome do aluno: ");
		aluno.n2 = into.nextDouble();
		aluno.calcMedia();
		
		System.out.println("O nome do aluno: "+aluno.nome);
		System.out.println("A disciplina do aluno: "+aluno.disciplina);
		System.out.println("A media do aluno: "+aluno.media);
		System.out.println("O status do aluno: "+aluno.status);
	}

}
