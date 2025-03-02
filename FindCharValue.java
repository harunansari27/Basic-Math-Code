import java.util.Scanner;

public class FindCharValue {

    public static void main(String[] args) {
        
        System.out.println("Hello Harun");
        System.out.print("Enter character : ");
        try (Scanner sc = new Scanner(System.in)) {
            char ch = sc.next().charAt(0);
            
            // typecasting char into integer 
            System.out.println((int)ch);
        }
    }
}
