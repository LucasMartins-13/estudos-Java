import java.util.Scanner;

public class vetorAlturas {
    
    public static void main(String[] args) {
        Scanner epson = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor:  ");
        int n = epson.nextInt();
        epson.nextLine(); // limpa o ENTER


        infoAlturas[] vect = new infoAlturas[n];

        for (int i = 0; i < n; i++) {   // aqui eu to comparando I com N ma posso fazer isso tbm: 
            //                              i < vect.length -- nesse caso seria até melhor (MAIS COESO)
            System.out.println("Informe as parada:  ");

            System.out.println("Name: ");
            String name = epson.nextLine();
            System.out.println("name:  " + name);


            System.out.println("idade:  ");
            int idade = epson.nextInt();
            System.out.println("idade:  " + idade);

            System.out.println("altura:  ");
            double altura = epson.nextDouble();
            System.out.println("altura:  " + altura);



            epson.nextLine();

            vect[i] = new infoAlturas(name, idade, altura);
        }

        double mediaAltura = vect[n].getaltura() / n;
        System.out.println("Altura media: " + mediaAltura);
 
        int soma = 0;

        for (int i = 0; i < n; i++) {

            if (vect[i].getIdade() < 16) {
                soma = (int) (soma + vect[i].getIdade());
            }

        }
        System.out.println("Soma Total = " + soma);

        epson.close();
    }
}