import java.util.Scanner;

public class Inverted_Rotated_Half_Pyramid {

    public static void InvertedRotatedHalfPyramid(int rows){
       for(int i=1;i<=rows;i++){
        for(int j=1;j<=(rows-i);j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        InvertedRotatedHalfPyramid(rows);
    }
}
