package se.lexicon.LectureTwo;

public enum Size {
    S("Small fries", 4.99),
    M("Medium fries", 8.99),
    L("Large fries", 10.99);

    private String title;
    private double price;

    Size(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
