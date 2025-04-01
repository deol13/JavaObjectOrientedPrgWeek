package se.lexicon.LectureTwo;

public abstract class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription(){
        return "Item: " + name + ", Price: " + price;
    }

    public abstract double calculateTax();
}
