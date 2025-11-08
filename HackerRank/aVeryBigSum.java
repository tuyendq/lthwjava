import java.util.*;


public class aVeryBigSum{

    static long BigSum(int n, long ar[]){
        long sum = 0;
        for (int i = 0; i < n; i++){
            sum += ar[i];
        }
        return sum;
    }

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
       
        System.out.println("The number of integers in array is (from 1 to 10):");
        int n = Integer.parseInt(scan.nextLine().trim());

        long[] ar = new long[n];
        System.out.println("Type in " + n + " integers, separated by a space:");

        String[] arItems = scan.nextLine().split(" ");
        for (int arItr = 0; arItr < n; arItr++){
            long arItem = Long.parseLong(arItems[arItr].trim());
            ar[arItr] = arItem;
        }
        
        long result = BigSum(n, ar);

        System.out.println("The sum is: " + String.valueOf(result));

        scan.close();
    }

}