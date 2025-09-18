public class Main {
    public static void main(String[] args) {
        CoffeeMaker maker = new LatteMaker();
        Coffee myDrink = maker.createDrink();
        System.out.println(myDrink.name());
    }
}