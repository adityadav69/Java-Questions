public class Binary_Search {

    public static int BinarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(key>arr[mid]){
                start=mid+1;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,56,78,99,121};
        int key=999;
        int result=BinarySearch(arr, key);
        if(result==-1){
            System.out.println("Key not found in the array");
        }
        else{
            System.out.println("Key at index "+result);
        }
    }
}
