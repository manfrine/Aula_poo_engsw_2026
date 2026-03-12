package aula1;

public class Funcionario {

	String nome;
	String status;
	int idade;
	double sal;
	double aum;
	
	void aumentar() {
		if(idade <=23) {
			aum = 0.0;
			status = "Sem Aumento";
		}else if(idade <=40) {
			aum = sal*0.1;
			status = "Aumentou 10zão";
		}else {
			aum = sal*0.15;
			status = "Aumentou 15zão";
		}
	}
}



