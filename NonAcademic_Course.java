
/**
 * The class NonAcademic_Course is a child class of the class "Course"
 * It consists of a detailed information regarding a non-academic course.
 * @author (Subriti Aryal)
 * @version (11.0.2)
 */

// Child class inherits the properties of its parent class "Course"

public class NonAcademic_Course extends Course
{
    /* Seven instance variables are created with their appropriate datatypes: 
     * Instructorname, StartDate, CompletionDate, ExamDate, Prerequisite, isRegistered and isRemoved */
    
    private String Instructorname;
    private String StartDate;
    private String CompletionDate;
    private String ExamDate;
    private String Prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    /*
     * A constructor is created with 4 parameters: CourseID, Coursename, Duration and prerequisite 
     * Constructors are responsible for assigning values to the instance variable
     * CourseID, Coursename and Duration are called from the superclass using the "super" keyword
     * Here, the StartDate, CompletionDate and ExamDate is initialized with an empty string 
     * isRegistered and isRemoved status is initialized to false.
     */
    
    NonAcademic_Course(String CourseID, String Coursename, int Duration, String prerequisite)
    {
        super(CourseID, Coursename, Duration);
        this.Prerequisite= prerequisite;
        this.StartDate= " ";
        this.CompletionDate= " ";
        this.ExamDate= " ";
        this.isRegistered= false;
        this.isRemoved= false;
        
    }
    
    //Accessor method: Used to get the initialised value
    
    public String getInstructorname()
    {
        return Instructorname;
    }
    
    public String getStartDate()
    {
        return StartDate;
    }
    
    public String getCompletionDate()
    {
        return CompletionDate;
    }
    
    public String getExamDate()
    {
        return ExamDate;
    }
    
    public String getPrerequisite()
    {
        return Prerequisite;
    }
    
    public Boolean getisRegistered()
    {
        return isRegistered;
    }
    
    public Boolean getisRemoved()
    {
        return isRemoved;
    }

    //Mutator methods: Used to set some value in an instance variable (Instructorname)
    
    public void setInstructorname( String Instructor_name)
    {
        if (isRegistered== true)
        {
            System.out.println("Changing of instructor's name is not possible");  
        }
        else
        {
             this.Instructorname=Instructor_name;
        } 
    }
    
    
    //Register method: Used to register a particular non-academic course
            // It accepts 5 parameters: CourseLeader, Instructor_name, Start_date, Completion_date and Exam_Date
            
    public void setRegister(String Course_leader, String Instructor_name, String Start_Date, String Completion_Date, String Exam_Date)
    {
        //Condition to be processed if the course is already registered
        
        if(isRegistered== true)
        {
            System.out.println("The Course is already registered");
        }
        
        //Condition to be processed if the course is not registered
        else
        {
            setInstructorname(Instructor_name); 
            super.setCourseLeader(Course_leader);  //method to set the CourseLeader; which is called from the parent class
            this.StartDate= Start_Date;
            this.CompletionDate=Completion_Date;
            this.ExamDate=Exam_Date;
            isRegistered= true;
        }
    }
    
    
    //Remove method: Used to remove a particular non-academic course
    
    public void Remove()
    {
        if(isRemoved== true)
        {
            System.out.println("The course is already removed");
        }
        else
        {
            super.setCourseLeader(" ");                //method to set the CourseLeader; which is called from the parent class
            this.Instructorname= " ";
            this.StartDate= " ";
            this.CompletionDate= " ";
            this.ExamDate= " ";
            this.isRegistered= false;
            this.isRemoved= true;  
        }
    }
    
    //Display method: Used to display the information about any registered course.
    
    public void display()
    {
        //Display method called from the superclass "Course"
        super.display();
        
        if( isRegistered== true)
        {
            System.out.println("Instructor name is "+ Instructorname);
            System.out.println("Starting date is "+ StartDate);
            System.out.println("Completion Date is "+ CompletionDate);
            System.out.println("Exam date is "+ ExamDate);
        }
        else
        {
            System.out.println("There is no registrations for NonAcademic Courses");
        }
    }
}
