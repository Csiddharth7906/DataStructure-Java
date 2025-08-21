import java.util.Scanner;
public class FindLargest {
        public static int[] takeInput(){
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int [] input = new int[size];
            for(int i=0;i<size;i++){
                input[i]=sc.nextInt();
            }
            return input;

        }
        public  static void print(int input[]){
            int size=input.length;
            for(int i=0;i<size;i++){
                System.out.print(input[i]+" ");
            }
            System.out.println();
        }
    public static void main(String args[]){
       int arr[] = takeInput();
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
           if(arr[i]<min){
               min=arr[i];
           }

       }
       System.out.println("Maximum value is this  ="+ max);
        System.out.println("Minimum value is this  ="+ min);

//       print(arr);
    }

}
