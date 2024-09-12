import java.util.*;
public class Floyd_Triangle {

    public static void FloydTriangle(int rows){
        int counter=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        FloydTriangle(rows);
    }
}
