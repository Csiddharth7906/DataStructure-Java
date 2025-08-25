import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class BinarySearch{
    public static void print(int input[]){
        System.out.println("This is Array in which you need to search item");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if (i < input.length - 1) {
                System.out.print(", ");
            }
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }


    public  static int Search(int arr[],int key){
         int start=0;
         int end=arr.length-1;
         while(start<=end){
             int mid=(start+end)/2;
             if(arr[mid]==key){
                 return mid;
             }
             else if(arr[mid]<key){
                 start=mid+1;
             }
             else{
                 end=mid-1;
             }


         }
         return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {
                2, 5, 7, 9, 12, 15, 18, 20, 23, 25,
                27, 29, 30, 33, 35, 37, 40, 42, 45, 47,
                49, 50, 52, 54, 55, 57, 59, 60, 62, 64,
                65, 67, 68, 70, 72, 73, 75, 77, 78, 80,
                81, 83, 84, 85, 87, 88, 89, 90, 92, 93,
                94, 95, 96, 97, 98, 99, 100
        };
        print(arr);
        System.out.println("Search Your fav item or value index ");
        int key=sc.nextInt();
        System.out.println(Search(arr,key));


    }
}
