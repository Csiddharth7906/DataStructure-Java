public class MaxSumCol {
    public static int maxsum(int[][]arr) {
        int maxSum=Integer.MIN_VALUE;
        int row=arr.length;
        int cols= arr[0].length;
        for (int j = 0; j < cols; j++) {
           int sum=0;
            for (int i= 0; i<row ; i++) {
                sum+=arr[i][j];

            }
            System.out.println(sum+" ");

            if(maxSum<sum){
                maxSum=sum;
            }
        }
        return maxSum;
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
            int arr[][]= {{1, 4, 5},
                    {2, 3, 4},
                    {6, 9, 2}};
        System.out.println("Max colum sum is => "+maxsum(arr));
//        print(arr);
    }
}
