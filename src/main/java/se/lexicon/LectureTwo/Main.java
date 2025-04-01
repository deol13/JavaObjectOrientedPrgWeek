package se.lexicon.LectureTwo;

public class Main {
    public static void main(String[] args) {
        Burger cheeseBurger = new Burger("Cheese burger", 12.99, "Beef", true, true);
        Burger chickenBurger = new Burger("Chicken burger", 9.99, "Chicken", true, true);

//        System.out.println(cheeseBurger);
//        System.out.println(chickenBurger.toString());
//        System.out.println(cheeseBurger.calculateTax());
//        System.out.println(chickenBurger.calculateTax());


        Fries fries = new Fries(Size.S, true, false);
//        System.out.println(fries);
//        System.out.println(fries.calculateTax());

        Fries mediumFires = new Fries();
//        System.out.println(mediumFires);

        FoodOrderItem foodOrderItem = new FoodOrderItem();
        foodOrderItem.addItem(cheeseBurger);
        foodOrderItem.addItem(chickenBurger);
        foodOrderItem.addItem(fries);
        foodOrderItem.addItem(mediumFires);

        foodOrderItem.displayItems();
    }
}
