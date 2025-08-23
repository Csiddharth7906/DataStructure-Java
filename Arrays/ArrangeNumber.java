import java.util.Scanner;

public class ArrangeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int left = 0, right = n - 1;
        int i = 1;
        
        while (i <= n) {
            if (i % 2 != 0) { 
                arr[left] = i;
                left++;
            } else {
                arr[right] = i;
                right--;
            }
            i++;
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
