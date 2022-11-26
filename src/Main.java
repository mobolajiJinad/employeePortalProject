import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("\nHello,\nPress 1 to add new employee,\nPress 2 to log in as an existing employee,\nPress 3 to quit.");

            int prompt = in.nextInt();

            if (prompt == 1) {
                System.out.println("Enter the new employee's first name: ");
                String firstName = in.next();

                System.out.println("Enter employee's last name: ");
                String lastName = in.next();

                NewEmployeeRegistration newEmployee = new NewEmployeeRegistration(firstName, lastName);

                System.out.println("\nEmployee account created successfully.");

                while (true) {
                    System.out.println("\nPress 0 to go back to main menu,\nPress 1 to set department,\nPress 2 to see default password,\nPress 3 to set new password,\nPress 4 to set alternate email address,\nPress 5 to set mailbox capacity(Note, an integer),\nPress 6 to see all saved information.");

                    int command = in.nextInt();

                    if (command == 0) {
                        break;
                    }

                    else if (command == 1) {
                        System.out.println("Enter department: ");
                        String department = in.next();
                        newEmployee.setDepartment(department);
                        System.out.println("Department set successfully.");
                    }

                    else if (command == 2) {
                        System.out.println("Your password is: ");
                        System.out.println(newEmployee.getPassword());
                    }

                    else if (command == 3) {
                        String newPassword = in.next();
                        System.out.println("Enter new password: ");
                        newEmployee.changePassword(newPassword);
                        System.out.println("Password set successfully.");
                    }

                    else if (command == 4) {
                        System.out.println("Enter alternate email address: ");
                        String alternateEmail = in.next();
                        newEmployee.setAlternateEmailAddress(alternateEmail);
                        System.out.println("Alternate email address set successfully");
                    }

                    else if(command == 5) {
                        int mailboxCapacity = in.nextInt();
                        newEmployee.setMailboxCapacity(mailboxCapacity);
                        System.out.println("Mailbox capacity set successfully");
                    }

                    else if(command == 6) {
                        System.out.println("Name: " + newEmployee.getName() + "\n" + "Department: " + newEmployee.getDepartment() + "\n" + "Email address: " + newEmployee.getEmailAddress() + "\n" + "Password: " + newEmployee.getPassword() + "\n" + "Alternate email address: " + newEmployee.getAlternateEmailAddress() + "\n" + "Mailbox capacity: " + newEmployee.getMailboxCapacity());
                        System.out.println("That's all, bye.");
                    }

                }

            }

            else if (prompt == 2) {
                System.out.println("Feature not yet available.");
                break;
            }

            else if(prompt == 3) {
                break;
            }

        }
        in.close();
    }

}