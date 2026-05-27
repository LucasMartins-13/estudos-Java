import java.util.Scanner;


public class vetores2 {
    
    public static void main(String[] args) {
        Scanner epson = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor:  ");
        int n = epson.nextInt();
        epson.nextLine(); // limpa o ENTER


        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {   // aqui eu to comparando I com N ma posso fazer isso tbm: 
            //                              i < vect.length -- nesse caso seria até melhor (MAIS COESO)
            System.out.println("Informe as parada:  ");

            System.out.println("Name: ");
            String name = epson.nextLine();
            System.out.println("name:  " + name);

            System.out.println("preco:  ");
            double preco = epson.nextDouble();
            System.out.println("preco:  " + preco);
            epson.nextLine();

            vect[i] = new Product(name, preco);
        }

        
        System.out.println("posição 2:  " + vect[2].getName());


        System.out.println("");
        epson.close();
    }
}
