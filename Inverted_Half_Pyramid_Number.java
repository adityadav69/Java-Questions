import java.util.*;
public class Inverted_Half_Pyramid_Number {

    public static void InvertedHalfPyramidNumber(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=(rows-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        InvertedHalfPyramidNumber(rows);
    }
}
