public class PrintAllSubStrings {
    public static void main(String[] args) {
        String str="PQRST";

//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i; j < str.length(); j++) {
//                System.out.println(str.substring(i,j+1));
//            }
//        }
        for (int len=1;len<=str.length();len++){
            for (int i = 0; i <= str.length()-len; i++) {
                int end=i+len-1;
                System.out.println(str.substring(i,end+1));
            }
        }

    }
}
