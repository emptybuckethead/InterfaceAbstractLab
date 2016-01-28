package lab2;

import lab1.*;
import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author Chad Cochrane
 */
public class IntroToProgrammingCourse implements ProgrammingCourses {
    private String courseName;

    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() < 2){
            System.out.println("course name cannot be less than 2");
        }else{
            this.courseName = courseName;
        }
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        
    }

    @Override
    public void setCredits(double credits) {
        
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        
    }

    public String getCourseName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCourseNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getCredits() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPrerequisites() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
