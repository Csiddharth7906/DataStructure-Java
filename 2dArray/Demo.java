import java.util.Scanner;

public class Demo {
    public static int[][] takeinput(int[][] arr) {
        Scanner sc = new Scanner(System.in);
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

    public static void main(String[] args) {
        int arr[][] = new int[3][4];  // 3 rows, 4 columns
        takeinput(arr);
        print(arr);
    }
}
