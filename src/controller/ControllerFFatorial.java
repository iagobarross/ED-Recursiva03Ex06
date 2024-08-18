/*6. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
inteiro (N), apresente a saída da somatória
𝑆𝑆 = 1 + 1 + 1 + 1 + ... + 1
        2!  3!  4!        n!

• O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;*/
package controller;

public class ControllerFFatorial {
	
	public ControllerFFatorial() {
		super();
	}
	
	public double somaFracao(int numero) {
		double soma = 0;
		if(numero == 1) {
			return 1; //Quando numero for igual a 1, retorna 1 para a soma.
		} else {
			soma += 1 / (double)fatorial(numero);
			return soma + somaFracao(numero - 1);//Enquanto numero maior que 1, soma a variavel com 1/recursiva do fatorial e chama a funcao com o número anterior.
		}
	}
	
	public int fatorial(int numero) {
		if(numero == 1) {
			return 1; //O fatorial acaba quando o numero chegar a 1, retornando 1 para a multiplicação.
		} else {
			return numero * fatorial(numero - 1);//Enquanto numero for maior que 1, retorna a multiplicacao de numero com a recursiva.
		}
	}
}
