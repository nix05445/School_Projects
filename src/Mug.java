/**
 * This class implements Buyable and represents the 
 * mug that the user can buy from the coffee kiosk.
 * 
 * @author Charles Nix
 */
public class Mug implements Buyable {

    /**
     * This method returns the cost of a mug.
     * @return cost of the mug.
     */
    public Money getCost() {
        return new Money(1000);
    }
    
    /**
     * This method returns the display for mug.
     * @return String for mug.
     */
    public String toString() {
        return "Classy Mug";
    }
}
