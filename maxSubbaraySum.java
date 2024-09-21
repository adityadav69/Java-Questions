
public class maxSubbaraySum {

    public static void printMaxSum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum=currentSum+arr[j];
            }
            if(currentSum>maxSum){
                maxSum=currentSum; 
            }
        }
        System.out.println("maximum sum of the subarray are "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        printMaxSum(arr);

    }
     
}