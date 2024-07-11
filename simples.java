import java.util.*;
class simples
{
    public static void main(String args[])   
    {
    Scanner sc=new Scanner(System.in);
    double p,r,t,s;
System.out.println("Enter Principle: ");
    p=sc.nextInt();
System.out.println("Enter Interest Rate: ");
    r=sc.nextInt();
System.out.println("Enter Time: ");
    t=sc.nextInt();
    s=(p*r*t)/100;
    System.out.println("Simple Interest: "+s);
    }
}