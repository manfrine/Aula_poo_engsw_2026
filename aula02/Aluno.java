package aula2;

public class Aluno {
	
	String nome;
	String curso;
	String status;
	Double n1;
	Double n2;
	Double media;
	
	void calcMedia() {
		media = (n1+n2)/2;
		if(media >=6.0)
			status = "Aprovado";
		else if(media >=4.0 && media < 6.0 )
			status = "Em exame";
		else
			status = "Reprovado";
	}
}
