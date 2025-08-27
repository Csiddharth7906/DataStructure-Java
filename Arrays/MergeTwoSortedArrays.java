public class MergeTwoSortedArrays {
    public static int[] merge(int arr1[],int arr2[]) {
        int i=0;
        int j=0;
        int k=0;
        int arr[]=new int[arr1.length+arr2.length];
       while (i< arr1.length && j< arr2.length){
           if(arr1[i]<arr2[j]){
               arr[k] = arr1[i];
               k++;
               i++;
           }else{
               arr[k]=arr2[j];
               k++;
               j++;
           }
       }
       while (i < arr1.length){
           arr[k]=arr1[i];
           k++;
           i++;
       }
        while (j < arr2.length){
            arr[k]=arr2[j];
            k++;
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
    int arr1[]={1,2,3,4};
    int arr2[]={4,7,8,11};
    int arr[] = merge(arr1,arr2);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
