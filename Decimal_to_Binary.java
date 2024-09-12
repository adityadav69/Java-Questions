import java.util.Scanner;
public class Decimal_to_Binary {

    public static void DecimalToBinary(int number){
        int BinaryNumber=0;
        // if (number == 0) {
        //     System.out.println("Binary number is 0");
        //     return;
        // }
        while (number>0) {
            int remainder=number%2;
            BinaryNumber=(BinaryNumber*10)+remainder;
            number=number/2;
        }
        int reversed=0;
        while (BinaryNumber>0) {
            int lastDigit=BinaryNumber%10;
            reversed=(reversed*10)+lastDigit;
            BinaryNumber=BinaryNumber/10;
        }
        System.out.println("Binary number is " +reversed);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please! Enter a Decimal number");
        int number=sc.nextInt();
        DecimalToBinary(number);
    }
}
