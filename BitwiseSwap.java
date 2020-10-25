import java.util.Scanner;
public class JavaExample 
{
    public static void main(String args[])
    {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        num2 = scanner.nextInt();
        /* To make you understand, lets assume I am going
         * to enter value of first number as 10 and second 
         * as 5. Binary equivalent of 10 is 1010 and 5 is
         * 0101
         */
        
        //num1 becomes 1111 = 15
        num1 = num1 ^ num2;
        //num2 becomes 1010 = 10
        num2 = num1 ^ num2;
        //num1 becomes 0101 = 5
        num1 = num1 ^ num2;
        scanner.close();
        System.out.println("The First number after swapping:"+num1);
        System.out.println("The Second number after swapping:"+num2);
    }
}
