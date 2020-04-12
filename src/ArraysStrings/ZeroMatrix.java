package ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {

    static void zeroMatrix (int N, int matrix[][]) {
        int matrixAux[][] = new int[N][N];
        List<Integer> col = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        //puts original zeros on matrix;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                    matrixAux[i][j] = 0;
                } else {
                    matrixAux[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (row.contains(i)) {
                for (int j = 0; j < N; j++) {
                    matrixAux[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < N; j++) {
            if (col.contains(j)) {
                for (int i = 0; i < N; i++) {
                    matrixAux[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(matrixAux[i][j] == 1)
                    matrixAux[i][j] = matrix[i][j];
            }
        }
        displayMatrix(N, matrixAux);

    }

    // Function to print the matrix - 
    static void displayMatrix(int N, int matrix[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + matrix[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int N = 4;

        // Test Case 1
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 0, 7, 8},
                {9, 10, 11, 0},
                {13, 14, 15, 16}
        };

        zeroMatrix(N, matrix);
    }
}