package aula1;

public class Aluno {

	String nome;
	String status;
	Double n1;
	Double n2;
	Double media;
	String disciplina;
	
	void calcMedia() {
		media = (n1+n2)/2;
		if(media >=5)
			status = "Aprovado";
		else
			status = "Reprovado";
	}
}
