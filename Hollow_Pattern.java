import java.util.Scanner;

public class Hollow_Pattern {

    public static void HollowRectangle(int rows,int columns){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                if(i==1 || i==rows || j==1 || j==columns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the number of Columns");
        int columns=sc.nextInt();

        HollowRectangle(rows,columns);
    }
}
