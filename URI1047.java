import java.io.IOException;
import java.util.*;

public class URI1047 {
 
    public static void main(String[] args) throws IOException {
 
        int a, b, c, d, minute, hour;
        
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        
        if(c<=a)
        {
            hour = (c + 24) - a; 
        }
        else if(c>=a && d<=b)
        {
            hour = c - a;
            hour = hour - 1;
        }
        else 
        {
            hour = c - a;
        }
        
        if(d<b)
        {
            minute = (d + 60) - b;
        }
        else
        {
            minute = d - b;
        }
        System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+minute+" MINUTO(S)");
    }
 
}
