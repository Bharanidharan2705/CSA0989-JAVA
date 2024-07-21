import java.util.*;
class righttrianglenumber
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        int i, j;
        for(i = 1; i <= rows; i++)
        {
            for(j = 1; j <= rows - i; j++)  
            {          
                System.out.print(" "); 
            }      
            for(j = 1; j <= i; j++)  
            {          
                System.out.print(i); 
            }      
            System.out.print("\n");        
        }
    }
}