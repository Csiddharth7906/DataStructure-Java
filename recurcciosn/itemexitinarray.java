import java.util.Scanner;

public class itemexitinarray {
    public static boolean CheckValue(int arr[],int key,int idx){
        if(arr.length==idx){
            return false;
        }
        if(arr[idx]==key){
            return true;
        }
       return CheckValue(arr,key,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]= {2,3,4,5,8};
        int key=sc.nextInt();
        System.out.println(CheckValue(arr,key,0));
    }
}
