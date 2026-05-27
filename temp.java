import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("C em F(1) / F em C (2)");
        int pergunta = scan.nextInt();
        if (pergunta == 1 ) {
            System.out.println("Informe valor em graus celcius:");
            int celcius = scan.nextInt();
            int farenheit = ((celcius * 9) / 5) + 32;
            System.out.println(celcius + " em " + "farenheit: "+ farenheit);
        } else if (pergunta == 2) {
            System.out.println("Informe valor em graus farenheit:");
            int farenheit = scan.nextInt();
            int celcius = ((farenheit - 32) * 5) / 9;
            System.out.println(farenheit + " em " + "graus: "+ celcius);
        } else {
            System.out.println("Erro");
        }


        scan.close();
    }
}
