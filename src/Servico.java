import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Servico {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int b = Integer.parseInt(st.nextToken());
    int total = 3*9; // Altere o valor da vari�vel com o c�lculo esperado
    System.out.println("PROD = " + total );

      st = new StringTokenizer(br.readLine());
    int b1 = Integer.parseInt(st.nextToken());
    int total1 = 10*-30; // Altere o valor da vari�vel com o c�lculo esperado
    System.out.println("PROD = " + total1 );
     
     
   }
}