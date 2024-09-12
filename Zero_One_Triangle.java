import java.util.*;
public class Zero_One_Triangle{

    public static void ZeroOneTriangle(int rows){
        
        for(int i=1;i<=rows;i++){
           
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        ZeroOneTriangle(rows);
    }
}

