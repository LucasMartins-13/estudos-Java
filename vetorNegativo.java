import java.util.Scanner;

public class vetorNegativo {
    public static void main(String[] args) {
        
        Scanner hp = new Scanner(System.in);
        System.out.println("escreve ai a quantidade de vetor");
        int var1 = hp.nextInt();

        int vect[] = new int[var1];

        for (int i = 0; i < var1; i++) {
            System.out.println("informa os numeros");
            vect[i] = hp.nextInt();

        }   

        for (int i = 0;  i < var1; i++ ) {
            if (vect[i] < 0 ){ 
                System.out.println("negativo: " + vect[i]);
            } else if (vect[i] > 0 ) {
                System.out.println("Positivo: " + vect[i] );

            }
        }
        hp.close();
    }
}
