import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra = "";
		System.out.println("Digite uma palavra");
		if (scan.hasNext()) {
			palavra = scan.nextLine();
		}
		Metodos m = new Metodos();
		System.out.println("A palavra " + palavra + " invertida é: " + m.inverterCaracteres(palavra));
	}
}
