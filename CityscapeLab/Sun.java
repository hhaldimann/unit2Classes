import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * This class creates a sun.
 * 
 * @author hhaldimann 
 * @version 6 October 2014
 */
public class Sun
{
    /** Placement of sun from x axis to the left */
    private int xLeft;
    /**Placement of sun from y axis down */
    private int yTop;
    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    /**
     * This method uses the Graphics2D g2 class to create and draw a sun.
     * @param    y    description of parameter y
     * @return    void
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft + 640, yTop + 10, 100, 100);
        g2.draw(sun);
        g2.setColor(Color.ORANGE);
        g2.fill(sun);
    }
}