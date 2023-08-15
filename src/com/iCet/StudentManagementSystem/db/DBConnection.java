/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.StudentManagementSystem.db;

import com.iCet.StudentManagementSystem.model.Student;
import java.util.Comparator;

/**
 *
 * @author dimut
 */
public class DBConnection {
    private StudentDB studentDB;
    private static DBConnection dbConnection;
    private DBConnection(){
        studentDB=new StudentDB();
    }
    public static DBConnection getInstance(){
        if(dbConnection==null){
               dbConnection=new DBConnection();
        }
        return dbConnection;
    }
    public StudentDB getStudentDb(){
        return studentDB;
    }
    
}
