import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * This class will create a road which runs horizontally across the bottom of the window.
 * 
 * @author hhaldimann 
 * @version 1 October 2014
 */
public class Road
{
    /** Placement of road from x axis to the left */
    private int xLeft;
    /** Placement of road from y axis down*/
    private int yTop;
    /**
     * Default constructor for objects of class Road
     */
    public Road(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * This method uses the Graphics2D g2 class to create and draw a road with yellow dashes running
     * through the middle of it.
     * @param    y    description of parameter y
     * @return   void
     */
    public void draw(Graphics2D g2)
    {
        Rectangle road = new Rectangle(xLeft + 0, yTop + 375, 800, 1000);
        g2.draw(road);
        g2.setColor(Color.BLACK);
        g2.fill(road);
        Rectangle dash = new Rectangle(xLeft + 20, yTop + 450, 30, 50);
        Rectangle dash2 = new Rectangle(xLeft + 90, yTop + 450, 30, 50);
        Rectangle dash3 = new Rectangle(xLeft + 160, yTop + 450, 30, 50);
        Rectangle dash4 = new Rectangle(xLeft + 240, yTop + 450, 30, 50);
        Rectangle dash5 = new Rectangle(xLeft + 310, yTop + 450, 30 , 50);
        Rectangle dash6 = new Rectangle(xLeft + 380, yTop + 450, 30, 50);
        Rectangle dash7 = new Rectangle(xLeft + 450, yTop + 450, 30, 50);
        Rectangle dash8 = new Rectangle(xLeft + 520, yTop + 450, 30, 50);
        Rectangle dash9 = new Rectangle(xLeft + 590, yTop + 450, 30, 50);
        Rectangle dash10 = new Rectangle(xLeft + 660, yTop + 450, 30, 50);
        Rectangle dash11 = new Rectangle(xLeft + 730, yTop + 450, 30, 50);
        g2.draw(dash);
        /**Sets dash color to yellow*/
        g2.setColor(Color.YELLOW);
        g2.fill(dash);
        g2.draw(dash2);
        g2.fill(dash2);
        g2.draw(dash3);
        g2.fill(dash3);
        g2.draw(dash4);
        g2.fill(dash4);
        g2.draw(dash5);
        g2.fill(dash5);
        g2.draw(dash6);
        g2.fill(dash6);
        g2.draw(dash7);
        g2.fill(dash7);
        g2.draw(dash8);
        g2.fill(dash8);
        g2.draw(dash9);
        g2.fill(dash9);
        g2.draw(dash10);
        g2.fill(dash10);
        g2.draw(dash11);
        g2.fill(dash11);
        
    }

}
