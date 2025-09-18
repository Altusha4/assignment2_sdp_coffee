class LatteMaker extends CoffeeMaker {
    @Override
    public Coffee createDrink() {
        return new Latte();
    }
}