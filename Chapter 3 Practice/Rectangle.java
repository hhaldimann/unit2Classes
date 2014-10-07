
import java.util.Scanner;

public class Rectangle
{
    public void Rectangle()
    {
        
        Scanner s = new Scanner(System.in);
        double width,height;

        System.out.print("Enter the width of the rectangle: ");
        width = s.nextDouble();
        
        System.out.print("Enter the height of the rectangle: ");
        height = s.nextDouble();
        double perimeter = height * 2 + width * 2;
        double area = width * height;
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

}
   