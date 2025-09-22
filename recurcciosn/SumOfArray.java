public class SumOfArray {
    public static int Sum(int arr[],int idx){
       if(idx==arr.length) return 0;
       return arr[idx] + Sum(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(Sum(arr,0));
    }
}
