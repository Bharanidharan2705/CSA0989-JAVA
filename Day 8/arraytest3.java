import java.util.Scanner;

class arraytest3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array values:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The array values are:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}