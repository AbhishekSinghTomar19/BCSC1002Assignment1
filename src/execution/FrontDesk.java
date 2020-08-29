/*  Created by IntelliJ IDEA.
 *  User: Abhishek Singh Tomar (AbhishekSinghTomar19)
 *  Date: 24/08/20
 *  Time: 9:00 AM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

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
    }
}
