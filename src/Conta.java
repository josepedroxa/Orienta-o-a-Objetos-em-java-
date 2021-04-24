
import java.util.Scanner;

public class Conta {

	public static Conta getInstance() {
		Conta instance = new Conta();
		return instance;
	}

	public void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
			int num = entrada.nextInt ();
			for (int i = 0; i <= num ; i++) { 
			    System.out.println("I = " + i);
			}
		}

    }
}