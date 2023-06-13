package ArraysAndStrings;

import CtCILibrary.CtCILibrary.AssortedMethods;

public class ZeroMatrix {
    /**
     * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
     */
    public static void zeroMatrix(int[][] matrix)
    {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        //Storing the rows and columns with 0 values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0)
                {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        //Nullify rows
        for (int i = 0; i < row.length; i++) {
            if(row[i]) nullifyRow(matrix, i);
        }
        //Nullify cols
        for (int j = 0; j < col.length; j++) {
            if(col[j]) nullifyColumn(matrix, j);
        }
    }
    public static void nullifyRow(int[][] matrix, int row)
    {
        for(int j=0; j<matrix[0].length; j++)
        {
            matrix[row][j] = 0;
        }
    }

    public static void nullifyColumn(int[][] matrix, int col)
    {
        for(int i=0; i<matrix.length; i++)
        {
            matrix[i][col] = 0;
        }
    }

    public static void main(String[] args) {
        int nrows = 10;
        int ncols = 15;
        int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);
        AssortedMethods.printMatrix(matrix);
        zeroMatrix(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }
}
