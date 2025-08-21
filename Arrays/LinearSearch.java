import java.util.Scanner;

public class LinearSearch {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int[] input = new int[size];
        System.out.println("Enter the array values:");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void print(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static int search(int[] input, int key) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInput();
        print(arr); 
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        int index = search(arr, key);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found.");
        }
        sc.close();
    }
}
