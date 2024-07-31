import java.util.*;

class WhileFactorial 
{
    public static void main(String args[]) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i = 1;
        long factorial = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}