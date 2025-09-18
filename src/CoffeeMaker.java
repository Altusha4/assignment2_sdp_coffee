//Factory Method
abstract class CoffeeMaker {
    public abstract Coffee createDrink();
}

class EspressoCoffeeMaker extends CoffeeMaker {
    @Override
    public Coffee createDrink() {
        return new Espresso();
    }
}
class LatteMaker  extends CoffeeMaker {
    @Override
    public Coffee createDrink() {
        return new Latte();
    }
}
class CappuccinoMaker extends CoffeeMaker {
    @Override
    public Coffee createDrink() {
        return new Cappuccino();
    }
}