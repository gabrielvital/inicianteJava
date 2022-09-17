import java.util.Locale;
import java.util.Scanner;

public class exercicioSeis {

    public static void main(String[] args) {

        // MINHA SOLUCAO

        Scanner scn = new Scanner(System.in);

        float a, b, c;
        float p = (float) 3.14159;

        System.out.println("VALOR A: ");
        a = scn.nextFloat();
        System.out.println("VALOR B: ");
        b = scn.nextFloat();
        System.out.println("VALOR C: ");
        c = scn.nextFloat();

        System.out.println("RESULTADO: ");
        System.out.printf("TRIANGULO: %.3f%n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f%n", (c * c) * p);
        System.out.printf("TRAPEZIO: %.3f%n", ((a + b) * c) / 2);
        System.out.printf("QUADRADO: %.3f%n", b * b);
        System.out.printf("RETANGULO: %.3f%n", a * b);

        // SOLUCAO DO GABARITO

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();

    }
}
