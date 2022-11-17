package ex.pkg1;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ex13 {
    public static void main(String[] args)
    {
        Scanner o = new Scanner(System.in);
        System.out.println(" Enter the Value of N : ");
        int n = o.nextInt();
        int t = 0;
        int i;
        for(i=1;i<n;i++)
        {
            if(i%5==0)
                t=t+1;
        }      
        System.out.println(" The no. of value Present Between 1 & N("+n+"), that is divisible by 5 is : "+t);
    }
}
