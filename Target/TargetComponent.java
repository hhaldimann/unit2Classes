import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class TargetComponent here.
 * 
 * @author hhaldimann 
 * @version 19 September 2014
 */
public class TargetComponent extends JComponent
{
    private int x;

    /**
     * Default constructor for objects of class TargetComponent
     */
    public TargetComponent()
    {
        // initialise instance variables
        x = 0;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target target1 = new Target(0,0);
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
    }

}
