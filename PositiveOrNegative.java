import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Hello Harun");
        System.out.println("Enter the Character : ");

       try( Scanner sc = new Scanner(System.in)){

        int number = sc.nextInt() ;
        if (number > 0 ) {
            System.out.println("Positive Number");
        }

        else if (number < 0 ) {
            System.out.println("Negative Number");
        }


        else{
            System.out.println("Not Posititve and Nor Negative.");
        }

       }

    }
}
