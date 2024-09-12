import java.util.*;
public class Binary_to_Decimal {

    public static void BinaryToDecimal(int number){
        int power=0;
        int DecimalNumber=0;
        while (number>0) {
            int lastDigit=(number%10);
            DecimalNumber=DecimalNumber+(int)(Math.pow(2, power)*lastDigit );
            power++;
            number=number/10;
        }
        System.out.println("After Conversion Decimal number is "+ DecimalNumber);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please! Enter Binary Number");
        int BinaryNumber=sc.nextInt();
        BinaryToDecimal(BinaryNumber);
    }
}