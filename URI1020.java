import java.io.IOException;
import java.util.Scanner;
 

public class URI1020 {
 
    public static void main(String[] args) throws IOException {
 
        int n; 
        
        Scanner input = new Scanner(System.in);
        
        n = input.nextInt();
        
        int year = n / 365;
        int month = n % 365; 
        int day = month % 30;
        month = month / 30;
        
        System.out.println(year+" ano(s)");
        System.out.println(month+" mes(es)");
        System.out.println(day+" dia(s)");
 
    }
 
}