package se.lexicon.LectureOne;

import java.time.LocalDate;
import java.util.UUID;

public class Car {

    // Fields
    private final String vin;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int mileage;

    public Car(String brand, String model, int year, String color, int mileage) {
        this.vin = UUID.randomUUID().toString();
        setBrand(brand);
        setModel(model);
        setYear(year);
        setColor(color);
        move(mileage);
    }

    //this(brand, model, year, color, mileage) calls the constructor above that has those parameters.
    public Car(String brand, String model, int year) {
        this(brand, model, year, "", 0);
    }

    //this(brand, model, year) calls the constructor above that has those parameters.
    public Car(String brand, String model) {
        this(brand, model, LocalDate.now().getYear());
    }

    //    public Car(){
//        this.vin = null;
//        this.color = null;
//        this.brand = null;
//        this.model = null;
//        this.year = 0;
//        this.mileage = 0;
//    }

    // getters and setters
    public String getVin() {
        return vin; // It returns the read only value of vin
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getMileage(){
        return mileage;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty())
            throw new IllegalArgumentException("Brand should not be null or empty!");
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty())
            throw new IllegalArgumentException("Model should not be null or empty!");
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 1885 && year <= LocalDate.now().plusYears(1).getYear()) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year");
        }
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) this.color = "Gray";
        else this.color = color;
    }

    public void move(int miles) {
        if (miles > 0) {
            mileage += miles;
        } else {
            throw new IllegalArgumentException("Invalid miles");
        }

    }

    public String getCarInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car Info -> ")
                .append(" VIN: ").append(vin)
                .append(", Brand: ").append(brand)
                .append(", Model: ").append(model)
                .append(", Color: ").append(color)
                .append(", Year: ").append(year)
                .append(", Mileage: ").append(mileage);
        return sb.toString();
    }
}
