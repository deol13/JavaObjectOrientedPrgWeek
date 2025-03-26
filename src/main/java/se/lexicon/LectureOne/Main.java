package se.lexicon.LectureOne;

import java.time.LocalDate;

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
        Car volvo1 = new Car("Volvo", "C40", 2015);
        Car volvo2 = new Car("Volvo", "XC40", 2024);
        volvo2.setBrand("VOLVO");

        Person person1 = new Person("1", "Simon Hyman", "simon@gmail.com", LocalDate.parse("2000-01-01"));
        Person person2 = new Person("2", "Marcus Bengtsson", "marcus@gmail.com", LocalDate.parse("1995-01-01"));

        bmw.setOwner(person1);
        volvo1.setOwner(person1);

        System.out.println(bmw.getCarInfo());
        System.out.println(volvo1.getCarInfo());
        System.out.println(volvo2.getCarInfo());
    }
}
