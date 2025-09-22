public class RemoveStrings {
    public static String RemoveX(String str){
        if(0==str.length()) return str;
        String ans="";
        if(str.charAt(0)!='x')
             ans+=str.charAt(0);
        String smallans=RemoveX(str.substring(1));
        return ans+smallans;
    }


    public static void main(String[] args) {
        String str="Sxixddxhaxrtxh";

        System.out.println( RemoveX(str));
    }
}
