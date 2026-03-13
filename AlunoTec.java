package aula2;

public class AlunoTec extends Aluno{

	Double n3;
	
	void calcMedia() {
		media = (n1+n2+n3)/3;
		if(media >=5.0)
			status = "Aprovado";
		else
			status = "Reprovado";
	}
}
