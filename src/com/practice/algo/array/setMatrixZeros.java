package algo.array;

public class setMatrixZeros {

    private static void markForZeros(int[][] matrix) {
        int colSize = matrix[0].length;
        int rowSize = matrix.length;

        boolean isRowZero = false;
        boolean isColZero = false;

        //set isRowZero
        for (int j = 0; j < colSize; j++) {
            if (matrix[0][j] == 0) {
                isRowZero = true;
                break;
            }
        }

        //set isColumnZero
        for (int i = 0; i < rowSize; i++) {
            if (matrix[i][0] == 0) {
                isColZero = true;
                break;
            }
        }

        //if element is zero, mark first row and first col zero
        for (int i = 1; i < rowSize; i++) {
            for (int j = 1; j < colSize; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //if first col or first row is zero, mark current element as zero
        for (int i = 1; i < rowSize; i++) {
            for (int j = 1; j < colSize; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        //mark first row as zero
        if (isRowZero) {
            for (int j = 0; j < colSize; j++) {
                matrix[0][j] = 0;
            }
        }

        //mark first col as zero
        if (isColZero) {
            for (int i = 0; i < rowSize; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;

        matrix[1][0] = 1;
        matrix[1][1] = 0;
        matrix[1][2] = 1;

        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        markForZeros(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1)
                    matrix[i][j] = 0;
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}