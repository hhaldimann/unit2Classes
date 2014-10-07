import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
/**
 * This class will create a building.
 * 
 * @author hhaldimann
 * @version 3 October 2014
 */
public class Building
{
    /** Placement of building from x axis to the left */
    private int xLeft;
    /** Placement of building from y axis down*/
    private int yTop;
    /**
     * Default constructor for objects of class Building
     *  @param  x Placement of building from x axis to the left
     *  @param  y Placement of building from y axis down
     */
    public Building(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    /**
     * This method uses the Graphics2D g2 class to create and draw a building.
     * @param    g2    uses the g2 class to create and draw a building.
     * @return    void
     */
    public void draw(Graphics2D g2)
    {
        /**Placement of first building on far left*/
        Rectangle building = new Rectangle(xLeft + 50, yTop + 50, 100, 325);
        g2.draw(building);
        g2.setColor(Color.GRAY);
        g2.fill(building);
        /**window1 and window2 are the first row of windows and so on.*/
        Rectangle window1 = new Rectangle(xLeft + 62, yTop + 300, 25, 25); 
        Rectangle window2 = new Rectangle(xLeft + 110, yTop + 300, 25, 25);
        Rectangle window3 = new Rectangle(xLeft + 62, yTop + 225, 25, 25);
        Rectangle window4 = new Rectangle(xLeft + 110, yTop + 225, 25, 25);
        Rectangle window5 = new Rectangle(xLeft + 62, yTop + 150, 25, 25); 
        Rectangle window6 = new Rectangle(xLeft + 110, yTop + 150, 25, 25);
        Rectangle window7 = new Rectangle(xLeft + 62, yTop + 75, 25, 25);
        Rectangle window8 = new Rectangle(xLeft + 110, yTop + 75, 25, 25);        
        g2.draw(window1);
        /**Sets window color to white*/
        g2.setColor(Color.WHITE);
        g2.fill(window1);
        g2.draw(window2);
        g2.fill(window2);
        g2.draw(window3);
        g2.fill(window3);
        g2.draw(window4);
        g2.fill(window4);
        g2.draw(window5);
        g2.fill(window5);
        g2.draw(window6);
        g2.fill(window6);
        g2.draw(window7);
        g2.fill(window7);
        g2.draw(window8);
        g2.fill(window8);        
    }

}