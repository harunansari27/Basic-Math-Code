
import java.util.Scanner;

public class CheckAlphabets {

    public static void main(String[] args) {

        System.out.println("Hello coder How are u ?");
        try (Scanner sc = new Scanner(System.in)) {
            char ch = sc.next().charAt(0);

            // if(Character.isAlphabetic(ch)){
            //     System.out.println("true");
            // }
            // else{
            //     System.out.println("Invalid");
            // }
            if (Character.isLetter(ch)) {
                switch (Character.toLowerCase(ch)) {
                    case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' ->
                        System.out.println("It ia alphabets ");
                    default ->
                        System.out.println("Alphabets");
                }

            } else {
                System.out.println("Invalid");
            }
        }

    }

}
