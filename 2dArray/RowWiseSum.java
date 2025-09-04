import java.util.Scanner;

public class RowWiseSum {
    public static int[][] takeinput(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element of array");
        int [][] arr1 = arr;
        for (int i = 0; i < arr1.length; i++) {            // rows
            for (int j = 0; j < arr1[i].length; j++) {     // columns
                arr1[i][j] = sc.nextInt();
            }
        }
        return arr1;
    }
    public static void print(int[][] arr) {
        int [][] arr1 = arr;
        for (int i = 0; i < arr1.length; i++) {            // rows
            for (int j = 0; j < arr1[i].length; j++) {     // columns
                System.out.print("arr[" + i + "][" + j + "]=" + arr1[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public  static void  swap(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            int sum=0;

            for (int j = 0; j < arr[i].length ; j++) {
                sum+=arr[i][j];

            }
            System.out.print(sum + " "); // har row ka sum ek line mein
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array");
        int row= sc.nextInt();
        int col=sc.nextInt();
    int arr[][]=new int[row][col];
        takeinput(arr);
        swap(arr);
        print(arr);
    }
}

