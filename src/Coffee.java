/**
 * This class represents coffee that
 * the user can purchase from the
 * coffee kiosk program.
 * 
 * @author Charles Nix
 */
public class Coffee extends Beverage {

    /**
     * This method gets the cost of a small or large coffee
     * with or without add ons.
     * 
     * @return cost of coffee based on its size and add ons.
     */
    public Money getCost() {
        Money getCoffeeCost = new Money(150);
        
        if (super.size == 2) {
            getCoffeeCost = getCoffeeCost.add(Money.ONE_DOLLAR);
        }
        
        for (int i = 0; i < super.addOns.size(); i++) {
            getCoffeeCost = getCoffeeCost.add(super.addOns.get(i).getCost());
        }
        
        return getCoffeeCost;
    }
    
    /**
     * This method gets the calories of a small or large coffee
     * with or without add ons.
     * 
     * @return calories of coffee based on its size and add ons.
     */
    public int getCalories() {
        int coffeeCalories = 0;
        if (super.size == 0) {
            coffeeCalories = 5;
        } else if (super.size == 2) {
            coffeeCalories = 15;
        }
        
        for (int i = 0; i < super.addOns.size(); i++) {
            coffeeCalories = coffeeCalories + super.addOns.get(i).getCalories();
        }
        
        return coffeeCalories;
    }
    
    /**
     * This method will create a display for coffee.
     * It will include add ons, size, and calories.
     * 
     * @return String for displaying coffee.
     */
    public String toString() {
        String cupSize = "S";
        String addOns = "";
        
        if (super.size == 2) {
            cupSize = "L";
        }
        
        for (int i = 0; i < super.addOns.size(); i++) {
            addOns = addOns + "+" + super.addOns.get(i).toString();
        }
        
        return "Coffee" + addOns + " (" + cupSize + ") - " + getCalories() + " calories";
    }
}