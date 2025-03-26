package se.lexicon.LectureOne;

import java.time.LocalDate;

public class Person {
    private String id;
    private String name;
    private String email;
    private LocalDate birthDate;

    public Person(String id, String name, String email, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getPersonInfo() {
        return "Id: " + id + ", Name: " + name + ", email: " + email + ", birth date: " + birthDate.toString();

    }
}
