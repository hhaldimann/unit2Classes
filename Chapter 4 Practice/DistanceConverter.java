

public class DistanceConverter
{
    public static void main(String[] args)
    {
        final double yards = 3.5;
        final int yardstofeet = 3;
        final double feet = yards * yardstofeet;
        final int feettoinches = 12;
        final double inches = feet * feettoinches;
        
        System.out.println(yards + " yards are " + feet + " feet");
        System.out.println(yards + " yards are " + inches + " inches");
        
    }

}
