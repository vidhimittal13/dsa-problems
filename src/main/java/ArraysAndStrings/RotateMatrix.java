package ArraysAndStrings;

import CtCILibrary.CtCILibrary.AssortedMethods;

public class RotateMatrix {
    /**
     * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
     * write a method to rotate the image by 90 degrees.
     * Can you do this in place?
     */
    public static boolean rotateMatrix(int[][] matrix)
    {
        if(matrix.length!=matrix[0].length) return false;

        int n = matrix.length;

        //Transposing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reversing the matrix
        for (int i = 0; i < n; i++) {
            int p1 = 0, p2 = n-1;
            while(p1!=p2)
            {
                int temp = matrix[i][p1];
                matrix[i][p1] = matrix[i][p2];
                matrix[i][p2] = temp;
                p1++;
                p2--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
        AssortedMethods.printMatrix(matrix);
        rotateMatrix(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }
}
