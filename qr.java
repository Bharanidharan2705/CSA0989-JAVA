import java.util.Scanner;
class qr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int div = sc.nextInt();
        System.out.println("Enter divisor: ");
        int divi = sc.nextInt();
        int q = div / divi;
        int r = div % divi;
        System.out.println("Quotient: " + q);
        System.out.println("Remainder: " + r);
    }
}