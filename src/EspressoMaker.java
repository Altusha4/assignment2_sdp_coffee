class EspressoMaker extends CoffeeMaker {
    @Override
    public Coffee createDrink() {
        return new Espresso();
    }
}