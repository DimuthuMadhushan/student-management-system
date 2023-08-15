
package com.iCet.StudentManagementSystem.db;
import com.iCet.StudentManagementSystem.model.Student;

public class StudentDB {
    private Student[] studentArray;

    public StudentDB() {
        studentArray=new Student[0];
    }
    public void extendArray(){
        Student []  tempArray=new Student[studentArray.length+1];
        for (int i = 0; i < studentArray.length; i++) {
            tempArray[i]=studentArray[i];
        }
        studentArray=tempArray;
    }
    
    public void add(Student student){
        extendArray();
        studentArray[studentArray.length-1]=student;
    }
    public int searchStudentId(String studentId){
        for (int i = 0; i < studentArray.length; i++) {
           if(studentArray[i].getStudentId().equals(studentId)){
               return i;
           } 
        }
        return -1;
    }
    public void delete(String studentId){
        int index =searchStudentId(studentId);
        if(index>=0){
            Student[] temp=new Student[studentArray.length-1];
            for (int i = 0; i < index; i++) {
                temp[i]=studentArray[i];
            }
            for (int i = index; i < studentArray.length-1; i++) {
                temp[i]=studentArray[i+1];
            }
            studentArray=temp;
        }    
    }
    public void update(String studentId,String studentName,double prfMarks,double dbmsMarks){
        int index=searchStudentId(studentId);
        if(index>=0 && index<studentArray.length){
            studentArray[index].setStudentName(studentName);
            studentArray[index].setPrfMarks(prfMarks);
            studentArray[index].setDbmsMarks(dbmsMarks);
        }
    }
    public Student[] getStudentArray(){
        return studentArray;
    }
    public Student getStudentObject(int index){
        return studentArray[index];
    }
    public Student getStudentObject(double prf){
        for (int i = 0; i < studentArray.length; i++) {
           if(studentArray[i].getPrfMarks()==prf){
               return studentArray[i];
           }
        } 
        return null;
    } 
    public Student getStudentObjectDbms(double dbms){
        for (int i = 0; i < studentArray.length; i++) {
           if(studentArray[i].getDbmsMarks()==dbms){
               return studentArray[i];
           }
        } 
        return null;
    } 
       
    public int getArrayIndex(Student student){
        for (int i = 0; i < studentArray.length; i++) {
            if(studentArray[i]==student){
                return i;
            }
        }
        return -1;
    }        
            
}
