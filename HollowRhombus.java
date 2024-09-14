import java.util.*;

public class HollowRhombus {

    public static void HollowRhombusPattern(int rows) {

        for(int i=1;i<=rows;i++){
            //Spaces
            for(int j=(rows-i);j>=1;j--){
                System.out.print(" ");
            }
            //Stars
            for(int k=1;k<=rows;k++){
                if(i==1 || i==rows || k==1 || k== rows){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //Spaces

            // for(int l=1;l<i;l++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        HollowRhombusPattern(rows);
    }
}
