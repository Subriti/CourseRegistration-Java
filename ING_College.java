import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;
/**
 * Class ING_College consists of a GUI to input details about the Academic or a NonAcademic type of Course.
 *
 * @author (Subriti Aryal)
 * @version (5.0.1)
 */
public class ING_College implements ActionListener
{
    // Instance Variable for Frame
    private JFrame frame;
    
    //Instance Variable for Panels
    private JPanel main_panel,add_panel,register_panel,add1_panel,register1_panel;
    
    //Instance Variable for JLabels of Academic Course
    private JLabel label,id_label,name_label,duration_label,level_label,credit_label,assessment_label,assessment1_label,
    lecturer_label,leader_label,start_label,end_label;

    //Instance Variables for JTextFields of Academic Course
    private JTextField id_field,name_field,duration_field,level_field,credit_field,assessment_field,
    lecturer_field,leader_field;
    
    //Instance Variables for JComboBox of Academic Course
    private JComboBox year_combo,month_combo,day_combo,years_combo,months_combo,days_combo;
    
    //Instance Variable for JLabels of NonAcademic Course
    private JLabel id_label1,name_label1,duration_label1,pre_label,lecturer_label1,leader_label1,start_label1,end_label1,exam_label;
    
    //Instance Variables for JTextFields of NonAcademic Course
    private JTextField id_field1,name_field1,duration_field1,pre_field,lecturer_field1,leader_field1;
    
    //Instance Variables for JComboBox of NonAcademic Course
    private JComboBox startyear_combo,startmonth_combo,startday_combo,endyear_combo,endmonth_combo,endday_combo,examyear_combo,exammonth_combo,examday_combo;
    
    //Instance Variable for Buttons of Academic Course
    private JButton add_button,register_button,clear_button, nonacademic_button,display_button;
    //Instance Variable for Buttons of NonAcademic Course
    private JButton add1_button,register1_button,clear1_button,remove_button,academic_button;
    
    //objects
    private Academic_Course object_academic;
    private NonAcademic_Course object_nonacademic;
    
    //declaration of arraylist
    private ArrayList<Course> alist= new ArrayList<Course>();     
    
