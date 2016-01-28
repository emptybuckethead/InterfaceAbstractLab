package lab1;

/**
 * Describe responsibilities here.
 * This Class is Responsible for:
 * 
 * @author Chad Cochrane
 */
public class IntroJavaCourse extends ProgrammingCourses {
   private String courseName;
    
    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.isEmpty()){
            System.out.println("course name cannot be null");
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

}
