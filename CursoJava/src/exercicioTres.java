import java.util.Scanner;

public class exercicioTres {

     public static void main(String[] args) {

         // MINHA SOLUCAO

         int a, b, c, d;

         Scanner sc = new Scanner(System.in);

         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
         d = sc.nextInt();

         int diferenca = ((a * b) - (c * d));

         System.out.println("DIFERENCA = " + diferenca);

         // sc.close();

         // SOLUCAO DO GABARITO

         Scanner scc = new Scanner(System.in);

         int A, B, C, D, dif;

         A = scc.nextInt();
         B = scc.nextInt();
         C = scc.nextInt();
         D = scc.nextInt();

         dif = A * B - C * D;

         System.out.println("DIFERENCA = " + dif);

         scc.close();


     }

}
