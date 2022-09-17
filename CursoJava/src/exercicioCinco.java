import java.util.Scanner;

public class exercicioCinco {

    public static void main(String[] args) {

        // MINHA SOLUCAO

        Scanner scn = new Scanner(System.in);

        int codeUm;
        int codeDois;

        double vunitUm, qtUm;
        double vunitDois, qtDois;

        System.out.println("BEM-VINDO A CALCULADORA DE PREÇOS");
        System.out.println("Digite o numero da peça: ");
        codeUm = scn.nextInt();
        System.out.println("Digite o valor da peça: ");
        vunitUm = scn.nextDouble();
        System.out.println("Digite a quantidade de peças " + codeUm);
        qtUm = scn.nextDouble();

        double subUm = vunitUm * qtUm;

        System.out.println("Digite o numero da peça: ");
        codeDois = scn.nextInt();
        System.out.println("Digite o valor da peça: ");
        vunitDois = scn.nextDouble();
        System.out.println("Digite a quantidade de peças " + codeDois);
        qtDois = scn.nextDouble();

        double subDois = vunitDois * qtDois;

        double totalFinal = subUm + subDois;

        System.out.println("==================================");
        System.out.printf("Total a pagar: R$ %.2f%n", totalFinal);
        System.out.println("==================================");

        // SOLUCAO DO GABARITO

        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();

    }

}
