import java.io.*;
import java.util.*;

public class ADiagonalDifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {
        int firstSum =0;
        int secondSum = 0;
        int size = a.length;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (j == i) {
                    firstSum += a[i][j];                    
                }
                if (j == size - 1 - i) {
                    secondSum += a[i][j];
                }                
            }
        }        
        return Math.abs(firstSum - secondSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] aRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int aItem = Integer.parseInt(aRowItems[j]);
                a[i][j] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
