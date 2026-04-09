import java.util.Scanner;

public class SomaComEntrada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        Scanner a = entrada.nextInt();
        System.out.println("Digite o segundo numero:");
        int b = entrada.nextInt();
        int soma = a + b;
        System.out.println("A soma e: " + soma);
        
// chamei o main2, com o argumento da entrada
//entrada = Scanner
// entao o main2 continua recebendo o Scanner e quando ele termina eu fecho o scanner

        main2(entrada);
        main3(entrada);

    //fecha o scanner
        entrada.close();
    }
//
    public static void main2(Scanner entrada1) {
// recebe o scanner e depois renomeia ele como Scanner entrada1
        System.out.println("Digite o primeiro numero:");

        int a = entrada1.nextInt();
            
        System.out.println("Digite o segundo numero:");

        int b = entrada1.nextInt();

        int sub = a - b;

        System.out.println("A sob e: " + sub);
    }
//prox passo == adicionar soma decimal

    public static void main3(Scanner entrada2) {

        System.out.println("teste");

        double a = entrada2.nextDouble();

        System.out.println("Digite o segundo valor (pode ter decimal):");

        double b = entrada2.nextDouble();

        double soma = a + b;

        System.out.println("A soma e: " + soma);

        entrada2.close();


    }


}

