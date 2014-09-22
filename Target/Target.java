import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xLeft;
    private int yTop;
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double bigBlack = new Ellipse2D.Double(xLeft + 110, yTop + 110, 150, 150);
        Ellipse2D.Double mediumWhite = new Ellipse2D.Double(xLeft + 110, yTop + 110, 125, 125);
        Ellipse2D.Double smallBlack = new Ellipse2D.Double(xLeft + 110, yTop + 110, 100, 100);
        Ellipse2D.Double smallWhite = new Ellipse2D.Double(xLeft + 110, yTop + 110, 75, 75);
        Ellipse2D.Double smallestBlack = new Ellipse2D.Double(xLeft + 110, yTop + 110, 50, 50);
        
        g2.draw(bigBlack);
        g2.setColor(Color.RED);
        g2.fill(bigBlack);
       
        g2.draw(mediumWhite);
        g2.setColor(Color.WHITE);
        g2.fill(mediumWhite);
        
        g2.draw(smallBlack);
        g2.setColor(Color.BLUE);
        g2.fill(smallBlack);
        
        g2.draw(smallWhite);
        g2.setColor(Color.RED);
        g2.fill(smallWhite);
        
        g2.draw(smallestBlack);
        g2.setColor(Color.WHITE);
        g2.fill(smallestBlack);
    }

}
