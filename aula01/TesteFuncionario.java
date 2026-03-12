package aula1;

import java.util.Scanner;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		Funcionario fun2 = new Funcionario();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		fun1.nome = into.next();//captura uma String
		System.out.println("Digite a idade: ");
		fun1.idade = into.nextInt();//captura numeros inteiros
		System.out.println("Digite o salario: ");
		fun1.sal = into.nextDouble();//captura numeros reais
		fun1.aumentar();
		
		System.out.println("\n\nDigite o nome: ");
		fun2.nome = into.next();//captura uma String
		System.out.println("Digite a idade: ");
		fun2.idade = into.nextInt();//captura numeros inteiros
		System.out.println("Digite o salario: ");
		fun2.sal = into.nextDouble();//captura numeros reais
		fun2.aumentar();
		
		System.out.println("O nome: "+fun1.nome);
		System.out.println("A idade: "+fun1.idade);
		System.out.println("O salario inicial: R$ "+fun1.sal);
		System.out.println("O aumento: R$ "+fun1.aum);
		System.out.println("O status: R$ "+fun1.status);
		
		System.out.println("O salario final: R$ "+(fun1.sal+fun1.aum));
		System.out.println("--------------------------");
		System.out.println("O nome: "+fun2.nome);
		System.out.println("A idade: "+fun2.idade);
		System.out.println("O salario inicial: R$ "+fun2.sal);
		System.out.println("O aumento: R$ "+fun2.aum);
		System.out.println("O status: R$ "+fun2.status);
		System.out.println("O salario final: R$ "+(fun2.sal+fun2.aum));
	}

}


