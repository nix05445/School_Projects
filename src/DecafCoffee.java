/**
 * This class extends the Coffee class and
 * it represents the decaf coffee that the
 * user can purchase from the coffee kiosk
 * program.
 * 
 * @author Charles Nix
 */
public class DecafCoffee extends Coffee {

    /**
     * This method uses the Coffee toString()
     * method but adjusts it for displaying
     * decaf coffee.
     * 
     * @return String for displaying decaf coffee.
     */
    public String toString() {
        super.toString();
        String cupSize = "S";
        String addOns = "";
        
        return "Decaf Coffee" + addOns + " (" + cupSize + ") - " + getCalories() + " calories";        
    }
}
