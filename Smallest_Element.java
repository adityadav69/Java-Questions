import java.util.*;
public class Smallest_Element {

    public static int largestElement(int arr[]){
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+i+"th element of array");
            arr[i]=sc.nextInt();
        }
        int result=largestElement(arr);
        System.out.println("Smallest element in the array is "+ result);

    }
}

