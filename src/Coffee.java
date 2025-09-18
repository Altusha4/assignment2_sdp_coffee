public interface Coffee {
    String name();
}
class Espresso implements Coffee {
    public String name() {
        return "Espresso";
    }
}

class Latte implements Coffee {
    public String name() {
        return "Latte";
    }
}

class Cappuccino implements Coffee {
    public String name() {
        return "Cappuccino";
    }
}

