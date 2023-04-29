package matrix;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            ///Take input from the user
            Scanner sc = new Scanner(System.in);

            int m, n;                 //Matrix Size Declaration

            System.out.println("Enter the number of rows: \n");
            m = sc.nextInt();  //Matrix Size Initialization

            System.out.println("Enter the number of column: \n");
            n = sc.nextInt();  //Matrix Size Initialization

            int arr[][] = new int[10][10];        //Matrix Size Declaration
            System.out.println("Enter the elements of the matrix: ");
            for (int i = 0; i < m; i++)    //Matrix Initialization
            {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            //Print the original Matrix
            System.out.println("The elements in the original matrix are: ");
            for (int i = 0; i < m; i++)     //Print the matrix
            {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }

            int brr[][] = new int[10][10];        //Transpose Matrix Declaration
            for (int i = 0; i < m; i++)     //Transpose Matrix initialization
            {
                for (int j = 0; j < n; j++) {
                    brr[j][i] = arr[i][j];     //Store elements in the transpose matrix
                }
            }

            System.out.println("After transposing the elements are: ");
            for (int i = 0; i < m; i++)      //Print the transpose matrix
            {
                for (int j = 0; j < n; j++) {
                    System.out.print(brr[i][j] + " ");
                }
                System.out.println("");
            }

        }
    }
