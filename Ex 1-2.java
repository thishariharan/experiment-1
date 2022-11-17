package ex.pkg1;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ex12 {
    public static void main(String[] args)
    {
    Scanner o = new Scanner(System.in);
    System.out.println(" The purchase of Paint : ");
    System.out.println();
    System.out.println();
    System.out.print(" Enter no. of Paint Boxes : ");
    int u = o.nextInt();
    System.out.print(" Enter the Price of each Box : ");
    float p = o.nextFloat();
    float r = u*p;
    float d;
    if(u<100)
    {
        d=r/100;
        d=d*0;
        r = r-d;
        System.out.println(" The Revenue is : "+r);
        System.out.println(" The Discount is : "+d);
    } 
    else if((u>=100) && (u<=120))
    {
        d=r/100;
        d=d*10;
        r = r-d;
        System.out.println(" The Revenue is : "+r);
        System.out.println(" The Discount is : "+d);
    } 
    else
    {
        d=r/100;
        d=d*15;
        r = r-d;
        System.out.println(" The Revenue is : "+r);
        System.out.println(" The Discount is : "+d);
    } 
    }
}
