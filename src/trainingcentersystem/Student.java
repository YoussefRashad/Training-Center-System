/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingcentersystem;

import java.io.Serializable;
import java.sql.Struct;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Student extends Person implements Serializable{
    
    private double GPA;
    private int Level;
    private String Depart;
    private ArrayList<Student> students = new ArrayList<Student>();
    private boolean attend;
    private double Grades [] = new double[21];
    private String Courses[] = new String[7];
    public  int SubjectCount=0 , GradesCount=0; // dol 34an 23rf eyh elly index 2tmlh 24an 2dyf tany
    private String ImagePath;

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String ImagePath) {
        this.ImagePath = ImagePath;
    }
    
    private String FilePath = "Student.txt";
    
    public Student() {
    }

    public Student(double GPA, int Level, int ID, String Name, String Tel, String Email, String Pass, String Depart) {
        super(ID, Name, Tel, Email, Pass);
        this.GPA = GPA;
        this.Level = Level;
        this.Depart=Depart;
    }

    public String[] getCourses() {
        return this.Courses;
    }

    public void setCourses(String[] Courses) {
        this.Courses = Courses;
        
    }

    
    public boolean isAttend() {
        return attend;
    }

    public void setAttend(boolean attend) {
        this.attend = attend;
    }
    public double[] getGrades() {
        return this.Grades;
    }

    public void setGrades(double[] Grades) {
        this.Grades = Grades;
    }
    
    
    public String getDepart() {
        return this.Depart;
    }

    public void setDepart(String Depart) {
        this.Depart = Depart;
    }
    
    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getLevel() {
        return this.Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }
    public void loadFromFile()
    {
        students =(ArrayList<Student>)(Object) FManger.Read(FilePath);
    }
    public String getStudentFile()
    { // fadl array tb3 el grades mn courses & array bl Courses 
        Course x = new Course();
        return this.ID+"`"+this.Name+"`"+this.Email+"`"+this.Pass+"`"+this.Tel+"`"+this.Depart+"`"+this.Level+"`"+this.GPA+"`"+this.attend+"`"+
               this.Courses[0]+"`"+this.Grades[0]+"`"+this.Grades[1]+"`"+this.Grades[2]+"`"+this.Courses[1]+"`"+this.Grades[3]+"`"+this.Grades[4]+"`"+this.Grades[5]+
               "`"+this.Courses[2]+"`"+this.Grades[6]+"`"+this.Grades[7]+"`"+this.Grades[8]+"`"+this.Courses[3]+"`"+this.Grades[9]+"`"+this.Grades[10]+"`"+this.Grades[11]+
               "`"+this.Courses[4]+"`"+this.Grades[12]+"`"+this.Grades[13]+"`"+this.Grades[14]+"`"+this.Courses[5]+"`"+this.Grades[15]+"`"+this.Grades[16]+"`"+this.Grades[17]+
               "`"+this.Courses[6]+"`"+this.Grades[18]+"`"+this.Grades[19]+"`"+this.Grades[20]+"`";
    }
    public boolean bookCourse(int id,String course)
    {
        if(searchStudent(id)){
            int index = getIndexStudent(id);
            Student x = new Student();
            x = x.getStudent(id);
            x.Courses[SubjectCount]=course;
            students.set(index, x);
            commitToFile();
            return true;
        }
        return false;
    }
    public boolean searchStudent(int id)
    {
        loadFromFile();
        for(Student ad : students)
            if(ad.ID==id)
                return true;
        return false;
    }
    public Student getStudent(int id)
    {
        loadFromFile();
        for(Student ad : students)
            if(ad.ID==id)
                return ad;
        return null;
    }
    public int getIndexStudent(int id)
    {
        for(int i=0;i<students.size();i++)
            if(students.get(i).ID==id)
                return i;
        return -1;
    }
    public boolean addStudent()
    {
        /*loadFromFile();
        students.add(this);
        return commitToFile();*/
        if(FManger.Write(this.getStudentFile(), FilePath, true))
            return true;
        return false;
    }
    public void commitToFile()
    {
        FManger.Write(students.get(0).getStudentFile(), FilePath, false);
        for(int i=1;i<students.size();i++)
            FManger.Write(students.get(i).getStudentFile(), FilePath, true);
        //return FManger.Write(FilePath, students);
    }
    public boolean editStudent(int id)
    {
        if(searchStudent(id)){
            int index = getIndexStudent(id);
            students.set(index, this);
            commitToFile();
            return true;
            //return commitToFile();
        }
        return false;
    }
    public boolean removeStudent(int id)
    {
        if(searchStudent(id)){
            int index = getIndexStudent(id);
            students.remove(index);
            commitToFile();
            return true;
            //return commitToFile();
        }
        return false;
    }
    public ArrayList<Student> ListAllStudent()
    {
        loadFromFile();
        return students;
    }
    
    public boolean logIn(String Email , String Pass)
    {
        if(Email.equals("Student@yahoo.com")&&Pass.equals("12345678"))
            return true;
        loadFromFile();
        for(Student ad:students)
            if(ad.Email.equals(Email)&&ad.Pass.equals(Pass))
                return true;
        return false;
    }
    public Student openMyProfile(String Email , String Pass)
    {

        loadFromFile();
        for(Student ad:students)
            if(ad.Email.equals(Email)&&ad.Pass.equals(Pass))
                return ad;
        return null;
    }
    public double totalGrade(Student x)
    {
        double d = 0.0;
        for(int i=0;i<x.Grades.length;i++){
            d+=x.Grades[i];
        }
        return d;
    }
    public boolean dublicateCourse(Student x ,String course)
    {
        for(int i=0;i<x.Courses.length;i++)
            if(x.Courses[i].equals(course))
                return true;
        return false;
    }
    public boolean dublicateStudent(int ID)
    {
        loadFromFile();
        for(Student s : students)
            if(s.ID==ID)
                return true;
        return false;
    }
    public boolean SearchCourse(Student x ,String course)
    {
        for(int i=0;i<x.Courses.length;i++)
            if(x.Courses[i].equals(course))
                return true;
        return false;
    }
    public int getIndexCourse(Student x ,String course)
    {
        for(int i=0;i<x.Courses.length;i++)
            if(x.Courses[i].equals(course))
                return i;
        return -1;
    }
    
    
    
    
    
}
