package ex.pkg1;

import java.util.Scanner;

public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println(" Enter A : ");
        int a = o.nextInt();
        System.out.println(" Enter B : ");
        int b = o.nextInt();
        if(a>b)
            System.out.println("Value B = "+b+" is Minimum.");
        else
            System.out.println("Value A = "+a+" is Minimum.");
        // TODO code application logic here
    }
    
}
