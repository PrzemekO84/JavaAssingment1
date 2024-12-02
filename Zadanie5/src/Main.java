import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/textFile");

        ArrayList<int[]> rows = new ArrayList<>();

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();

            String[] parts = line.split(" ");
            int[] row = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                row[i] = Integer.parseInt(parts[i]);
            }
            rows.add(row);
        }




        int[][] matrix = rows.toArray(new int[rows.size()][]);


        System.out.println("Matrix read from the file:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        if(isMagicSquare(matrix)){
            System.out.println("The matrix is a magic square");
        }
        else{
            System.out.println("The matrix is not a magic square");
        }


    }
    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;


        for (int[] row : matrix) {
            if (row.length != n) {
                return false;
            }
        }


        int magicSum = 0;
        for (int num : matrix[0]) {
            magicSum += num;
        }

        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int num : matrix[i]) {
                rowSum += num;
            }
            if (rowSum != magicSum) {
                return false;
            }
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }

        int primaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];
        }
        if (primaryDiagonalSum != magicSum) {
            return false;
        }

        int secondaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }
        if (secondaryDiagonalSum != magicSum) {
            return false;
        }

        return true;
    }
}
