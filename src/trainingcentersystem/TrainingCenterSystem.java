/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingcentersystem;

import GUI.Login;
import java.io.File;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class TrainingCenterSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path: " + projectPath);
        File currentDir = new File(projectPath); 				
	checkDirectoryContents(currentDir);*/
        //new Login().setVisible(true);
        
        Validation v = new Validation();
        Student s = new Student();
        s=s.getStudent(20181840);
        String[] str = s.getCourses();
        System.out.println(s.SubjectCount+"\t"+s.GradesCount+"\n"+Arrays.toString(s.getCourses()) + "\n"+Arrays.toString(s.getGrades()));
        String str2=str[6];
        System.out.println(str2);
        
//`null`0.0`0.0`0.0 `null`0.0`0.0`0.0 `null`0.0`0.0`0.0 `null`0.0`0.0`0.0 `null`0.0`0.0`0.0 `null`0.0`0.0`0.0 `CS`0.0`0.0`0.0`
        /*if(v.checkGPA("5.08"))
            System.out.println("true 1");
        else
            System.out.println("Error 1");
        if(v.checkGPA("0.0"))
            System.out.println("true 2");
        else
            System.out.println("Error 2");
        if(v.checkGPA("0026"))
            System.out.println("true 3");
        else
            System.out.println("Error 3");
        if(v.checkGPA("002"))
            System.out.println("true 4");
        else
            System.out.println("Error 4");
        if(v.checkGPA(".02"))
            System.out.println("true 5");
        else
            System.out.println("Error 5");
        if(v.checkGPA("1.53"))
            System.out.println("true 6");
        else
            System.out.println("Error 7");
        if(v.checkGPA("54;l;l"))
            System.out.println("true 8");
        else
            System.out.println("Error 8");
        if(v.checkGPA("4.5"))
            System.out.println("true 9");
        else
            System.out.println("Error 9");
        if(v.checkGPA("1+56"))
            System.out.println("true 9");
        else
            System.out.println("Error 10");
        */
        
        
        
    }
    
    public static void checkDirectoryContents(File dir)
    {
        File[] files = dir.listFiles();
        boolean AdminFile = true;
        boolean StudentFile = true;
        boolean TutorFile = true;
        boolean CourseFile= true;
        boolean EmailFile = true;
        for (File file : files) {
            if (file.getName().contains("Admin.bin"))
                AdminFile = false;
            else if (file.getName().contains("Student.bin"))
                StudentFile=false;
            else if(file.getName().contains("Tutor.bin"))
                TutorFile=false;
            else if(file.getName().contains("Course.bin"))
                CourseFile=false;
            else if (file.getName().contains("Email.bin"))
                EmailFile=false;
        }
        if (AdminFile) 
            new Admin().commitToFile();
            
        if(StudentFile)
            new Student().commitToFile();
        if(TutorFile)
            new Tutor().commitToFile();
        if(CourseFile)
            new Course().commitToFile();
        if(EmailFile)
            new Mail().commitToFile();
    }
    
}
