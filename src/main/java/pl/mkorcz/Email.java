package pl.mkorcz;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private String companySuffix = "snpoland.com";
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        email = firstName.toLowerCase() + lastName.toLowerCase() + "@"  + department.toLowerCase() + ".4" + companySuffix;
    }

    private String setDepartment() {
        System.out.println("Hello "  +  firstName + ".");
        System.out.println("Department codes: ");
        System.out.println("1 for Sales");
        System.out.println("2 for Development");
        System.out.println("3 for Marketing");
        System.out.println("4 for Production");
        System.out.println("5 for Accounting");
        System.out.println("0 for none");
        System.out.println("Enter department code: ");

        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();

        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Marketing";
        } else if (departmentChoice == 4) {
            return "Production";
        } else if (departmentChoice == 5) {
            return "Accounting";
        } else {
            return "None";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%^&*()";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public String showInfo() {
        return "Display name: " + firstName + " " + lastName +
                "\nCompany e-mail: " + email +
                "\nMaibox capacity: " + mailboxCapacity + "mb";
    }
}
