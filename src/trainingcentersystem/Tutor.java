/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingcentersystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Tutor extends Person implements Serializable{
    
    private int OfficeHours;
    private double Salary;
    private String Depart;
    private ArrayList<Tutor> tutors = new ArrayList<Tutor>();
    private String FilePath = "Tutor.txt";
    
    public Tutor() {
    }


    public Tutor(int OfficeHours, double Salary, int ID, String Name, String Tel, String Email, String Pass, String Depart) {
        super(ID, Name, Tel, Email, Pass);
        this.OfficeHours = OfficeHours;
        this.Salary = Salary;
        this.Depart=Depart;
    }

    public String getDepart() {
        return Depart;
    }

    public void setDepart(String Depart) {
        this.Depart = Depart;
    }

    
    
    public int getOfficeHours() {
        return OfficeHours;
    }

    public void setOfficeHours(int OfficeHours) {
        this.OfficeHours = OfficeHours;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    public void loadFromFile()
    {
        tutors =(ArrayList<Tutor>) (Object)FManger.Read(FilePath);
    }
    public boolean searchTutor(int id)
    {
        loadFromFile();
        for(Tutor ad : tutors)
            if(ad.ID==id)
                return true;
        return false;
    }
    public Tutor getTutor(int id)
    {
        loadFromFile();
        for(Tutor ad : tutors)
            if(ad.ID==id)
                return ad;
        return null;
    }
    public int getIndexTutor(int id)
    {
        for(int i=0;i<tutors.size();i++)
            if(tutors.get(i).ID==id)
                return i;
        return -1;
    }
    public boolean addTutor()
    {
        if(FManger.Write(this.getTutorFile(), FilePath, true))
            return true;
        return false;
//        loadFromFile();
//        tutors.add(this);
//        return commitToFile();
    }
    public String getTutorFile()
    {
        return this.ID+"`"+this.Name+"`"+this.Email+"`"+this.Pass+"`"+this.Tel+"`"+this.Depart+"`"+this.OfficeHours+"`"+this.Salary+"`";
    }
    public void commitToFile()
    {
        FManger.Write(tutors.get(0).getTutorFile(), FilePath, false);
        for(int i=1;i<tutors.size();i++)
            FManger.Write(tutors.get(i).getTutorFile(), FilePath, true);
//        return FManger.Write(FilePath, tutors);
    }
    public boolean editTutor(int id)
    {
        if(searchTutor(id)){
            int index = getIndexTutor(id);
            tutors.set(index, this);
            commitToFile();
            return true;
//            return commitToFile();
        }
        return false;
    }
    public boolean removeTutor(int id)
    {
        if(searchTutor(id)){
            int index = getIndexTutor(id);
            tutors.remove(index);
            commitToFile();
            return true;
//            return commitToFile();
        }
        return false;
    }
    public ArrayList<Tutor> ListAllTutor()
    {
        loadFromFile();
        return tutors;
    }
    
    public boolean logIn(String Email , String Pass)
    {
        if(Email.equals("Tutor@yahoo.com")&&Pass.equals("12345678"))
            return true;
        loadFromFile();
        for(Tutor ad:tutors)
            if(ad.Email.equals(Email)&&ad.Pass.equals(Pass))
                return true;
        return false;
    }
    public boolean dublicate(int ID)
    {
        loadFromFile();
        for(Tutor t : tutors)
            if(t.ID==ID)
                return true;
        return false;
    }
 
}
