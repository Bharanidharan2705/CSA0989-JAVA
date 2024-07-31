import java.util.*;
class vowelconsonant
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
String s=sc.nextLine ();
char ch=s.charAt(0); 
if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
  System.out.print(ch + " is a vowel");
}
 else
{
  System.out.print(ch+"is a consonant");
}
}
}