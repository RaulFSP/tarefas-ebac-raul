package main;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double n1,n2,n3,n4;
		System.out.print("primeira nota: ");
		n1 = sc.nextDouble();
		System.out.print("segunda nota: ");
		n2 = sc.nextDouble();
		System.out.print("terceira nota: ");
		n3 = sc.nextDouble();
		System.out.print("quarta nota: ");
		n4 = sc.nextDouble();
		double media = mediaAluno(n1, n2, n3, n4);
		String resultado = statusAluno(media);
		System.out.printf("O aluno com nota %.2f está %s.%n",media,resultado);
		sc.close();
	}
	
	static double mediaAluno(double n1,double n2,double n3,double n4) {
		double resultado = (n1+n2+n3+n4)/4.0;
		return resultado;
	}
	
	static String statusAluno(double media) {
		String resultado;
		if (media >= 7) {
			resultado = "aprovado";
		} else if (media >= 5) {
			resultado = "em recuperação";
		} else {
			resultado = "reprovado";
		}
		return resultado;
	}
}
