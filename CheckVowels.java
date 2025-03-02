
import java.util.Scanner;

public class CheckVowels {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Hello Harun");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");

        char alpha = sc.next().charAt(0) ;
        if(Character.isLetter(alpha)) {

        switch (Character.toLowerCase(alpha)) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowels");
            default -> System.out.println("Consonants");
        }
    }

    else{
        System.out.println("Invalid");
    }

    sc.close();

    }
}
