public class PairsInArray {

    public static void printPairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int Pairelement=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ Pairelement +","+ arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,8,10};
        printPairs(arr);

    }
}
