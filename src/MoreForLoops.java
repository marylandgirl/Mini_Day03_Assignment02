import java.util.Scanner;
public class MoreForLoops {
    public static void main(String[] args) {
        //Print all even numbers from 1 to 20
        System.out.println("Printing even numbers from 1 to 20");
        displayNumList(1, 20, "Even");

        //Print all odd numbers from 1 to 20
        System.out.println("Printing odd numbers from 1 to 20");
        displayNumList(1, 20, "Odd");

        System.out.println("\n");

        //Prompt user for a string to display in reverse
        Scanner keyin = new Scanner(System.in);
        System.out.print("Enter a string to display in reverse: ");
        String passStr = keyin.nextLine();
        //Print string in reverse
        reverseString(passStr);


        System.out.println("\n");

        //Prompt user for integer and display all factors
        System.out.print("Enter an integer for printing of factors: ");
        int number = keyin.nextInt();
        keyin.nextLine();
        displayNumList(1, number, "Factor");

        //Prompt user for integer to calculate fatorial
        System.out.print("Enter an integer for calculating factorial: ");
        number = keyin.nextInt();
        keyin.nextLine();
        calculateFatorial(number);
    }

    private static void calculateFatorial(int number) {
        int product = 1;
        for (int i = number; i > 0; i--) {
            product *= i;
        }
        System.out.printf("The factorial calculation comes out to %d",product);
    }

    private static void reverseString(String passStr) {
        System.out.printf("The reverse of %s is ",passStr);
        for (int i= passStr.length()-1; i >=0; i--) {
            System.out.print(passStr.charAt(i));
        }
    }

    private static void displayNumList(int start, int end, String type ) {
        for (int i = start; i <= end; i++) {
            if (type.equals( "Even") && i%2 == 0)
                System.out.printf("%d %s",i," ");
            else if (type.equals("Odd") && i%2 == 1)
                System.out.printf("%d %s",i," ");
            else if (type.equals("Factor") && end%i == 0)
                System.out.printf("%d %s",i," ");
        }
        System.out.println();
    }
}
