import java.util.*;
class Area {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        double l, b, area;
        System.out.println("Enter Length: ");
        l =sc.nextInt();
        System.out.println("Enter Breadth: ");
        b =sc.nextInt();
        area = (l * b) / 2;
        System.out.println("Area of triangle: " + area);
    }
}