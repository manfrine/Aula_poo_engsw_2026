package aula1;

public class TestePessoa {

	public static void main(String[] agrs) {
		
		Pessoa ob1 = new Pessoa();// instancia de uma classe
		Pessoa ob2 = new Pessoa();
		Pessoa ob3 = new Pessoa();
		
		ob1.nome = "João";
		ob1.idade = 25;
		ob1.salario = 4000.0;
		
		ob2.nome = "Maria";
		ob2.idade = 30;
		ob2.salario = 7000.0;
		
		ob3.nome = "Neymar";
		ob3.idade = 35;
		ob3.salario = 1000000.0;

		System.out.println("O nome da pessoa 1: "+ob1.nome);
		System.out.println("A idade da pessoa 1: "+ob1.idade);
		System.out.println("O salário da pessoa 1: R$ "+ob1.salario);
		ob1.hello();
		System.out.println("-------------------------------");
		System.out.println("O nome da pessoa 2: "+ob2.nome);
		System.out.println("A idade da pessoa 2: "+ob2.idade);
		System.out.println("O salário da pessoa 2: R$ "+ob2.salario);
		ob1.hello();
		System.out.println("-------------------------------");
		System.out.println("O nome da pessoa 3: "+ob3.nome);
		System.out.println("A idade da pessoa 3: "+ob3.idade);
		System.out.println("O salário da pessoa 3: R$ "+ob3.salario);
		System.out.println("-------------------------------");
		ob1.hello();
	}
}
