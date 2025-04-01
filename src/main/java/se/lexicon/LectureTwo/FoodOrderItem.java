package se.lexicon.LectureTwo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class FoodOrderItem implements IOrderItem {

    private final String id;
    private final LocalDateTime dateTime;
    private FoodItem[] items;

    public FoodOrderItem() {
        this.id = UUID.randomUUID().toString();
        this.dateTime = LocalDateTime.now();
        this.items = new FoodItem[0];
    }

    @Override
    public void addItem(FoodItem foodItem) {
        if(items.length < MAX_ITEMS){
            FoodItem[] newItems = Arrays.copyOf(items, items.length + 1);
            newItems[newItems.length - 1] = foodItem;
            items = newItems;
        }
        // else Throw error
    }

    @Override
    public void removeItem(FoodItem foodItem) {
        // todo: needs completion
    }

    @Override
    public FoodItem[] getItems() {
        return Arrays.copyOf(items, items.length);
    }

    @Override
    public double calculateTotalPrice() {
        double sum = 0.0;
        for (FoodItem item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    @Override
    public void displayItems() {
        System.out.println("Id: " + id);
        System.out.println("Date Time: " + dateTime);
        System.out.println("Items: ");
        for (FoodItem item : items) {
            System.out.println("   " + item.getDescription());
        }
        System.out.println("Total price: " + calculateTotalPrice());
        System.out.println("Tax: " + calculateTax());
    }

    public double calculateTax() {
        double tax = 0.0;
        for (FoodItem item : items) {
            tax += item.calculateTax();
        }
        return tax;
    }
}
