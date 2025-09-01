public class ReverseWordWise {
    public static String Reverse(String str){
        String rev="";
        for (int i = 0; i < str.length() ; i++) {
            rev = str.charAt(i)+rev;

        }
        return rev;
    }
    public static  String Rev(String str){
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
        int currentend=i-1;
        String rev="";
        for (int j = curentWordStart; j <=currentend ; j++) {
            rev=str.charAt(j)+rev;
        }
        ans +=rev;
        return ans;
    }

    public static void main(String[] args) {
        String str="logic comes before code";
        String rev=Reverse(str);
        System.out.println(Rev(rev));


    }
}