    public void GUI()
    {
        frame=new JFrame("Course Registration");
        
        //Jmain_panel
        main_panel= new JPanel();
        main_panel.setLayout(null); 
        
        //setting color using rgb
        Color main_color= new Color(213,214,234);
        main_panel.setBackground(main_color);
        
        //adding border to the fram
        Border border= BorderFactory.createLineBorder(Color.WHITE,6);
        main_panel.setBorder(border);
        
        //panel to add academic course
        add_panel= new JPanel();
        Color add_color= new Color(245,213,203);
        add_panel.setBackground(add_color);
        add_panel.setBounds(15,70,305,300);
        add_panel.setLayout(null);
        main_panel.add(add_panel);
        
        //panel to register academic course
        register_panel= new JPanel();
        Color register_color= new Color(215,236,217);
        register_panel.setBackground(register_color);
        register_panel.setBounds(340,110,305,205);
        register_panel.setLayout(null);
        main_panel.add(register_panel);
        
        //panel to add nonacademic course
        add1_panel= new JPanel();
        add1_panel.setBackground(add_color);
        add1_panel.setBounds(15,70,305,210);
        add1_panel.setLayout(null);
        main_panel.add(add1_panel);
        
        //panel to register nonacademic course
        register1_panel= new JPanel();
        register1_panel.setBackground(register_color);
        register1_panel.setBounds(340,110,305,250);
        register1_panel.setLayout(null);
        main_panel.add(register1_panel);
    
        //for text "academic course"
        label= new JLabel("Academic Course");
        label.setBounds(250,20,400,25);
        label.setForeground(Color.blue);
    
        //for font
        Font ff= new Font("Times New Roman",Font.BOLD,23);
        label.setFont(ff);

        //adding label to main_panel
        main_panel.add(label);
        
        //jlabel- Course ID
        id_label= new JLabel("Course ID :");
        id_label.setBounds(0,10,400,25);
        add_panel.add(id_label);
        
        //jtextfield for Course id
        id_field= new JTextField();
        id_field.setBounds(100,5,130,30);
        add_panel.add(id_field);
        
        //jLabel- "Course Name"
        name_label= new JLabel("Course Name :");
        name_label.setBounds(0,50,120,20);
        add_panel.add(name_label);
        
        //jtextfield for Course name
        name_field= new JTextField();
        name_field.setBounds(100,45,200,30);
        add_panel.add(name_field);
        
        //jLabel- "Duration"
        duration_label= new JLabel("Duration :");
        duration_label.setBounds(0,90,120,20);
        add_panel.add(duration_label);
        
        //jtextfield for duration
        duration_field= new JTextField();
        duration_field.setBounds(100,85,200,30);
        add_panel.add(duration_field);
        
        //jLabel- "level"
        level_label= new JLabel("Level :");
        level_label.setBounds(0,130,120,20);
        add_panel.add(level_label);
        
        //jtextfield for level
        level_field= new JTextField();
        level_field.setBounds(100,125,200,30);
        add_panel.add(level_field);        

        
        //jLabel- "credit"
        credit_label= new JLabel("Credit :");
        credit_label.setBounds(0,170,120,20);
        add_panel.add(credit_label);
        
        //jtextfield for credit
        credit_field= new JTextField();
        credit_field.setBounds(100,165,200,30);
        add_panel.add(credit_field); 
        
        //jLabel- "number of assessment"
        assessment_label= new JLabel("No. of ");
        assessment_label.setBounds(0,205,120,20);
        add_panel.add(assessment_label);
        assessment1_label= new JLabel("Assessments :");
        assessment1_label.setBounds(0,215,120,20);
        add_panel.add(assessment1_label);
        
        //jtextfield for assessment
        assessment_field= new JTextField();
        assessment_field.setBounds(100,205,200,30);
        add_panel.add(assessment_field); 
        
        //Add Course Button for academic course
        add_button= new JButton("Add Course");
        add_button.setBounds(100,260,150,30);
        add_button.addActionListener(this);
        add_panel.add(add_button);
        
        //Remove button for non academic course
        remove_button= new JButton("Remove Course");
        remove_button.setBounds(120,350,150,30);
        remove_button.addActionListener(this);
        main_panel.add(remove_button);              //adding this to main panel
        
        //display Button
        display_button= new JButton("Display");
        display_button.setBounds(80,400,100,30);
        display_button.addActionListener(this);
        main_panel.add(display_button);             //adding to main panel
        
        //clear Button for academic course
        clear_button= new JButton("Clear");
        clear_button.setBounds(200,400,100,30);
        clear_button.addActionListener(this);
        main_panel.add(clear_button);               //adding to main panel
        
        //clear1 Button for non academic course
        clear1_button= new JButton("Clear");
        clear1_button.setBounds(200,400,100,30);
        clear1_button.addActionListener(this);
        main_panel.add(clear1_button);
        
        //jLabel- "Lecturer's name"
        lecturer_label= new JLabel("Lecturer Name :");
        lecturer_label.setBounds(0,10,200,20);
        register_panel.add(lecturer_label);
        
        //jtextfield for lecturer name
        lecturer_field= new JTextField();
        lecturer_field.setBounds(100,5,200,30);
        register_panel.add(lecturer_field);
        
        //jLabel- "course leader"
        leader_label= new JLabel("Course Leader :");
        leader_label.setBounds(0,50,200,20);
        register_panel.add(leader_label);
        
        //jtextfield for course leader
        leader_field= new JTextField();
        leader_field.setBounds(100,45,200,30);
        register_panel.add(leader_field);
        
        //jLabel- "start date"
        start_label= new JLabel("Start Date :");
        start_label.setBounds(0,90,200,20);
        register_panel.add(start_label);
              
        //JComboBox for startdate
        String[]months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[]years={"2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        String[]days={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        year_combo=new JComboBox(years);
        month_combo=new JComboBox(months);
        day_combo=new JComboBox(days);
        year_combo.setBounds(100,90,60,20);
        month_combo.setBounds(162,90,80,20);
        day_combo.setBounds(244,90,40,20);
        register_panel.add(year_combo);
        register_panel.add(month_combo);
        register_panel.add(day_combo);
        
        //jLabel- "end date"
        end_label= new JLabel("End Date :");
        end_label.setBounds(0,130,200,20);
        register_panel.add(end_label);
              
        //JComboBox for enddate
        years_combo=new JComboBox(years);
        months_combo=new JComboBox(months);
        days_combo=new JComboBox(days);
        years_combo.setBounds(100,130,60,20);
        months_combo.setBounds(162,130,80,20);
        days_combo.setBounds(244,130,40,20);
        register_panel.add(years_combo);
        register_panel.add(months_combo);
        register_panel.add(days_combo);
        
        //jbutton for registering non academic course
        register_button= new JButton("Register Course");
        register_button.setBounds(90,170,150,30);
        register_button.addActionListener(this);
        register_panel.add(register_button);
        
        //jbutton for nonacademic. -> for switching to another panel
        nonacademic_button= new JButton("Register for Non-Academic Course");
        nonacademic_button.setBounds(400,400,250,30);
        nonacademic_button.addActionListener(this);
        main_panel.add(nonacademic_button);
        
        //for non academic panel
        
        //jlabel- Course ID
        id_label1= new JLabel("Course ID :");
        id_label1.setBounds(0,10,400,25);
        add1_panel.add(id_label1);
        
        //jtextfield for Course id
        id_field1= new JTextField();
        id_field1.setBounds(100,5,130,30);
        add1_panel.add(id_field1);
        
        //jLabel- "Course Name"
        name_label1= new JLabel("Course Name :");
        name_label1.setBounds(0,50,120,20);
        add1_panel.add(name_label1);
        
        //jtextfield for Course name
        name_field1= new JTextField();
        name_field1.setBounds(100,45,200,30);
        add1_panel.add(name_field1);
        
        //jLabel- "Duration"
        duration_label1= new JLabel("Duration :");
        duration_label1.setBounds(0,90,120,20);
        add1_panel.add(duration_label1);
        
        //jtextfield for duration
        duration_field1= new JTextField();
        duration_field1.setBounds(100,85,200,30);
        add1_panel.add(duration_field1);
        
        //jLabel- "prerequisite"
        pre_label= new JLabel("Prerequisite :");
        pre_label.setBounds(0,130,120,20);
        add1_panel.add(pre_label);
        
        //jtextfield for prerequisite
        pre_field= new JTextField();
        pre_field.setBounds(100,125,200,30);
        add1_panel.add(pre_field); 
        
        //Add Course Button for Non academic course
        add1_button= new JButton("Add Course");
        add1_button.setBounds(100,180,150,30);
        add1_button.addActionListener(this);
        add1_panel.add(add1_button);
        
        //jLabel- "instructor's name"
        lecturer_label1= new JLabel("Instructor Name :");
        lecturer_label1.setBounds(0,10,200,20);
        register1_panel.add(lecturer_label1);
        
        //jtextfield for instructor name
        lecturer_field1= new JTextField();
        lecturer_field1.setBounds(100,5,200,30);
        register1_panel.add(lecturer_field1);
        
        //jLabel- "course leader"
        leader_label1= new JLabel("Course Leader :");
        leader_label1.setBounds(0,50,200,20);
        register1_panel.add(leader_label1);
        
        //jtextfield for course leader
        leader_field1= new JTextField();
        leader_field1.setBounds(100,45,200,30);
        register1_panel.add(leader_field1);
        
        //jLabel- "start date"
        start_label1= new JLabel("Start Date :");
        start_label1.setBounds(0,90,200,20);
        register1_panel.add(start_label1);
              
        //JComboBox for startdate
        startyear_combo=new JComboBox(years);
        startmonth_combo=new JComboBox(months);
        startday_combo=new JComboBox(days);
        startyear_combo.setBounds(100,90,60,20);
        startmonth_combo.setBounds(162,90,80,20);
        startday_combo.setBounds(244,90,40,20);
        register1_panel.add(startyear_combo);
        register1_panel.add(startmonth_combo);
        register1_panel.add(startday_combo);
        
        //jLabel- "end date"
        end_label1= new JLabel("End Date :");
        end_label1.setBounds(0,130,200,20);
        register1_panel.add(end_label1);
              
        //JComboBox for enddate
        endyear_combo=new JComboBox(years);
        endmonth_combo=new JComboBox(months);
        endday_combo=new JComboBox(days);
        endyear_combo.setBounds(100,130,60,20);
        endmonth_combo.setBounds(162,130,80,20);
        endday_combo.setBounds(244,130,40,20);
        register1_panel.add(endyear_combo);
        register1_panel.add(endmonth_combo);
        register1_panel.add(endday_combo);

        //jLabel- "exam date"
        exam_label= new JLabel("Exam Date :");
        exam_label.setBounds(0,170,200,20);
        register1_panel.add(exam_label);
              
        //JComboBox for examdate
        examyear_combo=new JComboBox(years);
        exammonth_combo=new JComboBox(months);
        examday_combo=new JComboBox(days);
        examyear_combo.setBounds(100,170,60,20);
        exammonth_combo.setBounds(162,170,80,20);
        examday_combo.setBounds(244,170,40,20);
        register1_panel.add(examyear_combo);
        register1_panel.add(exammonth_combo);
        register1_panel.add(examday_combo);

        //jbutton for register1 -> non academic register button
        register1_button= new JButton("Register Course");
        register1_button.setBounds(90,220,150,30);
        register1_button.addActionListener(this);
        register1_panel.add(register1_button);
        
        //jbutton for academic -> switches to Academic Course panel
        academic_button= new JButton("Register for Academic Course");
        academic_button.setBounds(400,400,250,30);
        academic_button.addActionListener(this);
        main_panel.add(academic_button);
        
        //adding main_panel to frame
        frame.add(main_panel);
        
        // true for the Academic course panels
        add_panel.setVisible(true);
        register_panel.setVisible(true);
        nonacademic_button.setVisible(true); //button to switch to Non-Academic
        clear_button.setVisible(true);
        
        //false for the Non Academic course panels
        add1_panel.setVisible(false);
        register1_panel.setVisible(false);
        
        remove_button.setVisible(false);
        clear1_button.setVisible(false);
        academic_button.setVisible(false);  //button to switch back to Academic
        
        //Setting bounds, resizability and visibility of frame
        frame.setBounds(300,100,700,500); 
        frame.setResizable(false);
        frame.setVisible(true);  
    }
    
    //Main Method
    public static void main(String[]args)
    {
        ING_College ing= new ING_College();
        ing.GUI();
    }
    
    //Getters method for fields in Academic_Course
    
    //Getters method for CourseID's field
    public String getCourseID()
    {
        return this.id_field.getText();
    }
    //Getters method for CourseName's field
    public String getCourseName()
    {       
        return this.name_field.getText();
    }
    //Getters method for Duration's field
    public int getDuration()
    { 
        return Integer.parseInt(this.duration_field.getText());
    }
    //Getters method for Level's field
    public String getLevel()
    {
        return this.level_field.getText();
    }
    //Getters method for Credit's field
    public String getCredit()
    {
        return this.credit_field.getText();
    }
    //Getters method for NumberOfAssessments's field
    public int getNumberOfAssessments()
    {
        return Integer.parseInt(this.assessment_field.getText());
    }
    //Getters method for Courseleader's field
    public String getCourse_leader()
    {
        return this.leader_field.getText();
    }
    //Getters method for Lecturername's field
    public String getLecturer_name()
    {
        return this.lecturer_field.getText();
    }
    //Getters method for StartingDate's combobox
    public String getStartingDate()
    {
        String year=(year_combo.getSelectedItem()).toString();
        String month= (month_combo.getSelectedItem()).toString();
        String day=(day_combo.getSelectedItem()).toString();
        return (year+""+month+""+day);
    }
    //Getters method for CompletionDate's combobox
    public String getCompletionDate()
    {
        String years=(years_combo.getSelectedItem()).toString();
        String months= (months_combo.getSelectedItem()).toString();
        String days=(days_combo.getSelectedItem()).toString();
        return (years+""+months+""+days);
    }
    
    //Getters method for fields in NonAcademic_Course
    //Getters method for CourseID's field
    public String getCourseID1()
    {
        return this.id_field1.getText();
    }
    //Getters method for CourseName's field
    public String getCourseName1()
    {       
        return this.name_field1.getText();
    }
    //Getters method for Duration's field
    public int getDuration1()
    { 
        return Integer.parseInt(this.duration_field1.getText());
    }
    //Getters method for Prerequisite's field
    public String getPrerequisite()
    {
        return this.pre_field.getText();
    }
    //Getters method for Courseleader's field
    public String getCourse_leader1()
    {
        return this.leader_field1.getText();
    }
    //Getters method for Lecturername's field
    public String getLecturer_name1()
    {
        return this.lecturer_field1.getText();
    }
    //Getters method for StartingDate's combobox
    public String getStartingDate1()
    {
        String startyear=(startyear_combo.getSelectedItem()).toString();
        String startmonth= (startmonth_combo.getSelectedItem()).toString();
        String startday=(startday_combo.getSelectedItem()).toString();
        return (startyear+startmonth+startday);
    }
    //Getters method for CompletionDate's combobox
    public String getCompletionDate1()
    {
        String endyear=(endyear_combo.getSelectedItem()).toString();
        String endmonth= (endmonth_combo.getSelectedItem()).toString();
        String endday=(endday_combo.getSelectedItem()).toString();
        return (endyear+endmonth+endday);
    }
    //Getters method for ExamDate's combobox
    public String getExamDate()
    {
        String examyear=(examyear_combo.getSelectedItem()).toString();
        String exammonth= (exammonth_combo.getSelectedItem()).toString();
        String examday=(examday_combo.getSelectedItem()).toString();
        return (examyear+exammonth+examday);
    }
    
    //Method where the functionalities of the buttons are specified
    public void actionPerformed(ActionEvent e)
    {
        /*The functionality for the button named "Register for Non-Academic Course"
        All the specified changes would take place on the press of this button 
        The text or the heading of the form would change, likewise the buttons and 
        panels would be adjusted accordingly*/
        
        if(e.getSource() == nonacademic_button)
        {
            add1_panel.setVisible(true);
            register1_panel.setVisible(true);
            
            label.setText("Non-Academic Course");
            remove_button.setVisible(true);
            academic_button.setVisible(true);
            clear_button.setVisible(false);
            clear1_button.setVisible(true);
            nonacademic_button.setVisible(false);
            
            add_panel.setVisible(false);
            register_panel.setVisible(false);
        }
        
        /*The functionality for the button named "Register for Academic Course"
        All the specified changes would take place on the press of this button
        The text or the heading of the form would change, likewise the buttons and 
        panels would be adjusted accordingly */
        
        else if(e.getSource() == academic_button)
        {
            add_panel.setVisible(true);
            register_panel.setVisible(true);
            
            label.setText("Academic Course");
            remove_button.setVisible(false);
            nonacademic_button.setVisible(true);
            academic_button.setVisible(false);
            clear_button.setVisible(true);
            clear1_button.setVisible(false);
            
            add1_panel.setVisible(false);
            register1_panel.setVisible(false);
        }
        
        /* The function for the button Add is to get the input and 
         * create a new object of Academic_Course type and later 
         * add the object to an arraylist of Course class*/
         
        //For "Add Course" of Academic Course
        
        else if(e.getSource() == add_button)
        {  
            boolean academic_add=false;
            int ct = 0;
            for (Course course: alist)
            {
                if(course.getCourseID().equals(getCourseID()))
                {
                    academic_add=true;
                    break;
                }
            }
            if (getCourseID().isEmpty() || getCourseName().isEmpty() || getLevel().isEmpty() || getCredit().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please fill in all the fields correctly","Error", JOptionPane.WARNING_MESSAGE);
                ct = 1;
            }
            if (ct == 0)
            {
                try
                {
                    getDuration();
                    try
                    {
                        getNumberOfAssessments();
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(frame,"Enter a number in the text field of No. of assessments","Alert",JOptionPane.WARNING_MESSAGE);
                        ct = 1;
                    }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame,"Enter a number in the text field of duration","Alert",JOptionPane.WARNING_MESSAGE);
                    ct = 1;
                }
            }
            if (academic_add==true)
            { 
                JOptionPane.showMessageDialog(frame,"The Course having Course ID : " + getCourseID() + " is already added", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (ct == 0)
            { 
                //Calling the constructor of Academic Course class
                object_academic= new Academic_Course(getCourseID(),getCourseName(),getDuration(),getLevel(),getCredit(),getNumberOfAssessments());
                alist.add(object_academic);
                JOptionPane.showMessageDialog(frame,"Successfully added to ArrayList ! \n\n Course ID: " +getCourseID() + "\n Course Name: " + getCourseName() + "\n Duration: " + getDuration() + "\n Level: " +getLevel() + "\n Credit: " + getCredit() + "\n Number of Assessments: " + getNumberOfAssessments());
            }
        }
        
        /* The function for the button Add is to get the input and 
         * create a new object of NonAcademic_Course type and later 
         * add the object to an arraylist of Course class*/
        
        //For "Add Course" of NonAcademic Course
        
        else if(e.getSource() == add1_button)
        {
            boolean nonacademic_add=false;
            int ct = 0;
            for (Course course: alist)
            {
                if(course.getCourseID().equals(getCourseID1()))
                {
                    nonacademic_add=true;
                    break;
                }
            }
            if (getCourseID1().isEmpty() || getCourseName1().isEmpty() || getPrerequisite().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please fill in all the fields correctly","Error", JOptionPane.WARNING_MESSAGE);
                ct = 1;
            }
            if (ct == 0)
            {
                try
                {
                    getDuration1();
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame,"Enter a number in the text field of duration","Alert",JOptionPane.WARNING_MESSAGE);
                    ct = 1;
                }
            }
            if(nonacademic_add==true)
            {
                JOptionPane.showMessageDialog(frame,"The Course having Course ID : " + getCourseID1() + " is already added", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(ct == 0)
            {
                //Calling the constructor of NonAcademic Course class
                object_nonacademic= new NonAcademic_Course(getCourseID1(),getCourseName1(),getDuration1(),getPrerequisite());
                alist.add(object_nonacademic);
                JOptionPane.showMessageDialog(frame,"Successfully added to ArrayList ! \n\n Course ID: " +getCourseID1() + "\n Course Name: " + getCourseName1() + "\n Duration: " + getDuration1() + "\n Prerequisite: " +getPrerequisite()); 
            }
        }
        
        /* The function for the button Register is to get the input value of CourseID
         * and compare with existing Course ID and if found valid, registers academic course
         * this is done by calling the method to register from the Academic_Course class */
       
        
        //For "Register Course" of Academic Course
              
        else if(e.getSource() == register_button)
        {
            boolean counter=false;
            int c=0;
            if (getCourseID().isEmpty() || getCourse_leader().isEmpty() || getLecturer_name().isEmpty() || getStartingDate().isEmpty() || getCompletionDate().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please fill in all the fields correctly","Error", JOptionPane.WARNING_MESSAGE);
                counter=true;
            }
            if (counter==false)
            {
                for (Course course: alist)
                {
                    if (course instanceof Academic_Course)
                    {
                        c = 1;
                        if(course.getCourseID().equals(getCourseID()))
                        {
                            object_academic= (Academic_Course)course;
                            c = 2;
                            if(object_academic.getisRegistered()==true)
                            {
                                JOptionPane.showMessageDialog(frame,"The Course is already registered ! \n\n Lecturer Name: "+ getLecturer_name() + "\n Start Date: " +getStartingDate() + "\n End Date: " + getCompletionDate());
                                break;
                            }
                            else if(object_academic.getisRegistered()==false)
                            {
                                object_academic.setRegister(getCourse_leader(), getLecturer_name(), getStartingDate(), getCompletionDate());
                                JOptionPane.showMessageDialog(frame,"Successfully registered the course! \n\n Course ID: " + getCourseID() + "\n Lecturer Name: "+ getLecturer_name() + "\n Start Date: " +getStartingDate() + "\n End Date: " + getCompletionDate());
                                break;
                            }
                        }
                    }
                }
                if(c == 1)
                {
                    JOptionPane.showMessageDialog(frame, "Please fill in the CourseID correctly","Error", JOptionPane.ERROR_MESSAGE);
                                
                }
                else if (c == 0)
                {
                    JOptionPane.showMessageDialog(frame, "No Academic Course has been added yet.","Error", JOptionPane.ERROR_MESSAGE); 
                    
                }
            }
        }
        
         /* The function for the button Register is to get the input value of CourseID
         * and compare with existing Course ID and if found valid, registers nonacademic course
         * this is done by calling the method to register from the NonAcademic_Course class */
        
        //For "Register Course" of NonAcademic Course
        
        else if(e.getSource() == register1_button)
        {
            boolean counter=false;
            int c=0;
            if (getCourseID1().isEmpty() || getCourse_leader1().isEmpty() || getLecturer_name1().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please fill in all the fields correctly","Error", JOptionPane.WARNING_MESSAGE);
                counter=true;
            }
            if(counter==false)
            {
                for (Course course: alist)
                {
                    if(course instanceof NonAcademic_Course)
                    {
                        c = 1;
                        if (getCourseID1().equals(course.getCourseID()))
                        {
                            object_nonacademic= (NonAcademic_Course)course;
                            c = 2;
                            if(object_nonacademic.getisRegistered()==true)
                            {
                                JOptionPane.showMessageDialog(frame,"The Course is already registered ! ");
                                break;
                            }
                            else if(object_nonacademic.getisRegistered()==false)
                            {
                                object_nonacademic.setRegister(getCourse_leader1(), getLecturer_name1() , getStartingDate1(), getCompletionDate1(), getExamDate());
                                JOptionPane.showMessageDialog(frame,"Successfully registered the course! \n\n Course ID: " + getCourseID1() + "\n Instructor Name: " + getLecturer_name1() + "\n Course Leader: " + getCourse_leader1() + "\n Start Date: " +getStartingDate1() + "\n End Date: " + getCompletionDate1() + "\n Exam Date: " + getExamDate());
                                break;
                            }
                        }
                    }
                } 
                if (c == 1)
                {
                    JOptionPane.showMessageDialog(frame, "Please fill in the CourseID correctly","Error", JOptionPane.ERROR_MESSAGE); 
                
                }
                else if (c == 0)
                {
                    JOptionPane.showMessageDialog(frame, "No Non-Academic Course has been added yet.","Error", JOptionPane.ERROR_MESSAGE); 
                    
                }
            }
        }
        
        
        /*Functionality for the button named "Display". 
        It is responsible for displaying the details of the course by 
        checking the instance and calling the class's method accordingly*/
        
        else if(e.getSource()==display_button)
        {
            if(getCourseID().isEmpty() && getCourseID1().isEmpty())
            {
                id_field.setText("1");
                id_field1.setText("1");
                JOptionPane.showMessageDialog(frame,"No Course to display ! ","Error", JOptionPane.ERROR_MESSAGE);
            }
            String getLabel= label.getText();
            for (Course course: alist)
            {
                //For Academic Course
                if(getLabel.equals("Academic Course"))
                {
                    if (course instanceof Academic_Course)
                    {
                        object_academic= (Academic_Course)course;
                        object_academic.display();
                        System.out.println("");
                    }
                }
                //For NonAcademic Course
                else if(getLabel.equals("Non-Academic Course"))
                {
                    if (course instanceof NonAcademic_Course)
                    {
                        object_nonacademic= (NonAcademic_Course)course;
                        object_nonacademic.display();
                        System.out.println("");
                    }
                }
            }
        }
        
        /*Functionality for the button named "Clear".
         * It clears all the field values and JComboBox input of the frame. */
         
        //For Academic Course
        else if(e.getSource()== clear_button)
        {
            id_field.setText("");
            name_field.setText("");
            duration_field.setText("");
            level_field.setText("");
            credit_field.setText("");
            assessment_field.setText("");
            leader_field.setText("");
            lecturer_field.setText("");  
            year_combo.setSelectedIndex(0);
            month_combo.setSelectedIndex(0);
            day_combo.setSelectedIndex(0);
            years_combo.setSelectedIndex(0);
            months_combo.setSelectedIndex(0);
            days_combo.setSelectedIndex(0);
        }
        //For NonAcademic Course
        else if(e.getSource()== clear1_button)
        {
            id_field1.setText("");
            name_field1.setText("");
            duration_field1.setText("");
            pre_field.setText("");
            lecturer_field1.setText("");
            leader_field1.setText("");
            startyear_combo.setSelectedIndex(0);
            startmonth_combo.setSelectedIndex(0);
            startday_combo.setSelectedIndex(0);
            endyear_combo.setSelectedIndex(0);
            endmonth_combo.setSelectedIndex(0);
            endday_combo.setSelectedIndex(0);
            examyear_combo.setSelectedIndex(0);
            exammonth_combo.setSelectedIndex(0);
            examday_combo.setSelectedIndex(0);
        }
        
        /* Functionality for the button named "Remove" in NonAcademic Course. 
        It is responsible for removing the registration of a particular course. 
         It does so by checking the instance and calling the method to remove*/
        
        else if(e.getSource()== remove_button)
        {
            for(Course course: alist)
            {
                if(course.getCourseID().equals (getCourseID1()))
                {
                    if (course instanceof NonAcademic_Course)
                    {
                        object_nonacademic= (NonAcademic_Course) course;
                        if(object_nonacademic.getisRemoved()==true)
                        {
                            JOptionPane.showMessageDialog(frame,"The Course is already removed ! ");
                            break;
                        }
                        else if(object_nonacademic.getisRemoved()==false)
                        {
                            object_nonacademic.Remove();
                            JOptionPane.showMessageDialog(frame,"Successfully removed the course!");
                            break;
                        }  
                    }   
                }
                else
                {
                    JOptionPane.showMessageDialog(frame, "Please input valid CourseID","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (getCourseID1().isEmpty())
            {
                 JOptionPane.showMessageDialog(frame, "Please input the CourseID for the course you would like to remove","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}


