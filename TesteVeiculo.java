package aula2;

import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {

		Veiculo v = new Veiculo();
		Moto m = new Moto();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o modelo do carro: ");
		v.modelo = into.next();
		System.out.println("Digite a marca do carro: ");
		v.marca = into.next();
		System.out.println("Digite a cor do carro: ");
		v.cor = into.next();
		System.out.println("Digite o valor do carro: ");
		v.valor = into.nextDouble();
		v.calcIpva();
		System.out.println("------------------------");
		System.out.println("Digite o modelo da moto: ");
		m.modelo = into.next();
		System.out.println("Digite a marca da moto: ");
		m.marca = into.next();
		System.out.println("Digite a cor da moto: ");
		m.cor = into.next();
		System.out.println("Digite o valor da moto: ");
		m.valor = into.nextDouble();
		System.out.println("Digite as cilindradas da moto: ");
		m.cilindradas = into.nextInt();
		m.calcIpva();
		System.out.println("------------------------");
		System.out.println("O  carro: "+v.modelo);
		System.out.println("A marca: "+v.marca);
		System.out.println("A cor: "+v.cor);
		System.out.println("O valor: R$ "+v.valor);
		System.out.println("O IPVA do carro: R$ "+v.ipva);
		System.out.println("------------------------");
		System.out.println("A moto: "+m.modelo);
		System.out.println("A marca: "+m.marca);
		System.out.println("A cor: "+m.cor);
		System.out.println("As cilindradas:  "+m.cilindradas);
		System.out.println("O valor: R$ "+m.valor);
		System.out.println("O IPVA do carro: R$ "+m.ipva);

	}

}
