import java.util.*;

public class DiamondPattern {

    public static void Diamond(int rows) {

        //1st half
            for(int i=1;i<=rows;i++){

                //spaces

                for(int j=1;j<=(rows-i);j++){
                    System.out.print(" ");
                }

                //star

                for(int k=1;k<=(2*i)-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            //2nd half
            for(int i=rows;i>=1;i--){

                //spaces

                for(int j=1;j<=(rows-i);j++){
                    System.out.print(" ");
                }

                //star

                for(int k=1;k<=(2*i)-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
           
         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        Diamond(rows);
    }
}
