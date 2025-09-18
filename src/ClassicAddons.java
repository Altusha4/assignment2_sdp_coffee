class ClassicAddons implements AddonsFactory {
    public Milk  createMilk()  { return new RegularMilk(); }
    public Syrup createSyrup() { return new CaramelSyrup(); }
    public Cup   createCup()   { return new DisposableCup(); }
}