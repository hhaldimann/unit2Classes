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
        Ellipse2D.Double mediumWhite = new Ellipse2D.Double(xLeft + 122.5, yTop + 122.5, 125, 125);
        Ellipse2D.Double smallBlack = new Ellipse2D.Double(xLeft + 135, yTop + 135, 100, 100);
        Ellipse2D.Double smallWhite = new Ellipse2D.Double(xLeft + 147.5, yTop + 147.5, 75, 75);
        Ellipse2D.Double smallestBlack = new Ellipse2D.Double(xLeft + 160, yTop + 160, 50, 50);
        Ellipse2D.Double smallestWhite = new Ellipse2D.Double(xLeft + 172.5, yTop + 172.5, 25, 25);
        
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
        
        g2.draw(smallestWhite);
        g2.setColor(Color.BLUE);
        g2.fill(smallestWhite);
    }

}
