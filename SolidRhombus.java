import java.util.*;

public class SolidRhombus {

    public static void SolidRhombusPattern(int rows) {

        for(int i=1;i<=rows;i++){
            //Spaces
            for(int j=(rows-i);j>=1;j--){
                System.out.print(" ");
            }
            //Stars
            for(int k=1;k<=rows;k++){
                System.out.print("*");
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
        SolidRhombusPattern(rows);
    }
}
