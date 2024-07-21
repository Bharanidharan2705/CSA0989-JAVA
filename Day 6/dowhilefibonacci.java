import java.util.*;

class dowhilefibonacci 
{
    public static void main(String args[]) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        do {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            n--;
        } while (n > 0);
    }
}