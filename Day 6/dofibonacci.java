import java.util.*;

class dofibonacci
 {
    public static void main(String args[]) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        while (n > 0) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            n--;
        }
    }
}