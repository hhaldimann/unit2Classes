import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * This method instantiates the objects and creates multiple buildings, a road and a sun. It then draws the objects.
     * @param    y    description of parameter y
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Road mainRoad = new Road(0, 0);
        Building building1 = new Building(0, 0);
        Building building2 = new Building(150, 0);
        Building building3 = new Building(300, 0);
        Building building4 = new Building(450, 0);
        Sun sun = new Sun(0,0);
        Tree tree = new Tree(0,0);
        
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        
        mainRoad.draw(g2);
        sun.draw(g2);
        tree.draw(g2);
        
    }

}
