import java.util.*;

public class LinearSearch {

    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={4,6,2,64};
        int key=00;
        int result=linearSearch(arr, key);
        if(result==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is "+ result);
        }
    }
}
