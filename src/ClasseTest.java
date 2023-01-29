import java.util.Scanner;

public class ClasseTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ciao ragazzi!");
		System.out.println("Inserisci un nome:");
		String nome = scan.nextLine();
		System.out.println("Questo e il nome che hai scelto:");
		System.out.println(nome);
	}
}
