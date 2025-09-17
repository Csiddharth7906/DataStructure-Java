
public class NumberOfDigits {
    public static int countDigit(int n) {
        if (n == 0) return 0;
        int smallans=countDigit(n/10);
        return smallans+1;
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(countDigit(n));
    }
}

