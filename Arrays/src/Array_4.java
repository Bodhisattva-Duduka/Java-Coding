public class Array_4 {
    public static void main(String args[]) {
        // int[][] matrix_A = new int[2][3];
        // matrix_A[0][0] = 49;
        // matrix_A[0][1] = 63;
        // matrix_A[0][2] = 35;
        // matrix_A[1][0] = 86;
        // matrix_A[1][1] = 75;
        // matrix_A[1][2] = 92;
        // int[][] matrix_B = new int[2][3];
        // matrix_B[0][0] = 76;
        // matrix_B[0][1] = 23;
        // matrix_B[0][2] = 79;
        // matrix_B[1][0] = 37;
        // matrix_B[1][1] = 95;
        // matrix_B[1][2] = 47;
        // int[][] matrix_C = new int[2][3];
        // matrix_C[0][0] = matrix_A[0][0] + matrix_B[0][0];
        // matrix_C[0][1] = matrix_A[0][1] + matrix_B[0][1];
        // matrix_C[0][2] = matrix_A[0][2] + matrix_B[0][2];
        // matrix_C[1][0] = matrix_A[1][0] + matrix_B[1][0];
        // matrix_C[1][1] = matrix_A[1][1] + matrix_B[1][1];
        // matrix_C[1][2] = matrix_A[1][2] + matrix_B[1][2];
        // System.out.println(" ___     ___");
        // System.out.println("|" + matrix_C[0][0] + " " + matrix_C[0][1] + " " + matrix_C[0][2] + " |");
        // System.out.println("|" + matrix_C[1][0] + " " + matrix_C[1][1] + " " + matrix_C[1][2] + "|");
        // System.out.println(" ---     ---");
        int[][] matrix_A ={
            {12,34,54},
            {234,56,76}
        };
        int[][] matrix_B ={
            {54,65,94},
            {65,87,46}
        };
        int[][] matrix_C ={
            {0,0,0},
            {0,0,0}
        };
        for(int i = 0; i<matrix_A.length; i++)
            {
                for(int j = 0; j<matrix_B[i].length; j++)
                    {
                        matrix_C[i][j] = matrix_A[i][j] + matrix_B[i][j];
                    }
            }
        for(int i = 0; i<matrix_C.length; i++)
            {
                for(int j = 0; j<matrix_C[i].length; j++)
                    {
                        System.out.print(matrix_C[i][j] + " ");
                    }
                System.out.println();
            }
    }
}