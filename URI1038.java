import java.io.IOException;
import java.util.*; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int x, y; 
        double sum;
        
        Scanner input = new Scanner(System.in);
        
        x = input.nextInt();
        y = input.nextInt();
        
        switch (x) {
            case 1: 
                double sum1 = y * 4.00;
                String str = String.format("%.2f", sum1);
                System.out.println("Total: R$ "+str);
                break;
            case 2: 
                double sum2 = y * 4.50;
                String str2 = String.format("%.2f", sum2);
                System.out.println("Total: R$ "+str2);
                break;
            case 3: 
                double sum3 = y * 5.00;
                String str3 = String.format("%.2f", sum3);
                System.out.println("Total: R$ "+str3);
                break;
            case 4: 
                double sum4 = y * 2.00;
                String str4 = String.format("%.2f", sum4);
                System.out.println("Total: R$ "+str4);
                break;
            case 5: 
                double sum5 = y * 1.50;
                String str5 = String.format("%.2f", sum5);
                System.out.println("Total: R$ "+str5);
                break;
        }
 
    }
 
}
