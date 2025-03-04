import java.util.Scanner;

public class SumOfNaturalNumber {

    public static void main(String[] args) {
        System.out.println("Hello Harun");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int sum = num*(num +1) / 2 ;

        System.out.println("Number is : "+num+" Sum os number : "+sum);


    }
    
}
