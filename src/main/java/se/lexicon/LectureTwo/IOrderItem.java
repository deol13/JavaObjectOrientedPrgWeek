package se.lexicon.LectureTwo;

public interface IOrderItem {

    int MAX_ITEMS = 10; // public static final by default

    void addItem(FoodItem foodItem);
    void removeItem(FoodItem foodItem);
    FoodItem[] getItems();
    double calculateTotalPrice();
    void displayItems();

    // default & static methods
}
