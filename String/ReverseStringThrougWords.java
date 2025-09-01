
public class ReverseStringThrougWords {
    public static void main(String[] args) {
        String str="Hello My Name is Siddharth";
        String ans="";
        int curentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                int curentWordEnd = i-1;
                String rev = "";
                for (int j = curentWordStart; j <= curentWordEnd; j++) {
                    rev = str.charAt(j)+rev;
                }
                ans += rev +" ";
                curentWordStart=i+1;
            }
        }

        int curentWordEnd = i - 1;
        String rev = "";
        for (int j = curentWordStart; j <= curentWordEnd; j++) {
            rev = str.charAt(j) + rev;
        }
        ans += rev;

        System.out.println(ans);
    }
}
