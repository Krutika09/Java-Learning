package com.database.student_demo.model;

public class StudentDatabase
{
  // Element of StudentDatabase class, These are instance variables. private is used for data safety
    private String studentId;
    private String studentName;
    private String studentAddress;
    private String studentPhoneNumber;

    public String getStudentId() { // Used to read data, Returns the value of the variable
        return studentId;
    }

    public void setStudentId(String studentId) { // Used to set or update data
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }



    public StudentDatabase(){ // Creates an empty object, Required by Spring Boot for JSON conversion, Default constructor is needed for object creation by Spring.
    } 

    public StudentDatabase(String studentId, String studentName, String studentPhoneNumber, String studentAddress){
      // Parameterized constructor is used when we want to create and set student data directly in the code.
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentPhoneNumber = studentPhoneNumber;

    }

}
