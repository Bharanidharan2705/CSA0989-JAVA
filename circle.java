import java.util.scanner;
public class circleArea{
public static void main(string args[])
{
  scanner sc=new scanner(system.in);
system.out.println("enter the radius of the circle:");
double radius=scanner.nextDouble();

double area= calculateArea(radius);
system.out.println("the area of the circle is:%.2f%n",area);
}
public static double calculateArea(double radius){
final double PI = 3.14159;
return PI * radius*radius;
}
}