import java.util.Scanner;

public class StrongNumber {


    public static int factorial(int n) {
        int fact = 1 ;

        for(int i = 1 ; i <= n ; i++ ){
            fact *= i; 
        }

        return fact ;
    }

    public static void main(String[] args) {
        
        System.out.println("Hello Harun");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to checck is it strong number or nor : ");
        int num = sc.nextInt() ;

        int temp = num , sum = 0 ;

        while(temp > 0) {

            int digit = temp %10 ;
            sum += factorial(digit);
            temp /= 10 ;
        }


        if(sum == num ){
            System.out.println("It is a strong number");
        }

        else{
            System.out.println("It is not strong number.");
        }
    }
    
}
