import java.util.*;
class test5{
	public static void main(String[] args){
		int c=0,v=0;
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				v+=1;
			}
		else{
				c+=1;
			}
		}
		System.out.println("vowels: "+v);
		System.out.println("Consonants: "+c);
		}
}