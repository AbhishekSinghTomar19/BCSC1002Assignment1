/*  Created by IntelliJ IDEA.
 *  User: Abhishek Singh Tomar (AbhishekSinghTomar19)
 *  Date: 24/08/20
 *  Time: 9:00 AM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Arrays;
import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String studentFirstName = scanner.nextLine();
        System.out.print("Enter your middle name : ");
        String studentMiddleName = scanner.nextLine();
        System.out.print("Enter your last name : ");
        String studentLastName = scanner.nextLine();
        System.out.print("Enter your university roll number : ");
        long studentUniversityRollNumber = scanner.nextInt();
        Student student = new Student(studentFirstName, studentMiddleName, studentLastName, studentUniversityRollNumber);
        System.out.println();
        System.out.println("<---------------------------->");
        System.out.println();
        System.out.println(student);
        System.out.println();
        System.out.println("<---------------------------->");
        System.out.println();
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-" + "\n" + "How may I help you today?" + "\n" + "1. Issue a new book for me."
                + "\n" + "2. Return a previously issues book for me." + "\n" + "3. Show me all my issues books." + "\n" + "4. Exit.");
        System.out.println();
        System.out.print("Enter your choice : ");
        int userChoice = scanner.nextInt();
        int userChoice2;
        int userChoice3;
        String bookName;
        String isbnNumber;
        switch (userChoice) {
            case 1 -> {
                System.out.println("Okay then ! Choose an option ," + "\n" + "1. Want to enter the book name ." + "\n" + "2.Want to enter the book ISBN number .");
                userChoice2 = scanner.nextInt();
                scanner.nextLine();
                switch (userChoice2) {
                    case 1 -> {
                        System.out.print("Enter the Book name : ");
                        bookName = scanner.nextLine();
                        System.out.println("Congratulations !" + '\'' + bookName + '\'' + " is issued to you.");
                    }
                    case 2 -> {
                        System.out.print(" Enter ISBN no. of the book : ");
                        isbnNumber = scanner.nextLine();
                        System.out.println("Congratulations ! The book having the " + '\'' +
                                isbnNumber + '\'' + " ISBN Number is issued to you.");
                    }
                    default -> System.out.println("invalid choice");

                }
                System.out.println();
                System.out.println("Thank you, for visiting");
            }
            case 2 -> {
                System.out.println("Okay then ! Choose an option ," + "\n" +
                        "1. Want to enter  the book name which is to be returned ." + "\n" +
                        "2.Want to enter the ISBN number of the book which is to be written.");
                userChoice3 = scanner.nextInt();
                scanner.nextLine();
                switch (userChoice3) {
                    case 1 -> {
                        System.out.print("Enter the Book name : ");
                        bookName = scanner.nextLine();
                        System.out.println("Congratulations !" + '\'' + bookName + '\'' + " is returned back.");
                    }
                    case 2 -> {
                        System.out.print(" Enter ISBN no. of the book : ");
                        isbnNumber = scanner.nextLine();
                        System.out.println("Congratulations ! The book having the " + '\'' + isbnNumber + '\'' + " ISBN Number is returned back.");
                    }
                    default -> System.out.println("Invalid choice.");

                }
                System.out.println();
                System.out.println("Thank you, for visiting !!");
            }
            case 3 -> {
                System.out.println("Number of books issued by " + student.getStudentFullName() + " : " + student.getNumberOfBooksIssuedByTheStudent());
                System.out.println("Name of all books issued by " + student.getStudentFullName() + " : " + Arrays.toString(student.getNameOfAllTheBooksIssuedByTheStudent()));
                System.out.println();
                System.out.println("Thank you, for visiting !!");
            }
            case 4 -> System.out.println("Thank you, for visiting.");
            default -> System.out.println("Invalid choice.");
        }
    }
}
