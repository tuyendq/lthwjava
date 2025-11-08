import java.util.*;

public class MultipleTable {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer between 2 and 20: ");
        int N = sc.nextInt();
        sc.close();
        
        for (int i=1; i<=10; i++) {
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
