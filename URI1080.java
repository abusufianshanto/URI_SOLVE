import java.util.*;

/**
 *
 * @author Abu Sufian Shanto
 */
public class URI1080 {
    public static void main(String[] args) {
        int n = 100, x = 0, i, highest = 0, position = 0;
        
        Scanner input = new Scanner(System.in);
        
        for(i=1; i<=n; i++)
        {
            x = input.nextInt();
            
            if(highest>x)
            {
                highest=highest;
                position=position;
            }
            else
            {
                highest=x;
                position=i;
            }
        }
        System.out.println(highest);
        System.out.println(position);
    }
}
