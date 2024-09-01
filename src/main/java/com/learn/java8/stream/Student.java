package com.learn.java8.stream;

import java.util.Objects;

public class Student {
    private String stNo;
    private String stName;
    private int stAge;

    public Student(String stNo, String stName, int stAge) {
        this.stNo = stNo;
        this.stName = stName;
        this.stAge = stAge;
    }

    public void setStNo(String stNo) {
        this.stNo = stNo;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public void setStAge(int stAge) {
        this.stAge = stAge;
    }

    public String getStNo() {
        return stNo;
    }

    public String getStName() {
        return stName;
    }

    public int getStAge() {
        return stAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stAge == student.stAge && Objects.equals(stNo, student.stNo) && Objects.equals(stName, student.stName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stNo, stName, stAge);
    }
}
