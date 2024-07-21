import java.util.*;

class DowhileFactorial 
{
    public static void main(String args[])
 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i = 1;
        long factorial = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= n);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}