package Models;

import java.util.Date;

public class Employees {

    private long empNo;
    private Date birthDate;

    private String firstName;
    private String lastName;
    private char gender;
    private Date hireDate;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender(String male) {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Employees(){}

    public long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(long EmpNo) {
        this.empNo = EmpNo;
    }
}
