// CoffeeOrderService.java
class CoffeeOrderService {
    public FinalCoffee makeOrder(CoffeeMaker maker, AddonsFactory addons) {
        Coffee drink = maker.createDrink();   // Factory Method
        Milk   milk  = addons.createMilk();   // Abstract Factory
        Syrup  syrup = addons.createSyrup();
        Cup    cup   = addons.createCup();
        return new FinalCoffee(drink, milk, syrup, cup);
    }
}
