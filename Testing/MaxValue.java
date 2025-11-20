public class MaxValue {

    public static void main(String[] arguments) {
    	// Enter the array elements that cause an ArrayIndexOutOfBoundsException
        System.out.println(findMax(new int[]{}));
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num: numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}