package com.pee.mvc.model;


import com.pee.mvc.anotation.FacultyCodeAnotation;

import javax.validation.constraints.*;
import java.util.LinkedHashMap;

public class CustomerM {


    @NotNull(message = "is required")
    @Size(min = 1, message = "not null")
    private String firstName;

    private String lastName;

    private LinkedHashMap<String, Integer> ages;
    @NotNull
    @Size(min = 5, message = "password must be more then 5")
    @Pattern(regexp = "^[a-zA-Z0-9]{8}", message = "only 8 char")
    private String password;

    @NotNull
    @Min(value = 5, message = "age must be more then five")
    @Max(value = 50, message = "age must be less then fifty")
    private int age;


    public String getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }

//    @FacultyCodeAnotation(value = "TOP",message = "must be start with TOP")
    private String facultyCode;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CustomerM() {
        ages = new LinkedHashMap<>();
        for (int i = 0; i < 90; i++) {
            ages.put(i + "", i);
        }
    }


    public LinkedHashMap<String, Integer> getAges() {
        return ages;
    }

    public void setAges(LinkedHashMap<String, Integer> ages) {
        this.ages = ages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return "CustomerM{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", facultyCode='" + facultyCode + '\'' +
                '}';
    }

}
