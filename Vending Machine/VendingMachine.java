

/**
 * The VendingMachine class will determine how many cans and tokens are in the machine 
 * at any given time
 * 
 * @author hhaldimann 
 * @version 18 September 2014
 */
public class VendingMachine
{
    private int cans;
    private int tokens;
    
    public VendingMachine(int canStatus, int tokenStatus)
    {
        this.cans = canStatus;
        this.tokens = 0;
    }
    
    public VendingMachine()
    {
        this.cans = 10;
        this.tokens = 0;
    }
    
    public void fillUp(int cans)
    {
        this.cans += cans;
    }
    
    public void insertToken()
    {
        this.tokens += 1;
    }
    
    public int getTokenCount()
    {
        return this.tokens;
    }
    
    public int getCanCount()
    {
        return this.cans;
    }

}
