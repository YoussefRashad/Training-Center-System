


package trainingcentersystem;

import java.io.Serializable;




public class Person implements Serializable{
    protected int ID;
    protected String Email,Pass,Name,Tel;
    protected FileManger FManger = new FileManger();

    public Person() {
    }

    public Person(int ID, String Name, String Tel, String Email, String Pass) {
        this.ID = ID;
        this.Name = Name;
        this.Tel = Tel;
        this.Email = Email;
        this.Pass = Pass;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    

    
    
    
}
