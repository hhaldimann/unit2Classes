
/**
 * A car class tracks fuel capacity and consumption based on efficiency
 * 
 * @author hhaldimann 
 * @version 12 September 2014
 */
public class Car
{
    /** fuel efficiency of the car measured in miles per gallon */
    private double fuelEfficiency;

    /**amount of fuel in gas tank measured in gallons */
    private double fuelInTank;
    
     /** 
      * Constructor that specifies the fuel efficiency of this car
     */
    public Car(int efficiency)
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * This method reduces the fuel in the tank based on the 
     * specified miles and the efficiency of this car.
     *
     * @pre        this method is never invoked with a value for miles
     *             that consumes more than the available gas in the tank.          
     * 
     * @param      miles     number of miles driven
     */
    public void drive(int miles)
    {
         double gallonsBurned = miles / fuelEfficiency;
         this.fuelInTank = this.fuelInTank - gallonsBurned;
    }
    

    /**
                 * This method adds the specified amount of gas in gallons to this car's tank.
     *
     * @pre     the specified amount of gas doesn't exceed the capacity
     *          of this car's tank
     * @param   gallons   number of gallons of gas to add to this car's
     *                    tank.
     */
    public void addGas(int gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
        
    }
    

    /**
     * This method returns the number of gallons of gas remaining in this car's tank.
     * 
     * @return  number of gallons of gas remaining in this car's tank.
     */
    public double getGasInTank()
    {
       return this.fuelInTank;
    }

}
