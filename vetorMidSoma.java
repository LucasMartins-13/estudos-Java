import java.util.Scanner;

public class vetorMidSoma {
    public static void main(String[] args) {
        
        Scanner hp = new Scanner(System.in);
        System.out.println("escreve ai a quantidade de vetor");
        int var1 = hp.nextInt();

        int vect[] = new int[var1];

        for (int i = 0; i < var1; i++) {
            System.out.println("informa os numeros");
            vect[i] = hp.nextInt();

        }   

        int soma = 0;
        for (int i = 0;  i < var1; i++) {
            soma = soma + vect[i];
            if (i == var1 - 1) {
                System.out.println("Soma Total = " + soma);
            }
        }

        int media = soma / var1;
        
        System.out.println(media);


        hp.close();
    }
}