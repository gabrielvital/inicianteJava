import java.util.Scanner;

public class exercicioQuatro {

    public static void main(String[] args) {

        // MINHA SOLUCAO

        Scanner scn = new Scanner(System.in);

        int nmr;
        double hrs;
        double valorHrs;

        System.out.println("BEM-VINDO A CALCULADORA SALARIAL");
        System.out.println("Digite o numero do funcionario: ");
        nmr = scn.nextInt();
        System.out.println("Digite o numero de horas trabalhadas: ");
        hrs = scn.nextDouble();
        System.out.println("Digite o valor da hora trabalhada: ");
        valorHrs = scn.nextDouble();

        double slrio = hrs * valorHrs;

        System.out.println("FUNCIONARIO Nº: " + nmr);
        System.out.printf("SALARIO: R$ %.2f%n", slrio);

        // SOLUCAO DO GABARITO

        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = valorHora * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();


    }

}
