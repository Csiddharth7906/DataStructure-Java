import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String reverseStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr+=str.charAt(i);
        }
        System.out.println(reverseStr);
    }
}
