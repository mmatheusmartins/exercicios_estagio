
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
}
