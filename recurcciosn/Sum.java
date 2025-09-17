public class Sum {
    public static int sumNum(int n){
        if(n==0){
            return 0;
        }
        int sum=sumNum(n-1);
        System.out.println(sum);
        return n+sum;
    }
    public static void main(String[] args) {
         int n=10;
         int and=sumNum(n);
        System.out.println(and);
    }
}
