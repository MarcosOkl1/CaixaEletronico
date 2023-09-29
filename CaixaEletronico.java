package QA;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Caixa Eletronico");
		System.out.println("");
		System.out.println("");
		System.out.println("1-Abastecimento");
		System.out.println("");
		System.out.println("2-Operações financeiras");
		System.out.println("");
		System.out.println("");
		System.out.println("Digite a opção desejada: ");
		int opcao=sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu a opção abastecimento");
			break;
		case 2:
			System.out.println("Você escolheu a opção Operações financeiras");
			break;
		default:
			System.out.println("A opção escolhida e inexistente. Selecione apenas 1 ou 2");
			break;
		}
		System.out.println("Digite um número correspondente a nota que sera abastecida:");
		int nota = sc.nextInt();
		switch (nota) 
		{
		case 1:
			System.out.println("Digite o numero de notas de 200 depositadas: ");
			int nota200=sc.nextInt();
			nota200=nota200*200;
			break;
		case 2:
			System.out.println("Digite o numero de notas de 100 depositadas: ");
			int nota100=sc.nextInt();
			nota100=nota100*100;
			break;
		case 3:
			System.out.println("Digite o numero de notas de 50 depositadas: ");
			int nota50=sc.nextInt();
			nota50=nota50*50;
			break;
		case 4:
			System.out.println("Digite o numero de notas de 20 depositadas: ");
			int nota20=sc.nextInt();
			nota20=nota20*20;
			break;
		case 5:
			System.out.println("Digite o numero de notas de 10 depositadas: ");
			int nota10=sc.nextInt();
			nota10=nota10*10;
			break;
		case 6:
			System.out.println("Digite o numero de notas de 5 depositadas: ");
			int nota5=sc.nextInt();
			nota5=nota5*5;
			break;
		case 7:
			System.out.println("Digite o numero de notas de 2 depositadas: ");
			int nota2=sc.nextInt();
			nota2=nota2*2;
			break;
		
		default:
			System.out.println("Não possui notas correspondentes");
			break;
		}
			
		}
		
}
