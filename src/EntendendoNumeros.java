import java.util.Scanner;
public class EntendendoNumeros {
//Criar um Programa onde o usu�rio digite 2 valores
//e realizemos a soma entre eles
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int valor1;
	int valor2;
	int soma, subtracao, multiplicacao;
	double divisao;
	
	System.out.println("CALCULADORA");
	System.out.println("Por Favor, digite um valor");
	valor1 = leitor.nextInt();
	System.out.println("Por favor digite mais um valor");
	
	valor2 = leitor.nextInt();
	soma = valor1 + valor2;
	subtracao = valor1 - valor2;
	multiplicacao = valor1 * valor2;
	divisao = valor1 / (double)valor2;
			
	System.out.println("O resultado da soma foi" + soma);
	System.out.println("O resultado da subtra��o foi " + subtracao);
	System.out.println("O produto da multiplica��o foi " + multiplicacao);
	System.out.println("O resultado da divisao foi " + divisao);
	leitor.close();

	}

}
