package ex.pkg1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class trial {
    public static void main(String[] args){
        Scanner o = new Scanner(System.in);
        System.out.print(" Enter row : ");
        int row = o.nextInt();
        int i, j;       
        System.out.println();
//Outer loop work for rows  
for (i=1; i<row; i++)   
{  
//inner loop work for space      
for (j=row-i; j>1; j--)   
{  
//prints space between two stars  
System.out.print(" ");   
}   
//inner loop for columns  
for (j=1; j<=i; j++ )   
{   
//prints star      
System.out.print(j+" ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
}  
    
