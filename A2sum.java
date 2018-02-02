import java.util.Arrays;
 
public class A2sum {
 
    public static void main(String[] args) {
        long sum = 9;
        int[] arr = {2,7,11,15};
 
        System.out.println(Arrays.toString(ans(arr, sum)));
    }
 
    public static int[] ans(int[] a, long target) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            long sum = a[i] + a[j];
            if (sum == target)
                return new int[]{i, j};
            if (sum < target) i++;
            else j--;
        }
        return null;
    }
}