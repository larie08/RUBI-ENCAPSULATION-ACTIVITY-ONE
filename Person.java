/* OOPROG SEMIFINALS ACTIVITY ONE: ENCAPSULATION
NAME: RUBI, LARIE JANE   BSIT2B */

import java.util.Scanner;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String address;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBirthday(int month, int day, int year) {
        this.birthMonth = month;
        this.birthDay = day;
        this.birthYear = year;
    }

    public String getBirthday() {
        return String.format("%02d/%02d/%04d", birthMonth, birthDay, birthYear);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();

        while (true) {
            System.out.println("Enter your First Name: ");
            String firstName = scanner.next();
            if (!firstName.matches("^[a-zA-Z]*$")) {
                System.out.println("Invalid input. Please enter a valid First name.");
                continue;
            }
            person.setFirstName(firstName);
            break;
        }

        while (true) {
            System.out.println("Enter your Middle Name: ");
            String middleName = scanner.next();
            if (!middleName.matches("^[a-zA-Z]*$")) {
                System.out.println("Invalid input. Please enter a valid Middle name.");
                continue;
            }
            person.setMiddleName(middleName);
            break;
        }

        while (true) {
            System.out.println("Enter your Last Name: ");
            String lastName = scanner.next();
            if (!lastName.matches("^[a-zA-Z]*$")) {
                System.out.println("Invalid input. Please enter a valid Last name.");
                continue;
            }
            person.setLastName(lastName);
            break;
        }

        while (true) {
            System.out.println("How old are you?: ");
            try {
                int age = scanner.nextInt();
                person.setAge(age);
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid Age.");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.println("When is your birthday (MM/DD/YYYY)?: ");
            String birthdayInput = scanner.next();
            if (birthdayInput.matches("\\d{2}/\\d{2}/\\d{4}")) {
                String[] parts = birthdayInput.split("/");
                int month = Integer.parseInt(parts[0]);
                int day = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);
                person.setBirthday(month, day, year);
                break;
            } else {
                System.out.println("Invalid input. Please follow the format.");
            }
        }

        System.out.println("Kindly enter your address: ");
        String address = scanner.next();
        person.setAddress(address);

        System.out.println("Hello! It's nice to meet you~ ");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Middle Name: " + person.getMiddleName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birthday: " + person.getBirthday());
        System.out.println("Address: " + person.getAddress());
    }
}
