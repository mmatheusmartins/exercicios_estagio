import java.util.Iterator;

public class Metodos {
	public String Fibonacci(int num) {
		int anterior = 0, atual = 1, proximo = 0;
		String str = "";
		while (num > atual) {
			proximo = atual + anterior;
			anterior = atual;
			atual = proximo;
		}
		if (num == 1 || num == 0) {
			str = num + " Pertence a sequência de números Fibonacci \n";
		} else if (num == atual) {
			str = num + " Pertence a sequência de números Fibonacci \n";
		} else if (num < atual) {
			str = num + " Não pertence a sequência de números Fibonacci \n";
		}
		return str;
	}

	public String inverterCaracteres(String str) {
		char str1[] = str.toCharArray();
		char str2[] = new char[str.length()];
		String palavra = "";
		int tamanho = str1.length - 1;

		for (int i = 0; i < str1.length; i++) {
			str2[tamanho] = str1[i];
			tamanho--;
		}
		palavra = palavra.valueOf(str2);
		return palavra;
	}
}
