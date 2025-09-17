import java.util.Scanner;

public class FindXandNpower {
    public static int  power(int n,int x){
        if(x==0){
            return 1;
        }
        int pow=power(n,x-1);
        return n*pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(power(n,x));
    }
}
