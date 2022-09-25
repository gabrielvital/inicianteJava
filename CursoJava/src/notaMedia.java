import java.util.Scanner;
public class notaMedia {

    public static void main(String[] args) {
        int A1;
        int A2;
        int A3;

        Scanner sc = new Scanner(System.in);
        System.out.println("BEM-VINDO A CALCULADORA UNIVERSITARIA");
        System.out.println("Nota da A1: ");
        A1 = sc.nextInt();
        System.out.println("Nota da A2: ");
        A2 = sc.nextInt();
        System.out.println("Nota da A3: ");
        A3 = sc.nextInt();

        double notaFinal;

        notaFinal = ((A1 * 0.30) + (A2 * 0.30) + (A3 * 0.40));

        System.out.printf("Sua nota final é: %.2f%n", notaFinal);

        if (notaFinal >= 7.00) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

    }

}
