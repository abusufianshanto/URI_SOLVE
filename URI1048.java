import java.io.IOException;
import java.util.*; 

public class URI1048 {
 
    public static void main(String[] args) throws IOException {
 
        double salary;
        double newsalary, earnedsalary;
        
        Scanner input = new Scanner(System.in);
        
        salary = input.nextDouble();
        
        if(salary>=0 && salary<=400.00)
        {
            earnedsalary = 0.15 * salary;
            String str = String.format("%.2f", earnedsalary);
            newsalary = salary + earnedsalary;
            String str1 = String.format("%.2f", newsalary);
            System.out.println("Novo salario: "+str1);
            System.out.println("Reajuste ganho: "+str);
            System.out.println("Em percentual: 15 %");
        }
        
        else if(salary>=400.01 && salary<=800.00)
        {
            earnedsalary = 0.12 * salary;
            String str = String.format("%.2f", earnedsalary);
            newsalary = salary + earnedsalary;
            String str1 = String.format("%.2f", newsalary);
            System.out.println("Novo salario: "+str1);
            System.out.println("Reajuste ganho: "+str);
            System.out.println("Em percentual: 12 %");
        }
        
        else if(salary>=800.01 && salary<=1200.00)
        {
            earnedsalary = 0.10 * salary;
            String str = String.format("%.2f", earnedsalary);
            newsalary = salary + earnedsalary;
            String str1 = String.format("%.2f", newsalary);
            System.out.println("Novo salario: "+str1);
            System.out.println("Reajuste ganho: "+str);
            System.out.println("Em percentual: 10 %");
        }
        
        else if(salary>=1200.01 && salary<=2000.00)
        {
            earnedsalary = 0.07 * salary;
            String str = String.format("%.2f", earnedsalary);
            newsalary = salary + earnedsalary;
            String str1 = String.format("%.2f", newsalary);
            System.out.println("Novo salario: "+str1);
            System.out.println("Reajuste ganho: "+str);
            System.out.println("Em percentual: 7 %");
        }
        
        else
        {
            earnedsalary = 0.04 * salary;
            String str = String.format("%.2f", earnedsalary);
            newsalary = salary + earnedsalary;
            String str1 = String.format("%.2f", newsalary);
            System.out.println("Novo salario: "+str1);
            System.out.println("Reajuste ganho: "+str);
            System.out.println("Em percentual: 4 %");
        }
 
    }
 
}
