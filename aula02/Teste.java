package aula2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Funcionario fun = new Funcionario();
		Gerente ger = new Gerente();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionario: ");
		fun.nome = into.next();
		System.out.println("Digite a idade do funcionario: ");
		fun.idade = into.nextInt();
		System.out.println("Digite o salário do funcionario: ");
		fun.salario = into.nextDouble();
		
		System.out.println("\nDigite o nome do Gerente: ");
		ger.nome = into.next();
		System.out.println("Digite a idade do Gerente: ");
		ger.idade = into.nextInt();
		System.out.println("Digite o salario do Gerente: ");
		ger.salario = into.nextDouble();
		System.out.println("Digite a comissão do Gerente: ");
		ger.comissao = into.nextDouble();
		System.out.println("Digite o endereço do Gerente: ");
		ger.endereco = into.next();
		
		System.out.println("--------------------------------");
		System.out.println("\nO nome: "+fun.nome);
		System.out.println("A idade: "+fun.idade);
		System.out.println("O salario: R$ "+fun.salario);
		System.out.println("--------------------------------");
		System.out.println("\nO nome do gerente: "+ger.nome);
		System.out.println("A idade: "+ger.idade);
		System.out.println("O salario: R$ "+ger.salario);
		System.out.println("A comissão: R$ "+ger.comissao);
		System.out.println("O salario final: R$ "+(ger.comissao+ger.salario));
		System.out.println("Endereço:  "+ger.endereco);

	}

}



