class PremiumAddons implements AddonsFactory {
    public Milk  createMilk()  { return new AlmondMilk(); }
    public Syrup createSyrup() { return new NutSyrup(); }
    public Cup   createCup()   { return new PremiumCup(); }
}