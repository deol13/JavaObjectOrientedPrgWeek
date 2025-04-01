package se.lexicon.LectureTwo;

public class Fries extends FoodItem {

    private Size size; // S, M, L
    private boolean spicy;
    private boolean isSweetPotato;

    public Fries(Size size, boolean spicy, boolean isSweetPotato) {
        super(size.getTitle(), size.getPrice());
        this.size = size;
        this.spicy = spicy;
        this.isSweetPotato = isSweetPotato;
    }

    public Fries() {
        super(Size.M.getTitle(), Size.M.getPrice());
        this.spicy = true;
        this.size = Size.M;
        this.isSweetPotato = true;
    }

    public Size getSize() {
        return size;
    }

    public boolean isSpicy() {
        return spicy;
    }

    public boolean isSweetPotato() {
        return isSweetPotato;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.2;
    }

    @Override
    public String toString() {
        return "Fries{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", size=" + size +
                ", spicy=" + spicy +
                ", isSweetPotato=" + isSweetPotato +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Name: " + getName() + ", Price: " + getPrice() + ", Size: " + size + ", Spicy: " + spicy + ", Sweet potato: " + isSweetPotato;
//    }
}
