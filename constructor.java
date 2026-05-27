import java.util.Scanner;

public class constructor {


    public static void main(String[] args) {
        Scanner epson = new Scanner(System.in); // CONSTRUCTOR é quando vc instancia um objeto
        
        
        
        String name = "olá";
        double price = 2.9;
        int quantity = 1;

        Product p = new Product(name; price; quantity);
        //permitir ou obrigar que o objeto receba dados
        
        
        System.out.println(p.name);
        System.out.println(p.price);
        System.out.println(p.quantity);
        
    epson.close();




    }
}
