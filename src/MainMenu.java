import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu
{

    //Variables
    private Scanner scanner;
    private Member member;
    private final ArrayList<Member> mList;

    private String fileName = "members.txt";


    //Constructor
    public MainMenu() { mList = new ArrayList<>();}

    //The main menu
    public void mainMenu()
    {
        char option = ' ';

        //Loop until the user exits the system
        while(option != '4')
        {
            //The menu options
            System.out.println("");
            System.out.println("Main Menu");
            System.out.println("");
            System.out.println("1. Enter a New Member.");
            System.out.println("2. View List of Members.");
            System.out.println("3. Display Member’s Receipt.");
            System.out.println("4. Exit the System.");
            System.out.println("");
            System.out.print("Please enter an option: ");

            //Get the user's selected option
            scanner = new Scanner(System.in);
            option = scanner.next().charAt(0);

            //Execute the user's selected option
            switch (option)
            {
                case '1':
                    //Call the enter new member menu
                    enterNewMemberMenu();
                    break;
                case '2':
                    //Call the list members menu
                    listMembersMenu();
                    break;
                case '3':
                    //Call the view member's receipt menu
                    viewMemberReceiptMenu();
                    break;
                case '4':
                    //Show exit message
                    System.out.println("Goodbye");
                    //Exit program
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. please try again.");
            }
        }
    }

    //Enter new member sub-menu
    private void enterNewMemberMenu()
    {
        char option = ' ';

        //Loop until the user exits this menu option
        while(option != '2')
        {
            //The menu options
            System.out.println("");
            System.out.println("Enter a New Member");
            System.out.println("");
            System.out.println("1. Enter a New Member.");
            System.out.println("2. Back to Main Menu.");
            System.out.println("");
            System.out.print("Please enter an option: ");

            //Get the user's option
            scanner = new Scanner(System.in);
            option = scanner.next().charAt(0);

            //Execute the user's selected option
            switch (option)
            {
                case '1':
                    //Call the method for entering a new member
                    enterNewMember();
                    break;
                case '2':
                    //Going back to main menu
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }
    }

    //List all the members sub-menu
    private void listMembersMenu()
    {
        char option = ' ';

        //Loop until the user exits this menu option
        while (option != '2')
        {
            //The menu options
            System.out.println("");
            System.out.println("View List of Members");
            System.out.println("");
            System.out.println("1. View List of Members.");
            System.out.println("2. Back to Main Menu.");
            System.out.println("");
            System.out.print("Please enter an option: ");

            //Get the user's option
            scanner = new Scanner(System.in);
            option = scanner.next().charAt(0);

            //Execute the user's selected option
            switch (option)
            {
                case '1':
                    // Call the method for listing the members
                    listMembers();
                    break;
                case '2':
                    // Going back to main menu
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    //View member's receipt sub-menu
    private void viewMemberReceiptMenu()
    {
        char option = ' ';

        // Loop until the user exits this menu option
        while(option != '2') {
            // The menu options
            System.out.println("");
            System.out.println("Display Member’s Receipt");
            System.out.println("");
            System.out.println("1. Display Member’s Receipt.");
            System.out.println("2. Back to Main Menu.");
            System.out.println("");
            System.out.print("Please enter an option: ");

            // Get the user's option
            scanner = new Scanner(System.in);
            option = scanner.next().charAt(0);

            // Execute the user's selected option
            switch (option) {
                case '1':
                    // Call the method for displaying member's receipt
                    viewMemberReceipt();
                    break;
                case '2':
                    // Going back to main menu
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    //Enter a new member
    private void enterNewMember()
    {
        // Local variables
        char answer = ' ';
        String input;
        String memberName;
        String memberSurname;
        LocalDate memberDOB;
        int memberAge;
        String membership = "";
        double anualFee = 0.0;
        double joiningFee = 0.0;
        double journalFee = 8.0;

        // Member type
        String[] memberType = { "General", "Student", "Child"};

        // Show header
        System.out.println("");
        System.out.println("Enter a New Member");
        System.out.println("");

        // Ask for the member's name
        System.out.print("Enter New Member's Name: ");
        scanner = new Scanner(System.in);
        memberName = scanner.next();

        // Ask for the member's surname
        System.out.print("Enter New Member's Surname: ");
        scanner = new Scanner(System.in);
        memberSurname = scanner.next();

        // Ask for the member's dob
        System.out.print("Enter New Member's DOB (YYYY-MM-DD format): ");
        scanner = new Scanner(System.in);
        input = scanner.next();

        // the parse() method obtains an instance of LocalDate
        // from a text string such as 2023-02-11
        memberDOB = LocalDate.parse(input);

        // Calculate member's age
        memberAge = calculateAge(memberDOB);

        // Check member's age
        if (memberAge > 0 && memberAge <= 16)
        {
            // Select 'child' from member's type
            membership = memberType[2];
            anualFee = 45.0;
            joiningFee = 0.0;
        }
        else {
            // Loop until we get the right answer
            while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
                // Check if the member is a student
                System.out.print("Student (y/n)?: ");
                scanner = new Scanner(System.in);
                answer = scanner.next().charAt(0);

                // Check answer
                switch (answer) {
                    case 'y':
                    case 'Y':
                        // Select 'student' from member's type
                        membership = memberType[1];
                        anualFee = 70.0;
                        joiningFee = 10.0;
                        break;
                    case 'n':
                    case 'N':
                        // Select 'general' from member's type
                        membership = memberType[0];
                        anualFee = 100.0;
                        joiningFee = 20.0;
                        break;
                    default:
                        System.out.println("Invalid answer. Please try again.");
                }
            }
        }

        // Add a new member
        member = new Member(memberName, memberSurname, memberDOB, memberAge, membership, anualFee, joiningFee, journalFee);
        mList.add(member);

        // Show message to the user
        System.out.println("");
        System.out.println("A New Member Added Successfully.");
        // Show new member
        System.out.println(member.toString());

        // Save the member to a file
        try
        {
            // Create a file object
            File file = new File(fileName);

            // Check if the file does not exist
            if (!file.exists())
            {
                // Create the new file
                file.createNewFile();
            }

            // Write the new member to the file
            FileWriter fw = new FileWriter(file, true); // Create a FileWriter object with true to append to the file

            // Create BufferedWriter object to improve writing performance
            BufferedWriter bw = new BufferedWriter(fw);

            // Create a comma separated string of member details
            String memberDetails = member.getMemberID() + "," +
                    member.getName() + "," +
                    member.getSurname() + "," +
                    member.getDob() + "," +
                    member.getMemberAge() + "," +
                    member.getMemberType() + "," +
                    member.getAnualFee() + "," +
                    member.getJoiningFee() + "," +
                    member.getJournalFee();

            // Write the new member to the file with a line break
            bw.write(memberDetails + "\n");

            // Close the BufferedWriter
            bw.close();

            // Close the FileWriter
            fw.close();

            // Show message to the user
            System.out.println("Member details saved to 'members.txt' file.");

        } catch (IOException e)
        {
            // Catch and handle any IO exception that occurs
            System.out.println("Error saving member details to the file: " + e.getMessage());
        }

    }

    // List all members
    private void listMembers()
    {
        // Local variables
        int numMembers = 0; // members counter

        // Show header
        System.out.println("");
        System.out.println("List of Members:");

        // Read members from the file if it exists
        try
        {
            // Create a file object
            File file = new File(fileName);

            // Check if the file exists
            if (file.exists())
            {
                // Create BufferedReader to read the file line by line
                BufferedReader br = new BufferedReader(new FileReader(file));

                // Read the first line of the file
                String line = br.readLine();

                // Loop through the file, printing each line an counting the number of lines
                while (line != null) {
                    System.out.println(line); // print the line
                    numMembers++; // increment the members counter
                    line = br.readLine(); // read the next line
                }

                // Close the BufferedReader
                br.close();

            }
            else
            {
                // If the file does not exist, show message
                System.out.println("No members found.");
            }
        } catch (IOException e)
        {
            // Catch and handle any IO exception that occurs
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Show total number of members
        System.out.println("Total Number of Members: " + numMembers);
    }

    // View member's receipt
    private void viewMemberReceipt()
    {
        System.out.println("");

        // Ask for the member's name
        System.out.print("Enter Member's ID: ");
        scanner = new Scanner(System.in);

        // Get member ID as a string
        String memberIdString = scanner.next();

        // Cast the member ID string to integer
        int memberID = Integer.parseInt(memberIdString) - 1;

        // Show header
        System.out.println("");
        System.out.println("Member's Receipt:");

        // Show member's receipt
        // Read members from the file if it exists
        try
        {
            // Create a file object
            File file = new File(fileName);

            // Check if the file exists
            if (file.exists())
            {
                // Create BufferedReader to read the file line by line
                BufferedReader br = new BufferedReader(new FileReader(file));

                String line;

                // Loop through the file, printing each line an counting the number of lines
                while ((line = br.readLine()) != null) {
                    // Split the line by commas
                    String[] values = line.split(",");

                    // Get the member ID from the file
                    int fileMemberID = Integer.parseInt(values[0]) - 1;

                    // Check if the member ID in the file matches the member ID entered by the user
                    if (memberID == fileMemberID) {
                        // Print the receipt
                        System.out.println("Statement for " + LocalDate.now().getMonth() + " " + LocalDate.now().getYear() + " " + " for " + values[1] +
                                " " + values[2] +
                                " - NEW " + values[5] +
                                " Membership");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println(values[5] + " Member Enrolment");
                        System.out.println("Date: " + LocalDate.now().getDayOfMonth() + " " + LocalDate.now().getMonth() + " " + LocalDate.now().getYear());
                        System.out.println("Purchases:");
                        System.out.println("\t1. Anual Membership: £" + values[6]);
                        System.out.println("\t2. Joining Fee: £" + values[7]);
                        System.out.println("\t3. Journal Fee: £" + values[8]);
                        // Calculte the total fee to pay for the membership
                        double totalFee = Double.parseDouble(values[6]) + Double.parseDouble(values[7]) + Double.parseDouble(values[8]);
                        System.out.println("");
                        System.out.println("Total Price: £" + totalFee);
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    }
                }

                // Close the BufferedReader
                br.close();

                // If the member ID entered by the user is not found in the file
                System.out.println("Member not found in the file.");

            }
            else
            {
                // If the file does not exist, show message
                System.out.println("No members found.");
            }
        } catch (IOException e)
        {
            // Catch and handle any IO exception that occurs
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    // Calculate member's age
    private int calculateAge(LocalDate memberDOB)
    {
        // Creates an instance of the LocalDate class and invokes the now() method
        // The now() method gets the current date from the system clock in the default time zone
        LocalDate currentDate = LocalDate.now();
        // Calculates the amount of time between two dates and returns the years
        if ((memberDOB != null) && (currentDate != null))
        {
            return Period.between(memberDOB, currentDate).getYears();
        }
        else {return 0;}

    }
}
