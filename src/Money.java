/**
 * This class represents the currency that is
 * used throughout the coffee kiosk program.
 * 
 * @author Charles Nix
 */
public class Money {
    
    /** This constant represents $0.00 */
    public static final Money ZERO = new Money(0);
    /** This constant represents $1.00 */
    public static final Money ONE_DOLLAR = new Money(100);
    /** This constant represents $2.00 */
    public static final Money TWO_DOLLARS = new Money(200);
    /** This represents money but in cents. */
    private int amountInCents;
    
    /**
     * This constructor takes an integer as input, specifically
     * the instance variable amountInCents sets it to this.input
     * 
     * @param amountInCents instance variable
     */
    public Money(int amountInCents) {
        this.amountInCents = amountInCents;
    }
    
    /**
     * This method takes the amount of money from the cart
     * as input and returns the MN tax for that amount. 
     * 
     * @param money The money amount from the cart.
     * @return amount of tax for the money amount provided.
     */
    public static Money computeMNSalesTax(Money money) {
        double tax;

        tax = Math.round(money.amountInCents * 0.06875);

        return new Money((int)tax);
    }
    
    /**
     * This method takes the a money amount and adds it to
     * the money amount already in the cart.
     * 
     * @param money The amount provided from a purchase.
     * @return Sum of the money provided and the money amount already in the cart.
     */
    public Money add(Money money) {
        int newMoney = this.amountInCents + money.amountInCents;

        Money intToMoney = new Money(newMoney);
                
        return intToMoney;
    }
    
    /**
     * This method takes the a money amount and subtracts
     * it from the money amount already in the cart.
     * 
     * @param money The amount provided from a purchase.
     * @return Difference of the money provided and the money amount already in the cart.
     */
    public Money subtract(Money money) {
        int newMoney = this.amountInCents - money.amountInCents;
        
        Money intToMoney = new Money(newMoney);
        
        return intToMoney;
    }
    
    /**
     * This method converts the amountInCents variable where 
     * money was kept in cents to the normal $X.XX format.
     */
    public String toString() {
        int dollars = amountInCents/100;
        int cents = dollars*100;
        int amountMinusCents = amountInCents-cents;
        
        if (amountMinusCents == 0) {
            return "$"+dollars+"."+amountMinusCents+"0";
        }
        
        return "$"+dollars+"."+amountMinusCents;
    }
}
