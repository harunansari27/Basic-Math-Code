import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        System.out.println("Hello Harun Ansari");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int fac = sc.nextInt();
        long factorial =1  ;

        for(int i = 1 ; i <=fac ; i++) {
            factorial = i*factorial ; 
            System.out.println("Number is : "+ factorial);
        }


        System.out.println(factorial);

        


    }
}
