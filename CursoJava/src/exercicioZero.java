import java.util.Scanner;

public class exercicioZero {

    public static void main(String[] args) {

        double largura;
        double comprimento;
        double valor;

        Scanner sc = new Scanner(System.in);
        System.out.println("BEM-VINDO A CALCULADORA IMOBILIARIA");
        System.out.println("Digite a largura do terreno: ");
        largura = Double.parseDouble(sc.next());
        System.out.println("Digite o comprimento do terreno: ");
        comprimento = Double.parseDouble(sc.next());
        System.out.println("Digite valor do metro quadrado: ");
        valor = Double.parseDouble(sc.next());

        double area = (largura * comprimento);
        double preco = (area * valor);

        System.out.println("================================");
        System.out.printf("A área do terreno é de: %.2f%n", area, " metros quadrados.");
        System.out.println("================================");
        System.out.printf("O valor do terreno é de: %.2f%n", preco, " reais.");
        System.out.println("================================");

        sc.close();

    }

}
