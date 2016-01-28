/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Chad Cochrane
 */
public interface ProgrammingCourses {
   
    //all "public abstract" can be removed, net beans treats it that way
    
    public abstract String getCourseName(); 

    public abstract void setCourseName(String courseName); 

    public abstract String getCourseNumber(); 

    public abstract void setCourseNumber(String courseNumber);

    public abstract double getCredits(); 
    
    public abstract void setCredits(double credits);

    public abstract String getPrerequisites(); 

    public abstract void setPrerequisites(String prerequisites);
}
    
    
    
    

