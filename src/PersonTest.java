import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Object-Oriented Programming Advanced Concepts
 * HND Software Development
 * Year 2
 *
 * Anna Podlasek
 * EC1842981
 * May 2023
 */

public class PersonTest
{

    public PersonTest() {}

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        Person instance;
        instance = new PersonImp("Jane", "Smith", LocalDate.of(1990, 06, 23));
        String expResult = "Jane";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSurname method, of class Person.
     */
    @Test
    public void testGetSurname()
    {
        System.out.println("getSurname");
        Person instance;
        instance = new PersonImp("Jane", "Smith", LocalDate.of(1990, 06, 23));
        String expResult = "Smith";
        String result = instance.getSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDob method, of class Person.
     */
    @Test
    public void testGetDob()
    {
        System.out.println("getDob");
        Person instance;
        instance = new PersonImp("Jane", "Smith", LocalDate.of(1990, 06, 23));
        LocalDate expResult = LocalDate.of(1990, 06, 23);
        LocalDate result = instance.getDob();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName()
    {
        System.out.println("setName");
        Person instance;
        instance = new PersonImp("Jane", "Smith", LocalDate.of(1990, 06, 23));
        String name = "John";
        instance.setName(name);
        String expResult = "John";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSurname method, of class Person.
     */
    @Test
    public void testSetSurname()
    {
        System.out.println("setSurname");
        Person instance;
        instance = new PersonImp("Jane", "Smith", LocalDate.of(1990, 06, 23));
        String surname = "Novak";
        instance.setSurname(surname);
        String expResult = "Novak";
        String result = instance.getSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDob method, of class Person.
     */
    @Test
    public void testSetDob()
    {
        System.out.println("setDob");
        Person instance;
        instance = new PersonImp("Jane", "Smith", LocalDate.of(1990, 06, 23));
        LocalDate dob = LocalDate.of(1991, 02, 06);
        instance.setDob(dob);
        LocalDate expResult = LocalDate.of(1991, 02, 06);
        LocalDate result = instance.getDob();
        assertEquals(expResult, result);
    }

    public class PersonImp extends Person
    {
        public PersonImp(String name, String surname, LocalDate dob)
        {
            super(name, surname, dob);
        }
    }

}
