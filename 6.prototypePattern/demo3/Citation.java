package org.example;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {

    private String name;

    private Student student;

    public void setStudent(Student student){
        this.student = student;
    }

    public Student getStudent(){
        return student;
    }



    public Citation clone() throws CloneNotSupportedException{
        return (Citation)super.clone();
    }
}
