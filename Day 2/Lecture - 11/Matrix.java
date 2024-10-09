import java.util.*;

public class Matrix {

    public static void serchElementInMatrix(int matrix[][], int target) {
        int row = -1;
        int col = -1;

        for (int i = 0; i < matrix.length; i++) {
            boolean found = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    row = i;
                    col = j;
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }

        System.out.println(row + " " + col);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of row : ");
        int row = sc.nextInt();

        System.out.println("Enter the value of col : ");
        int col = sc.nextInt();

        // Ways to deifne 2d array in java
        int[][] matrix = new int[row][col];

        // Second way
        // int matrix[][] = new int [row][col];

        System.out.println("Enter the values in matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Priting the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search for a given number in matrix and give its index if present else give
        // -1 -1
        serchElementInMatrix(matrix, 9);

        sc.close();
    }
}
