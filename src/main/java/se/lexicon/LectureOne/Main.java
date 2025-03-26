package se.lexicon.LectureOne;

public class Main {
    public static void main(String[] args) {
//        Car volvo1 = new Car();
//        volvo1.setBrand("Volvo");
//        volvo1.setModel("C40");
//        volvo1.setColor("");
//        volvo1.setYear(2010);
//        volvo1.move(10);
//        System.out.println(volvo1.getCarInfo());

        Car bmw = new Car("BMW", "X6");
        System.out.println(bmw.getCarInfo());
        Car volvo1 = new Car("Volvo", "C40", 2015);
        System.out.println(volvo1.getCarInfo());
        Car volvo2 = new Car("Volvo", "XC40", 2024);
        volvo2.setBrand("VOLVO");
        System.out.println(volvo2.getCarInfo());
    }
}
