public class Reverse_An_Array {

    public static int[] reverseArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={3,53,55,63,11,12};
        reverseArray(arr);
        for (int i : arr) {
            System.out.print(i+",");
        }
    }
}
