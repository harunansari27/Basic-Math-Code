import java.util.Scanner;

public class DayCountMonth {

    public static void main(String[] args) {
        System.out.println("Hello Harun");

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the month 1 to 12 : ");
        int month = sc.nextInt();
        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        int days ;

        switch (month) {
            case 1: case 3 :case 5 : case 7 : case 8 : case 10 :case 12 :   
            days = 31 ;            
                break;

            case 4 :case 6 :case 9 :case 11 :
            days = 30 ;

            break ;

            case 2 :

            if((year % 400 == 0 ) || (year % 4 == 0 && year != 0)) {
                days = 29 ;
            }

            else {
                days =28 ;
            }
            
            break ;
            default : System.out.println("Invalid month ");
            return ;
        }

        System.out.println(days);
    }
    
}
