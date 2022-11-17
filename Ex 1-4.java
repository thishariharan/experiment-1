package ex.pkg1;

import java.util.*;
/**
 *
 * @author HP
 */
public class Ex14 {
    public static void main(String[] args)
    {
        Scanner o = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        System.out.print(" How many Strings do you need : ");
        int n = o.nextInt();
        int i;
        String a[] = new String[n];
        String R, p = " ";
        System.out.println(" Enter the Strings : ");
        for(i=0;i<n;i++)
        {
            a[i] = st.nextLine();
        }
        R = a[0];
        for(i=1;i<n;i++)
        {
            R = R + p;
            R = R + a[i];
        }
        System.out.println(R);
    }
    
}
