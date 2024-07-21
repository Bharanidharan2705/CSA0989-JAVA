import java.util.*;

class Stars 
{
    public static void main(String args []) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int a = sc.nextInt();

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}