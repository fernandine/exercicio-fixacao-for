package application;

import java.util.Scanner;

/*
 Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
public class p13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite x");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i%2!=0) {
			System.out.println(i);
		}
		
			sc.close();
	}

}
}
