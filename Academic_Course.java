
/**
 * The class Academic_Course is a child class of the class "Course"
 * It consists of a detailed information regarding an academic course.
 * @author (Subriti Aryal)
 * @version (11.0.2)
 */


// Child class inherits the properties of its parent class "Course"

public class Academic_Course extends Course
{
    /* Seven instance variables are created with their appropriate datatypes: 
     * Lecturername, Level, Credit, StartingDate, CompletionDate, NumberOfAssignments and isRegistered */
    private String CourseID;
    private String Coursename;
    private int Duration;
    private String Lecturername;
    private String Level;
    private String Credit;
    private String StartingDate;
    private String CompletionDate;
    private int NumberOfAssessments;
    private boolean isRegistered;

    /*
     * A constructor is created with 6 parameters: CourseID, Coursename, Duration, level, credit and numberOfAssessments 
     * Constructors are responsible for assigning values to the instance variable
     * CourseID, Coursename and Duration are called from the superclass using the "super" keyword
     * While, the Lecturername,StartingDate and CompletionDate is initialized with an empty string 
     * and isRegistered status is initialized to false.
     */
    
    Academic_Course( String CourseID, String Coursename, int Duration, String level, String credit, int numberOfAssessments)
    {
        super(CourseID,Coursename,Duration);
        this.Level= level;                          
        this.Credit= credit;
        this.NumberOfAssessments= numberOfAssessments;
        this.Lecturername=" ";                         
        this.StartingDate= " ";
        this.CompletionDate=" ";
        this.isRegistered= false;
    }

    //Accessor method: Used to get the initialised value

    public String getLecturername()
    {
        return Lecturername;
    }

    public String getLevel()
    {
        return Level;
    }

    public String getCredit()
    {
        return Credit;
    }

    public String getStartingDate()
    {
        return StartingDate;
    }

    public String getCompletionDate()
    {
        return CompletionDate;
    }

    public int getNumberofAssessments()
    {
        return NumberOfAssessments;
    }

    public boolean getisRegistered()
    {
        return isRegistered;
    }

    //Mutator methods: Used to set some value in an instance variable (Lecturername and NumberOfAssessments)

    public void setLecturername(String Lecturer_name)
    {
        this.Lecturername= Lecturer_name;
    }

    public void setNumberOfAssessments(int numberOfAssessments)
    {
        this.NumberOfAssessments= numberOfAssessments;
    }

    
    /* Register method: Used to register a particular academic course
         It accepts 4 parameters: Course_leader, Lecturer_name, Starting_date and Completion_date */
    
    public void setRegister(String Course_leader, String Lecturer_name, String Starting_date, String Completion_date)
    {
        //Condition to be processed if the course is already registered
        
        if(isRegistered== true)
        {
            System.out.println("Lecturer name is "+ Lecturername);
            System.out.println("Starting Date is "+ StartingDate);
            System.out.println("Completion Date is "+ CompletionDate);
        }
        
        //Condition to be processed if the course is not registered
        else
        {
            super.setCourseLeader(Course_leader);     //method to set the Courseleader; which is called from the parent class 
            this.Lecturername=Lecturer_name;              //initialising values
            this.StartingDate=Starting_date;
            this.CompletionDate=Completion_date;
            isRegistered= true;                      //default initialisation was false when there was no any course registered
        } 
    }
    
    //Display method: Used to display the information about any registered course.
    
    public void display()
    {
        //Display method called from the superclass "Course"
        super.display();
                
        if(isRegistered==true)
        {
            System.out.println("Lecturer name is "+ Lecturername);    
            System.out.println("Level is "+ Level);
            System.out.println("Credit is "+ Credit);
            System.out.println("Starting Date is "+ StartingDate);
            System.out.println("Completion Date is "+ CompletionDate);
            System.out.println("Number of Assessments is "+ NumberOfAssessments);
        }
    }
}