import java.util.Scanner;

public class functionEstudos {
    public static void main(String[] args) {
        Scanner epson = new Scanner(System.in);

        System.out.println("escreva 5 numeros:");
        int a = epson.nextInt();
        int b = epson.nextInt();
        int c = epson.nextInt();

        int maior = max(a, b, c);
         
        System.out.println(maior);

        epson.close();
    }

    public static int max(int f, int g, int h) {
        int var1;

        if (f > g && f > h) {
            var1 = f;
        } else if (g > h) {
            var1 = g;
        } else {
            var1 = h;
        }
        return var1;
    }


}
