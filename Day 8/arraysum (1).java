import java.util.Scanner;

class arraysum {
    public static void main(String[] args) {
        int[] a = new int[10];
        int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array values:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The array values are:");
        for (int i = 0; i < a.length; i++) {
	    s+=a[i];
        }
	System.out.print("Sum: "+s);
    }
}