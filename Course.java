
/**
 * The class Course is the parent class of two child classes namely Academic_Course and NonAcademic_Course
 * It consists of basic information regarding a particular course.
 *
 * @author (Subriti Aryal)
 * @version (11.0.2)
 */


public class Course
{
    //Four instance variables are created with appropriate datatypes: CourseID, Coursename, Duration and CourseLeader
    
    private String CourseID;
    private String Coursename;
    protected int Duration;
    private String CourseLeader;
    
    /* A constructor is created with 4 parameters: Course_ID, Course_name and duration
     * Constructors are responsible for assigning values to the instance variable
     * Here, the CourseLeader is initialized with an empty string*/
      
    Course(String Course_ID, String Course_name, int duration)
    {
        this.CourseID=Course_ID;
        this.Coursename=Course_name;
        this.Duration=duration;
        this.CourseLeader=" ";
    }
    
    //Accessor methods:  Used to get the initialised value
    
    public String getCourseID()
    {
        return CourseID;
     }
     
      public String getCoursename()
    {
        return Coursename;
    }
    
    public int getDuration()
    {
        return Duration;
    }
    
    public String getCourseLeader()
    {
        return CourseLeader;
    }
    
    //Mutator methods: Used to set some value in an instance variable (CourseLeader)
    
    public void setCourseLeader(String Course_leader)
    {
        this.CourseLeader= Course_leader;
    }
    
    //Display method: Used to display the information about the course.
    
    public void display()
    {
       System.out.println("Course ID is "+ CourseID);
       System.out.println("Course name is "+ Coursename);
       System.out.println("Course duration is "+ Duration +"years");
       
       if(CourseLeader!=" ")
       {
           System.out.println("Course leader is "+ CourseLeader);
        }
    }
}