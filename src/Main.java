public class Main {
    public static void main(String[] args) {
        CoffeeOrderService service = new CoffeeOrderService();

        FinalCoffee order1 = service.makeOrder(new EspressoMaker(),   new ClassicAddons());
        FinalCoffee order2 = service.makeOrder(new LatteMaker(),      new VeganAddons());
        FinalCoffee order3 = service.makeOrder(new CappuccinoMaker(), new PremiumAddons());

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }
}
