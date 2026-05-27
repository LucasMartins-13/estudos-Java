import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;


public class arrayVetor{ 
    //array seria basicamente um conjunto de elementos(objeto) do mesmo tipo
    //para acessa-lo deve ser usado indices
    //pré-definição de quantidade de vetores

    //matriz e vetor são basicamente arrays, porém vetor é um array de 1dimensão e matriz com mais de uma dimencao



    public static void main(String[] args) {

        Scanner epson = new Scanner(System.in);

        //posso usar o Int ou Integer, bascimante o Integer já se trata de um obj, e refconhece Int, Double 

        int[] arrayVetor = new int[6]; // 
        for (int i = 0; i < 6; i++ ) { //
            arrayVetor[i] = epson.nextInt(); // a cada instancia do array, com o scanner o usuario coloca dados nos vetores
        }
        System.out.println(arrayVetor[2]); 
        //

        //sempre completar uma matriz da direita pra esquerda

        int[][] arrayMatriz = new int[3][3]; // Matriz 3x3
        for (int i = 0; i < 3; i++){ // coloquei i < 3 pq lá na matriz começa com 3

            for (int j = 0; j < 3; j++ ){ // Basicamente o oprimeiro for vai representar o primeiro 3 da matriz
                                          // e o segundo for representará o segundo 3  
                arrayMatriz[i][j] = epson.nextInt();
            }
        }
        System.out.println(arrayMatriz[2][3]); 

        epson.close();
    }
}