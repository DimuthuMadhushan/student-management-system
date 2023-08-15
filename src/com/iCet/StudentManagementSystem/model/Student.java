/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.StudentManagementSystem.model;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;
import java.util.Comparator;

/**
 *
 * @author dimut
 */
public class Student {
    private String studentId;
    private String studentName;
    private double prfMarks;
    private double dbmsMarks;
   
    
    

    public Student(String studentId, String studentName, double prfMarks, double dbmsMarks) {
        this.studentId=studentId;
        this.studentName=studentName;
        this.prfMarks=prfMarks;
        this.dbmsMarks=dbmsMarks;
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the prfMarks
     */
    public double getPrfMarks() {
        return prfMarks;
    }

    /**
     * @param prfMarks the prfMarks to set
     */
    public void setPrfMarks(double prfMarks) {
        this.prfMarks = prfMarks;
    }

    /**
     * @return the dbmsMarks
     */
    public double getDbmsMarks() {
        return dbmsMarks;
    }

    /**
     * @param dbmsMarks the dbmsMarks to set
     */
    public void setDbmsMarks(double dbmsMarks) {
        this.dbmsMarks = dbmsMarks;
    }
}

