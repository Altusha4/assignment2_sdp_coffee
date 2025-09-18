class CappuccinoMaker extends CoffeeMaker {
    @Override
    public Coffee createDrink() {
        return new Cappuccino();
    }
}