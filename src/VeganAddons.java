class VeganAddons implements AddonsFactory {
    public Milk  createMilk()  { return new SoyMilk(); }
    public Syrup createSyrup() { return new VanillaSyrup(); }
    public Cup   createCup()   { return new ReusableCup(); }
}