


package trainingcentersystem;

import java.io.Serializable;
import java.util.ArrayList;




public class Course implements Serializable{
    
    
    private int CourseID;
    private String CourseName;
    private int CreditHour;
    private String Dept;
    private ArrayList<Course>courses = new ArrayList<Course>();
    private String FilePath = "Course.txt";
    private FileManger FManger = new FileManger();
    
    
    
    
    public Course() {
    }

    public Course(int CourseID, String CourseName, int CreditHour, String Dept) {
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.CreditHour = CreditHour;
        this.Dept = Dept;
    }
    
    
    public int getCreditHour() {
        return this.CreditHour;
    }

    public void setCreditHour(int CreditHour) {
        this.CreditHour = CreditHour;
    }

    
    
    public int getCourseID() {
        return this.CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public String getCourseName() {
        return this.CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }


    public String getDept() {
        return this.Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }
    public void loadFromFile()
    {
        courses =(ArrayList<Course>)(Object) FManger.Read(FilePath);
    }
    public String getCourseFile()
    {
        return this.CourseID+"`"+this.CourseName+"`"+this.Dept+"`"+this.CreditHour+"`";
    }
    public boolean searchCourse(int id)
    {
        loadFromFile();
        for(Course ad : courses)
            if(ad.CourseID==id)
                return true;
        return false;
    }
    public Course getCourse(int id)
    {
        loadFromFile();
        for(Course ad : courses)
            if(ad.CourseID==id)
                return ad;
        return null;
    }
    public int getIndexCourse(int id)
    {
        for(int i=0;i<courses.size();i++)
            if(courses.get(i).CourseID==id)
                return i;
        return -1;
    }
    public boolean addCourse()
    {
        /*loadFromFile();
        courses.add(this);
        return commitToFile();*/
        if(FManger.Write(this.getCourseFile(), FilePath, true))
            return true;
        return false;
    }
    public void commitToFile()
    {
        FManger.Write(courses.get(0).getCourseFile(), FilePath, false);
        for(int i=1;i<courses.size();i++)
            FManger.Write(courses.get(i).getCourseFile(), FilePath, true);
        //return FManger.Write(FilePath, courses);
    }
    public boolean editCourse(int id)
    {
        if(searchCourse(id)){
            int index = getIndexCourse(id);
            courses.set(index, this);
            //return commitToFile();
            commitToFile();
            return true;
        }
        return false;
    }
    public boolean removeCourse(int id)
    {
        if(searchCourse(id)){
            int index = getIndexCourse(id);
            courses.remove(index);
            //return commitToFile();
            commitToFile();
            return true;
        }
        return false;
    }
    public ArrayList<Course> ListAllCourse()
    {
        loadFromFile();
        return courses;
    }
    public boolean dublicateCourse(String Course , int ID)
    {
        loadFromFile();
        for(Course c : courses)
            if(c.CourseID==ID || c.CourseName.equals(Course))
                return true;
        return false;
    }

}
