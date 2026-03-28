class Food {
    String name;
    int basePrice;

    public Food(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public int calcPrice() {
        return basePrice + 5000;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + calcPrice());
    }
}

class RegularMenu extends Food {
    public RegularMenu(String name, int basePrice) { super(name, basePrice); }
    @Override
    public int calcPrice() {
        return super.calcPrice() + 10000;
    }
}

class SpecialMenu extends Food {
    public SpecialMenu(String name, int basePrice) { super(name, basePrice); }
    @Override
    public int calcPrice() {
        return super.calcPrice() + 20000;
    }
}

public class thrquest3 {
    public static void main(String[] args) {
        Food f1 = new Food("Beef Rendang", 15000);
        RegularMenu f2 = new RegularMenu("Chicken Ramen", 20000);
        SpecialMenu f3 = new SpecialMenu("Fiery Fried Rice", 80000);

        f1.getInfo();
        f2.getInfo();
        f3.getInfo();
    }
}
