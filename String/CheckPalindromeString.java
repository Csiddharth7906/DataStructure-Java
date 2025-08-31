public class CheckPalindromeString {
    public static void main(String[] args) {
        String str="abba";
//        String str2="";
//        for (int i = 0; i <= str.length()-1; i++) {
//            str2=str.charAt(i)+str2;
//        }
//        if(str.equals(str2)){
//            System.out.println("String is palindrome");
//        }else{
//            System.out.println("String is not palindrome");
//        }
        //TWO POINTER
        int first=0;
        int last=str.length()-1;
        boolean isPalindrome = true;

        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {
                isPalindrome = false;
                break;
            }
            first++;
            last--;
        }

        if (isPalindrome) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
