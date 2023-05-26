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

public class MemberTest
{

    public MemberTest() {}

    /**
     * Test of getMemberID method, of class Member.
     */
    @Test
    public void testGetMemberID()
    {
        System.out.println("getMemberID");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        int expResult = 10;
        int result = instance.getMemberID();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMemberAge method, of class Member.
     */
    @Test
    public void testGetMemberAge()
    {
        System.out.println("getMemberAge");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        int expResult = 33;
        int result = instance.getMemberAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMemberType method, of class Member.
     */
    @Test
    public void testGetMemberType()
    {
        System.out.println("getMemberType");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        String expResult = "1";
        String result = instance.getMemberType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAnualFee method, of class Member.
     */
    @Test
    public void testGetAnualFee()
    {
        System.out.println("getAnualFee");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        double expResult = 70.0;
        double result = instance.getAnualFee();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getJoiningFee method, of class Member.
     */
    @Test
    public void testGetJoiningFee()
    {
        System.out.println("getJoiningFee");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        double expResult = 10.0;
        double result = instance.getJoiningFee();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getJournalFee method, of class Member.
     */
    @Test
    public void testGetJournalFee()
    {
        System.out.println("getJournalFee");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        double expResult = 8.0;
        double result = instance.getJournalFee();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setMemberAge method, of class Member.
     */
    @Test
    public void testSetMemberAge()
    {
        System.out.println("setMemberAge");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        int memberAge = 0;
        instance.setMemberAge(memberAge);
    }

    /**
     * Test of setMemberType method, of class Member.
     */
    @Test
    public void testSetMemberType()
    {
        System.out.println("setMemberType");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        String memberType = "";
        instance.setMemberType(memberType);
    }

    /**
     * Test of setAnualFee method, of class Member.
     */
    @Test
    public void testSetAnualFee()
    {
        System.out.println("setAnualFee");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        double anualFee = 0.0;
        instance.setAnualFee(anualFee);
    }

    /**
     * Test of setJoiningFee method, of class Member.
     */
    @Test
    public void testSetJoiningFee()
    {
        System.out.println("setJoiningFee");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        double joiningFee = 0.0;
        instance.setJoiningFee(joiningFee);
    }

    /**
     * Test of setJournalFee method, of class Member.
     */
    @Test
    public void testSetJournalFee()
    {
        System.out.println("setJournalFee");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        double journalFee = 0.0;
        instance.setJournalFee(journalFee);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Member instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        String expResult = "Member{mID=3, name=Jane, surname=Smith, dob=1990-06-23, age=33, memberType=1, anualFee=70.0, joiningFee=10.0, journalFee=8.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }


    /**
     * Test of calculateTotalFee method, of class Member.
     */
    @Test
    public void testCalculateTotalFee()
    {
        System.out.println("calculateTotalFee");
        Member instance;
        instance = new MemberTest.MemberImp("Jane", "Smith", LocalDate.of(1990, 06, 23), 33, "1", 70.0, 10.0, 8.0);
        double expResult = 70+10+8;
        double result = instance.calculateTotalFee();
        assertEquals(expResult, result, 0);
    }



    public class MemberImp extends Member
    {
        public MemberImp(String name, String surname, LocalDate dob, int memberAge, String memberType, double anualFee, double joiningFee, double journalFee)
        {
            super(name, surname, dob, memberAge, memberType, anualFee, joiningFee, journalFee);
        }
    }

}
