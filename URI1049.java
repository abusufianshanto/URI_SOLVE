import java.io.IOException;
import java.util.*;

/* 
Author: ABU SUFIAN SHANTO
*/

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        String fname, mname, lname;
        
        Scanner input = new Scanner(System.in);
        
        fname = input.nextLine();
        mname = input.nextLine();
        lname = input.nextLine();
        
        if("vertebrado".equals(fname))
        {
            if("ave".equals(mname))
            {
                if("carnivoro".equals(lname))
                {
                    System.out.println("aguia");
                }
            }
        }
        
        if("vertebrado".equals(fname))
        {
            if("ave".equals(mname))
            {
                if("onivoro".equals(lname))
                {
                    System.out.println("pomba");
                }
            }
        }
        
        if("vertebrado".equals(fname))
        {
            if("mamifero".equals(mname))
            {
                if("onivoro".equals(lname))
                {
                    System.out.println("homem");
                }
            }
        }
        
        if("vertebrado".equals(fname))
        {
            if("mamifero".equals(mname))
            {
                if("herbivoro".equals(lname))
                {
                    System.out.println("vaca");
                }
            }
        }
        
        if("invertebrado".equals(fname))
        {
            if("inseto".equals(mname))
            {
                if("hematofago".equals(lname))
                {
                    System.out.println("pulga");
                }
            }
        }
        
        if("invertebrado".equals(fname))
        {
            if("inseto".equals(mname))
            {
                if("herbivoro".equals(lname))
                {
                    System.out.println("lagarta");
                }
            }
        }
        
        if("invertebrado".equals(fname))
        {
            if("anelideo".equals(mname))
            {
                if("hematofago".equals(lname))
                {
                    System.out.println("sanguessuga");
                }
            }
        }
        
        if("invertebrado".equals(fname))
        {
            if("anelideo".equals(mname))
            {
                if("onivoro".equals(lname))
                {
                    System.out.println("minhoca");
                } 
            }
        }
 
    }
    
}
