import java.util.Locale;
import java.util.Scanner;

public class exercicioDois {

    public static void main(String[] args) {

        // MINHA SOLUCAO

        double raio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        raio = Double.parseDouble(sc.next());

        double pi = 3.14159;
        double area = (raio * raio) * pi;

        System.out.printf("A=%.4f%n", area);

        // SOLUCAO DO GABARITO

        Locale.setDefault(Locale.US);
        Scanner scc = new Scanner(System.in);

        double R, A, pI = 3.14159;

        R = sc.nextDouble();

        A = pI * R * R;

        System.out.printf("A=%.4f%n", A);

        scc.close();


    }

}
