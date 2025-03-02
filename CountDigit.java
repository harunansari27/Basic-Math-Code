import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt() ;

        int count = (num == 0) ? 1 : 0;
        int number = Math.abs(num) ;

        while(number > 0 ) {
            number = number/10 ;
            count++ ;
        }

        System.out.println(count);
    }
}
