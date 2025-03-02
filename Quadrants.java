import java.util.Scanner;

public class Quadrants {

    public static void main(String[] args) {
        System.out.println("Hello Harun");

        try(Scanner sc = new Scanner (System.in)) {
            System.out.print("Emter the First number : ");
            int a = sc.nextInt();

            System.out.print("Enter the second number : ");
            int b = sc.nextInt();

            if(a >0 && b > 0) {
                System.out.println("First Qudrant");
            }
            else if (a<0 && b > 0) {
                System.out.println("Second Quadrant");
            }

            else if (a>0 && b<0){
                System.out.println("Third Quadrannt");
            }

            else if (a == 0 && b == 0) {
                System.out.println("This point lies at the origin.");
            } 
            
            else if (a == 0) {
                System.out.println("This point lies on the Y-axis.");
            } 
            
            else {
                System.out.println("This point lies on the X-axis.");
            }
        }
    }
    
}
