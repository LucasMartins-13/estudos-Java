import java.util.Scanner;

public class vetores {
    //Arranjo ou Array Unidimensional

    public static void main(String[] args) {
        Scanner epson = new Scanner(System.in);
        
        int var1 = epson.nextInt();
    
        int vect[] = new int[var1];

        for (int i = 0; i < var1; i++) {
            vect[i] = epson.nextInt();
        }

        System.out.println("posição 2: " + vect[2]);






        epson.close();
    }
}
