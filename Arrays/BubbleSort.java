public class BubbleSort {
    public static void Sorting(int []arr){
        for (int i = 0; i < arr.length ; i++) {
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int []arr={6,9,4,8,3,1};
        Sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
