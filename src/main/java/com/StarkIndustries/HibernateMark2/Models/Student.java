package com.StarkIndustries.HibernateMark2.Models;

import javax.persistence.*;

@Entity
@Table(name = "Student_Table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentID")
    private int sid;

    @Column(name = "StudentName",nullable = false)
    private String name;

    @Column(name = "StudentRollNo",nullable = false)
    private int rollNo;

    @Column(name = "StudentDepartment",nullable = false)
    private String department;

    @Column(name = "StudentEmail",nullable = false)
    private String email;

    public Student(int sid,String name,int rollNo,String department,String email){
        this.sid=sid;
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
        this.email=email;
    }

    public Student(String name,int rollNo,String department,String email){
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
        this.email=email;
    }

    public Student(){

    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
