package view;

import java.util.Scanner;

import controller.ControllerFFatorial;

public class Principal {

	public static void main(String[] args) {
		ControllerFFatorial contFat = new ControllerFFatorial();
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		double fracaoFatorial = contFat.somaFracao(numero);
		System.out.println(fracaoFatorial);
		sc.close();
	}

}
