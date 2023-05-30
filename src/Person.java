
import java.time.LocalDate;

/**
 * Object-Oriented Programming Advanced Concepts
 * HND Software Development
 * Year 2
 *
 * Anna Podlasek
 * EC1842981
 * May 2023
 */

public class Person
{
    // Variables
    private String name;
    private String surname;
    private LocalDate dob;

    // Constructor
    public Person(String name, String surname, LocalDate dob)
    {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
