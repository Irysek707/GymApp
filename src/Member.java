import java.time.LocalDate;

public class Member extends Person implements IPayable
{
    // Instance variables
    private static int memberCounter = 0;
    private final int memberID;
    private int memberAge;
    private String memberType;
    double anualFee;
    double joiningFee;
    double journalFee;

    // Constructor
    public Member(String name, String surname, LocalDate dob, int memberAge, String memberType, double anualFee, double joiningFee, double journalFee)
    {
        super(name, surname, dob); // The super class constructor
        this.memberID = ++memberCounter;
        this.memberAge = memberAge;
        this.memberType = memberType;
        this.anualFee = anualFee;
        this.joiningFee = joiningFee;
        this.journalFee = journalFee;
    }

    // Getters
    public int getMemberID() {
        return memberID;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public String getMemberType() {
        return memberType;
    }

    public double getAnualFee() {
        return anualFee;
    }

    public double getJoiningFee() {
        return joiningFee;
    }

    public double getJournalFee() {
        return journalFee;
    }

    // Setters
    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }


    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public void setAnualFee(double anualFee) {
        this.anualFee = anualFee;
    }

    public void setJoiningFee(double joiningFee) {
        this.joiningFee = joiningFee;
    }

    public void setJournalFee(double journalFee) {
        this.journalFee = journalFee;
    }

    // toString method to show member content
    @Override
    public String toString()
    {
        return "Member{" + "mID=" + memberID + ", name=" + getName() + ", surname=" + getSurname() + ", dob=" + getDob() + ", age=" + memberAge + ", memberType=" + memberType + ", anualFee=" + anualFee + ", joiningFee=" + joiningFee + ", journalFee=" + journalFee + '}';
    }

    // Interface method
    @Override
    public double calculateTotalFee()
    {
        // The body of calculateTotalFee() is provided here
        return getAnualFee() + getJoiningFee() + getJournalFee();
    }
}
