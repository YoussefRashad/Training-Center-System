
package trainingcentersystem;

import com.sun.javafx.image.impl.IntArgb;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public final class FileManger {
    public boolean Write (String Query , String FilePath , boolean append)
    {
        PrintWriter Writter = null;
        try{
            System.out.print("\nwritting in ! " + FilePath);
            Writter = new PrintWriter(new FileWriter(new File(FilePath),append));
            Writter.println(Query);
            System.out.println(" ... Done ! ");
            return true;
        }
        catch(IOException em)
        {
            System.out.println("Error in Writting : "+em);
        }
        finally{
            Writter.close();
        }
        return false;
    }
    
    
    public ArrayList<Object> Read (String FilePath)
    {
        Scanner Reader= null;
        try{
            System.out.println("Reading ! From " + FilePath);
            Reader = new Scanner(new File(FilePath));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error in Reading by Youssef : "+e);
        }
        
        if(FilePath.equals("Student.txt")){
            ArrayList<Student>stu = new ArrayList<Student>();
            Student x = null;
            while(Reader.hasNext()){
                x = new Student();
                String Line = Reader.nextLine();
                String Seprated[]=Line.split("`");
                /*
                ID ` Name ` Email ` Pass ` Tel ` Depart ` Level ` GPA ` attend+"`"+
               Courses[0] ` Grades[0] ` Grades[1] ` Grades[2]+this.Courses[1] ` Grades[0] ` Grades[1] ` Grades[2]+
               Courses[2] ` Grades[0] ` Grades[1] ` Grades[2]+this.Courses[3] ` Grades[0] ` Grades[1] ` Grades[2]+
               Courses[4] ` Grades[0] ` Grades[1] ` Grades[2]+this.Courses[5] ` Grades[0] ` Grades[1] ` Grades[2]+
               Courses[6] ` Grades[0] ` Grades[1] ` Grades[2];
                */
                x.setID(Integer.parseInt(Seprated[0]));
                x.setName(Seprated[1]);
                x.setEmail(Seprated[2]);
                x.setPass(Seprated[3]);
                x.setTel(Seprated[4]);
                x.setDepart(Seprated[5]);
                x.setLevel(Integer.parseInt(Seprated[6]));
                x.setGPA(Double.parseDouble(Seprated[7]));
                x.setAttend(Boolean.parseBoolean(Seprated[8]));
                
                String Subject[]=new String[7];
                double Grades[]=new double[21];
                
                Subject[0]=Seprated[9];
                Grades[0]=Double.parseDouble(Seprated[10]);
                Grades[1]=Double.parseDouble(Seprated[11]);
                Grades[2]=Double.parseDouble(Seprated[12]);
                if(!Seprated[9].equals("null")){
                    x.SubjectCount++;
                    x.GradesCount+=3;
                }
                Subject[1]=Seprated[13];
                Grades[3]=Double.parseDouble(Seprated[14]);
                Grades[4]=Double.parseDouble(Seprated[15]);
                Grades[5]=Double.parseDouble(Seprated[16]);
                if(!Seprated[13].equals("null")){
                    x.SubjectCount++;
                    x.GradesCount+=3;
                }
                Subject[2]=Seprated[17];
                Grades[6]=Double.parseDouble(Seprated[18]);
                Grades[7]=Double.parseDouble(Seprated[19]);
                Grades[8]=Double.parseDouble(Seprated[20]);
                if(!Seprated[17].equals("null")){
                    x.SubjectCount++;
                    x.GradesCount+=3;
                }
                Subject[3]=Seprated[21];
                Grades[9]=Double.parseDouble(Seprated[22]);
                Grades[10]=Double.parseDouble(Seprated[23]);
                Grades[11]=Double.parseDouble(Seprated[24]);
                if(!Seprated[21].equals("null")){
                    x.SubjectCount++;
                    x.GradesCount+=3;
                }
                Subject[4]=Seprated[25];
                Grades[12]=Double.parseDouble(Seprated[26]);
                Grades[13]=Double.parseDouble(Seprated[27]);
                Grades[14]=Double.parseDouble(Seprated[28]);
                if(!Seprated[25].equals("null")){
                    x.SubjectCount++;
                    x.GradesCount+=3;
                }
                Subject[5]=Seprated[29];
                Grades[15]=Double.parseDouble(Seprated[30]);
                Grades[16]=Double.parseDouble(Seprated[31]);
                Grades[17]=Double.parseDouble(Seprated[32]);
                if(!Seprated[29].equals("null")){
                    x.SubjectCount++;
                    x.GradesCount+=3;
                }
                Subject[6]=Seprated[33];
                Grades[18]=Double.parseDouble(Seprated[34]);
                Grades[19]=Double.parseDouble(Seprated[35]);
                Grades[20]=Double.parseDouble(Seprated[36]);
                if(!Seprated[33].equals("null")){
                    x.SubjectCount++;
                    x.GradesCount+=3;
                }
                x.setCourses(Subject);
                x.setGrades(Grades);
                
                
                
                stu.add(x);
                
            }
            return (ArrayList<Object>)(Object)stu;
        }
        else if(FilePath.equals("Admin.txt")){
            ArrayList<Admin>admins = new ArrayList<Admin>();
            Admin x = null;
            while(Reader.hasNext()){
                x = new Admin();
                String Line = Reader.nextLine();
                String Seprated[]=Line.split("`");
                //ID ` Name ` Email ` Pass ` Tel `
                x.setID(Integer.parseInt(Seprated[0]));
                x.setName(Seprated[1]);
                x.setEmail(Seprated[2]);
                x.setPass(Seprated[3]);
                x.setTel(Seprated[4]);
                admins.add(x);
            }
            return (ArrayList<Object>)(Object)admins;
        }
        else if(FilePath.equals("Tutor.txt")){
            ArrayList<Tutor>tutors = new ArrayList<Tutor>();
            Tutor x = null;
            while(Reader.hasNext()){
                x = new Tutor();
                String Line = Reader.nextLine();
                String Seprated[]=Line.split("`");
                //ID ` Name ` Email ` Pass ` Tel ` Depart ` OfficeHours ` Salary+"`"
                x.setID(Integer.parseInt(Seprated[0]));
                x.setName(Seprated[1]);
                x.setEmail(Seprated[2]);
                x.setPass(Seprated[3]);
                x.setTel(Seprated[4]);
                x.setDepart(Seprated[5]);
                x.setOfficeHours(Integer.parseInt(Seprated[6]));
                x.setSalary(Double.parseDouble(Seprated[7]));
                tutors.add(x);
            }
            return (ArrayList<Object>)(Object)tutors;
        }
        else if(FilePath.equals("Course.txt")){
            ArrayList<Course>courses = new ArrayList<Course>();
            Course x = null;
            while(Reader.hasNext()){
                x = new Course();
                String Line = Reader.nextLine();
                String Seprated[]=Line.split("`");
                // CourseID ` CourseName `  Dept ` CreditHour `
                x.setCourseID(Integer.parseInt(Seprated[0]));
                x.setCourseName(Seprated[1]);
                x.setDept(Seprated[2]);
                x.setCreditHour(Integer.parseInt(Seprated[3]));
                courses.add(x);
            }
            return (ArrayList<Object>)(Object)courses;
        }
        
        else if(FilePath.equals("Email.txt")){
            ArrayList<Mail> mails = new ArrayList<Mail>();
            Mail m ;
            while(Reader.hasNext()){
                m = new Mail();
                String Line = Reader.nextLine();
                String Seprated[]=Line.split("`");
                
                // ToEmail ` CcEmail ` Subject ` Emailbody `
                
                m.setToEmail(Seprated[0]);
                m.setCcEmail(Seprated[1]);
                m.setSubject(Seprated[2]);
                m.setEmailbody(Seprated[3]);
                mails.add(m);
            }
            return (ArrayList<Object>)(Object)mails;
            
        }
        
        return null;
        
    }
    
}
