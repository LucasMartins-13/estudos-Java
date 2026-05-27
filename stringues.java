import java.util.Scanner;
public class stringues {
    public static void main(String[] args) {
        Scanner epson = new Scanner(System.in);

        System.out.println("escreve a parada ai");
        String teste = epson.nextLine();
        String teste2 = "str de comparacao";

        System.out.println(teste.getClass()); // informa a classe do objeto printado
        System.out.println(teste2.equals(teste2)); //retorna true se o objeto for igual o outro em class
        System.out.println(teste.hashCode()); //retorna o hashCode de um objeto
        
        Double teste3 = 50.0;
        System.out.println(teste3.toString()); //transforma em str
        epson.close();


    }


}