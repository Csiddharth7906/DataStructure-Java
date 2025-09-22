import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Main class to handle the menu and user interaction.
 * The application is divided into separate classes for modularity.
 * It includes robust exception handling and additional functionalities.
 */
public class MenuDrivenApp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Starting the Menu-Driven Application...");
        while (true) {
            try {
                System.out.println("\n=== Main Menu ===");
                System.out.println("1. Array Operations");
                System.out.println("2. String Operations");
                System.out.println("3. Number Operations");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over.

                switch (choice) {
                    case 1:
                        ArrayOperations.handleArrayMenu(scanner);
                        break;
                    case 2:
                        StringOperations.handleStringMenu(scanner);
                        break;
                    case 3:
                        NumberOperations.handleNumberMenu(scanner);
                        break;
                    case 0:
                        System.out.println("Exiting application. Goodbye!");
                        return;
                    default:
                        System.out.println("❌ Invalid choice! Please enter a number from the menu.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input from the buffer.
            }
        }
    }
}

/**
 * Class for all array-related operations, including sorting and searching.
 */
class ArrayOperations {
    public static void handleArrayMenu(Scanner scanner) {
        while (true) {
            try {
                System.out.println("\n--- Array Operations ---");
                System.out.println("1. Sort Array (Bubble Sort)");
                System.out.println("2. Search in Array (Linear & Binary Search)");
                System.out.println("0. Back to Main Menu");
                System.out.print("Enter your choice: ");
                int arrChoice = scanner.nextInt();
                if (arrChoice == 0) {
                    return;
                }

                System.out.print("Enter the number of elements in the array: ");
                int size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("❌ Array size must be a positive integer.");
                    continue;
                }
                int[] arr = new int[size];
                System.out.println("Enter " + size + " integer elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }

                switch (arrChoice) {
                    case 1:
                        System.out.println("Original array: " + Arrays.toString(arr));
                        System.out.println("1. Iterative Bubble Sort  2. Recursive Bubble Sort");
                        System.out.print("Choose sorting method: ");
                        int sortChoice = scanner.nextInt();
                        if (sortChoice == 1) {
                            bubbleSortIterative(arr);
                        } else if (sortChoice == 2) {
                            bubbleSortRecursive(arr, arr.length);
                        } else {
                            System.out.println("❌ Invalid choice. Returning to array menu.");
                            continue;
                        }
                        System.out.println("Sorted array: " + Arrays.toString(arr));
                        break;

                    case 2:
                        System.out.print("Enter the key to search for: ");
                        int key = scanner.nextInt();
                        System.out.println("1. Linear Search  2. Binary Search");
                        System.out.print("Choose search method: ");
                        int searchChoice = scanner.nextInt();
                        int index = -1;

                        if (searchChoice == 1) {
                            System.out.println("1. Iterative  2. Recursive");
                            System.out.print("Choose linear search method: ");
                            int linearMethod = scanner.nextInt();
                            index = (linearMethod == 1) ? linearSearchIterative(arr, key) : linearSearchRecursive(arr, arr.length - 1, key);
                        } else if (searchChoice == 2) {
                            Arrays.sort(arr); // Binary search requires a sorted array.
                            System.out.println("Sorted array for Binary Search: " + Arrays.toString(arr));
                            System.out.println("1. Iterative Binary Search  2. Recursive Binary Search");
                            System.out.print("Choose binary search method: ");
                            int binaryMethod = scanner.nextInt();
                            if (binaryMethod == 1) {
                                index = binarySearchIterative(arr, key);
                            } else if (binaryMethod == 2) {
                                index = binarySearchRecursive(arr, 0, arr.length - 1, key);
                            } else {
                                System.out.println("❌ Invalid binary search method choice.");
                                continue;
                            }
                        } else {
                            System.out.println("❌ Invalid search method choice.");
                        }

                        if (index != -1) {
                            System.out.println("✅ Element found at index: " + index);
                        } else {
                            System.out.println("❌ Element not found in the array.");
                        }
                        break;

                    default:
                        System.out.println("❌ Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    /**
     * Sorts an array using the iterative bubble sort algorithm.
     * Time Complexity: O(n^2)
     */
    public static void bubbleSortIterative(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Sorts an array using the recursive bubble sort algorithm.
     * Time Complexity: O(n^2)
     */
    public static void bubbleSortRecursive(int[] arr, int n) {
        if (n == 1) return;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSortRecursive(arr, n - 1);
    }

    /**
     * Searches for a key in an array using the iterative linear search algorithm.
     * Time Complexity: O(n)
     */
    public static int linearSearchIterative(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    /**
     * Searches for a key in an array using the recursive linear search algorithm.
     * Time Complexity: O(n)
     */
    public static int linearSearchRecursive(int[] arr, int n, int key) {
        if (n < 0) return -1;
        if (arr[n] == key) return n;
        return linearSearchRecursive(arr, n - 1, key);
    }

    /**
     * Searches for a key in a sorted array using the iterative binary search algorithm.
     * Time Complexity: O(log n)
     */
    public static int binarySearchIterative(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    /**
     * Searches for a key in a sorted array using the recursive binary search algorithm.
     * Time Complexity: O(log n)
     */
    public static int binarySearchRecursive(int[] arr, int low, int high, int key) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) return mid;
        if (arr[mid] > key) return binarySearchRecursive(arr, low, mid - 1, key);
        return binarySearchRecursive(arr, mid + 1, high, key);
    }
}

/**
 * Class for all string-related operations.
 */
class StringOperations {
    public static void handleStringMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n--- String Operations ---");
            System.out.println("1. Reverse String");
            System.out.println("2. Check for Palindrome");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int strChoice;
            try {
                strChoice = scanner.nextInt();
                scanner.nextLine();
                if (strChoice == 0) return;
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            System.out.print("Enter a string: ");
            String str = scanner.nextLine();

            switch (strChoice) {
                case 1:
                    System.out.println("1. Iterative Reverse  2. Recursive Reverse");
                    try {
                        int revChoice = scanner.nextInt();
                        scanner.nextLine();
                        String reversed = (revChoice == 1) ? reverseIterative(str) : reverseRecursive(str);
                        System.out.println("Reversed string: " + reversed);
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Invalid input. Returning to string menu.");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("1. Iterative Palindrome  2. Recursive Palindrome");
                    try {
                        int palChoice = scanner.nextInt();
                        scanner.nextLine();
                        boolean isPal = (palChoice == 1) ? isPalindromeIterative(str) : isPalindromeRecursive(str, 0, str.length() - 1);
                        System.out.println(isPal ? "✅ The string is a palindrome." : "❌ The string is not a palindrome.");
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Invalid input. Returning to string menu.");
                        scanner.nextLine();
                    }
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Reverses a string using an iterative approach.
     * Time Complexity: O(n)
     */
    public static String reverseIterative(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    /**
     * Reverses a string using a recursive approach.
     * Time Complexity: O(n)
     */
    public static String reverseRecursive(String str) {
        if (str.isEmpty()) return str;
        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }

    /**
     * Checks if a string is a palindrome using an iterative approach.
     * Time Complexity: O(n)
     */
    public static boolean isPalindromeIterative(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    /**
     * Checks if a string is a palindrome using a recursive approach.
     * Time Complexity: O(n)
     */
    public static boolean isPalindromeRecursive(String str, int i, int j) {
        if (i >= j) return true;
        if (str.charAt(i) != str.charAt(j)) return false;
        return isPalindromeRecursive(str, i + 1, j - 1);
    }
}

/**
 * Class for all number-related operations.
 */
class NumberOperations {
    public static void handleNumberMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Number Operations ---");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Generate Fibonacci Sequence");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int numChoice;
            try {
                numChoice = scanner.nextInt();
                if (numChoice == 0) return;
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            switch (numChoice) {
                case 1:
                    try {
                        System.out.print("Enter a non-negative number for factorial: ");
                        int num = scanner.nextInt();
                        if (num < 0) {
                            System.out.println("❌ Factorial is not defined for negative numbers.");
                            continue;
                        }
                        System.out.println("1. Iterative Factorial  2. Recursive Factorial");
                        System.out.print("Choose factorial method: ");
                        int factChoice = scanner.nextInt();
                        long factResult = (factChoice == 1) ? factorialIterative(num) : factorialRecursive(num);
                        System.out.println("Factorial of " + num + " is: " + factResult);
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Invalid input. Please enter a valid number.");
                        scanner.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    } catch (StackOverflowError e) {
                        System.out.println("❌ Error: Stack overflow. The number is too large for recursive calculation.");
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter the number of terms for Fibonacci sequence: ");
                        int terms = scanner.nextInt();
                        if (terms < 0) {
                            System.out.println("❌ Number of terms must be non-negative.");
                            continue;
                        }
                        System.out.println("Fibonacci sequence for " + terms + " terms:");
                        for (int i = 0; i < terms; i++) {
                            System.out.print(fibonacciRecursive(i) + " ");
                        }
                        System.out.println();
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Invalid input. Please enter a valid number.");
                        scanner.nextLine();
                    }
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Calculates the factorial of a number iteratively.
     * Time Complexity: O(n)
     */
    public static long factorialIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed.");
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    /**
     * Calculates the factorial of a number recursively.
     * Time Complexity: O(n)
     */
    public static long factorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed.");
        if (n == 0) return 1;
        return n * factorialRecursive(n - 1);
    }

    /**
     * Generates the nth term of the Fibonacci sequence recursively.
     * Time Complexity: O(2^n)
     */
    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
