import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Hello Harun");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");

            int num =sc.nextInt();
            int sum = 0 ;

            while( num > 0) {

                sum += num %10 ;

                num /= 10 ; 
            }

            System.out.println("Sum of Digits is : " + sum);
        }
    }
    
}
