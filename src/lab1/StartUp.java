/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Chad Cochrane
 */
public class StartUp {
    public static void main(String[] args) {
        ProgrammingCourses[] courses = {
            new AdvancedJavaCourse(), new IntroJavaCourse(), new IntroToProgrammingCourse()
        };
        //loop through array
        for(ProgrammingCourses pc : courses) {
            pc.setCourseName(null);
                    
        }
        
        
    }
    
}
