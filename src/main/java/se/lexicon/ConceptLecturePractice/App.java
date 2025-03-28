package se.lexicon.ConceptLecturePractice;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        SystemDeveloper developer1 = new SystemDeveloper(1, "Dennis", LocalDate.now().minusYears(5),
                new String[]{"abc", "ra", "barsa", "asrs"},
                new String[]{"C++", "C#", "Python", "Java"});
        SystemDeveloper developer2 = new SystemDeveloper(2, "Johan", LocalDate.now().minusYears(1),
                new String[]{"abc", "ra"},
                new String[]{"Java", "Python"});
        SystemDeveloper developer3 = new SystemDeveloper(3, "Marcus", LocalDate.now().minusYears(2),
                new String[]{"abc", "ra", "barsa"},
                new String[]{"C#", "Java", "Python"});

        SalesPerson salesPerson1 = new SalesPerson(4, "Mattias", LocalDate.now().minusYears(1),
            1, new String[]{"Volvo"});
        SalesPerson salesPerson2 = new SalesPerson(4, "Petter", LocalDate.now().minusYears(2),
            2, new String[]{"TFK", "LBA"});
        SalesPerson salesPerson3 = new SalesPerson(5, "Gunilla", LocalDate.now().minusYears(5),
            5, new String[]{"OLB", "ALDF", "DLTSA"});

        System.out.println("Developer 1: " + developer1.toString());
        System.out.println("Developer 2: " + developer2.toString());
        System.out.println("Developer 3: " + developer3.toString());

        System.out.println("Sales 1: " + salesPerson1.toString());
        System.out.println("Sales 2: " + salesPerson2.toString());
        System.out.println("Sales 3: " + salesPerson3.toString());
    }



}
