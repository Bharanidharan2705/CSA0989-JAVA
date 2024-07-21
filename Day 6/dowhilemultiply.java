import java.util.*;
class dowhilemutiply 
{
    public static void main(String args []) 
{
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
                j++;
            } while (j <= 10);
            i++;
        } while (i <= 10);
    }
}