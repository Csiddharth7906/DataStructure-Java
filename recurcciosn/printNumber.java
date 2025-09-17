import java.util.Scanner;

public class printNumber {
    public static void findNumber(int n){
        if(n == 0) return;
        findNumber(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        findNumber(num);
    }
}
