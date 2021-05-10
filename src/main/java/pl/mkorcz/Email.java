package pl.mkorcz;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailboxCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department " + this.department);
    }

    private String setDepartment() {
        System.out.println("Department codes ");
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
}
