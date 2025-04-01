package se.lexicon.LectureTwo;

public final class Burger extends FoodItem {
    private String type; // enum Type of burger (Beef, Chicken, ...)
    private boolean hasCheese;
    private boolean hasLettuce;

    public Burger(String name, double price, String type, boolean hasCheese, boolean hasLettuce) {
        super(name, price);
        this.type = type;
        this.hasCheese = hasCheese;
        this.hasLettuce = hasLettuce;
    }

    // Overriding
    @Override
    public String getDescription(){
        return super.getDescription() + ", Type: " + type;
        //return "Name: " + super.getName() + " , Price: " + super.getPrice() + " , Type: " + type;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.1;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Price: " + getPrice() + ", Type: " + type + ", Cheese: " + hasCheese + ", Lettuce: " + hasLettuce;
    }
}
