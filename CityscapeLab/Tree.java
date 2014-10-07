import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
/**
 * Creates a tree
 * 
 * @author hhaldimann
 * @version 7 October 2014
 */
public class Tree
{
    /** Placement of building from x axis to the left*/
    private int xLeft;
    /** Placement of building from y axis down*/
    private int yTop;
    /**
     * Default constructor for objects of class Tree
     * @param x Placement of building from y axis down
     * @param y Placement of building from y axis down
     */
    public Tree(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    /**
     * This method uses the Graphics2D g2 class to create and draw a tree.
     * @param    g2   uses the Graphics2D g2 class to create and draw a tree.
     * @return    void
     */
    public void draw(Graphics2D g2)
    {
        /** Creates trunk of tree*/
        Rectangle trunk = new Rectangle(xLeft + 660, yTop + 200, 50, 175);
        g2.draw(trunk);
        /** Sets color of trunk to brown using RGB scale*/
        g2.setColor(new Color(156, 93, 82));
        g2.fill(trunk);
        /** Creates different circles which make up the top of the tree*/
        Ellipse2D.Double leaves = new Ellipse2D.Double(xLeft + 640, yTop + 150, 100, 100);
        Ellipse2D.Double leaves2 = new Ellipse2D.Double(xLeft + 680, yTop + 155, 75, 75);
        Ellipse2D.Double leaves3 = new Ellipse2D.Double(xLeft + 610, yTop + 155, 75, 75);
        Ellipse2D.Double leaves4 = new Ellipse2D.Double(xLeft + 640, yTop + 130, 75, 75);
        Ellipse2D.Double leaves5 = new Ellipse2D.Double(xLeft + 660, yTop + 135, 55, 55);
        g2.draw(leaves);
        g2.setColor(Color.GREEN);
        g2.fill(leaves);
        g2.draw(leaves2);
        g2.fill(leaves2);
        g2.draw(leaves3);
        g2.fill(leaves3);
        g2.draw(leaves4);
        g2.fill(leaves4);
        g2.draw(leaves5);
        g2.fill(leaves5);
    }

}