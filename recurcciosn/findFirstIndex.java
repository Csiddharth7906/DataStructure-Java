public class findFirstIndex {
    public static int firstIndex(int arr[],int idx,int key){
        if(arr.length<=idx){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return firstIndex(arr,idx+1,key);

    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,3,4};
        int key=20;
        System.out.println(firstIndex(arr,0,key));
    }
}
