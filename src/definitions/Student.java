/*  Created by IntelliJ IDEA.
 *  User: Abhishek Singh Tomar (AbhishekSinghTomar19)
 *  Date: 24/08/20
 *  Time: 9:00 AM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String studentFirstName;
    private String studentMiddleName;
    private String studentLastName;
    private String studentFullName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByTheStudent;
    private Book[] nameOfAllTheBooksIssuedByTheStudent;

    public Student(String studentFirstName, String studentMiddleName, String studentLastName, long studentUniversityRollNumber) {
        studentFullName = studentFirstName + " " + studentMiddleName + " " + studentLastName;
        this.studentFullName = studentFullName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMiddleName() {
        return studentMiddleName;
    }

    public void setStudentMiddleName(String studentMiddleName) {
        this.studentMiddleName = studentMiddleName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getNumberOfBooksIssuedByTheStudent() {
        return numberOfBooksIssuedByTheStudent;
    }

    public void setNumberOfBooksIssuedByTheStudent(int numberOfBooksIssuedByTheStudent) {
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public Book[] getNameOfAllTheBooksIssuedByTheStudent() {
        return nameOfAllTheBooksIssuedByTheStudent;
    }

    public void setNameOfAllTheBooksIssuedByTheStudent(Book[] nameOfAllTheBooksIssuedByTheStudent) {
        this.nameOfAllTheBooksIssuedByTheStudent = nameOfAllTheBooksIssuedByTheStudent;
    }
}