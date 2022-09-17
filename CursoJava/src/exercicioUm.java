import java.util.Scanner;

public class exercicioUm {

    public static void main(String[] args) {

        // MINHA SOLUCAO

        int x;
        int y;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        int soma = (x + y);

        System.out.println("SOMA = " + soma);

        // SOLUCAO DO GABARITO

        Scanner scc = new Scanner(System.in);

        int A, B, sum;

        A = sc.nextInt();
        B = sc.nextInt();

        sum = A + B;

        System.out.println("SOMA = " + sum);

        scc.close();

    }

}
