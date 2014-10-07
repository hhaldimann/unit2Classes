import java.util.Scanner; 

public class Annuity
{
 public void annuity()
    {
        Scanner s = new Scanner(System.in);
        double pmt, i, n;
        
        System.out.print("Enter the payment: ");
        pmt = s.nextDouble();
        
        System.out.print("Enter the interest fee: ");
        i = s.nextDouble();
        
        System.out.print("Enter the number of payments: ");
        n = s.nextDouble();
        
        double first = Math.pow(1+i,n-1)-1;
        first = first / i;
        double second = Math.pow(1+i, n-1);
        double pres_annuity = pmt * ((first/second)+1);
        double newnum = Math.round(pres_annuity*100.0)/100.0;
        System.out.println("$" + newnum);
        
    }
}