package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; mat.length < n; i++){ // linha da matriz
            for (int j = 0; j < mat[i].length; j++){  // coluna da matriz
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int neg = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){  // mesmo tamanho do vetor
               if (mat[i][j] < 0){
                   neg++;

               }
            }
        }
        System.out.print("Negative numbers = " + neg);
        sc.close();

    }
}
