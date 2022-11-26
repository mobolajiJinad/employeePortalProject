import java.util.Random;

public class NewEmployeeRegistration {
    Random random = new Random();
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String alternateEmailAddress;
    private int mailboxCapacity;

    protected NewEmployeeRegistration(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = Password();
    }

    protected  NewEmployeeRegistration(String firstName, String lastName, String department) {
        this(firstName, lastName);
        this.department = department;
    }

    protected  void setDepartment(String department) {
        this.department = department;
    }

    protected void changePassword(String password) {
        this.password = password;
    }

    protected void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    protected void setAlternateEmailAddress(String alternateEmailAddress) {
        this.alternateEmailAddress = alternateEmailAddress;
    }

    protected String getName() {
        return firstName + " " + lastName;
    }

    protected String getEmailAddress() {
        String department = getDepartment();

        if(department == null) {
            department = "none";
        }

        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + ".company.com";
    }

    protected String getAlternateEmailAddress() {
        return alternateEmailAddress;
    }

    protected String getPassword() {
        return password;
    }

    protected int getMailboxCapacity() {
        return mailboxCapacity;
    }

    protected String getDepartment() {
        return department;
    }

    //To generate default password
    private String Password() {
        String password = "";
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '_', '.'};

        for(int i = 0; i < 4; i++) {
            char randChar = chars[random.nextInt(0, 26)];
            password += randChar;
        }

        char randCharSymb = chars[random.nextInt(36, 38)];
        password += randCharSymb;

        for(int i = 0; i < 4; i++) {
            char randChar = chars[random.nextInt(26, 36)];
            password += randChar;
        }

        return password;
    }

}
