


package trainingcentersystem;

import java.io.Serializable;
import java.util.ArrayList;




public class Admin extends Person/* implements Serializable*/{
    
    private ArrayList<Admin>admins = new ArrayList<Admin>();
    private String FilePath = "Admin.txt";

    public Admin() {
    }

    public Admin(int ID, String Name, String Tel, String Email, String Pass) {
        super(ID, Name, Tel, Email, Pass);
    }
    
    public void loadFromFile()
    {
        admins =(ArrayList<Admin>)(Object) FManger.Read(FilePath);
    }
    public boolean searchAdmin(int id)
    {
        loadFromFile();
        for(Admin ad : admins)
            if(ad.ID==id)
                return true;
        return false;
    }
    public Admin getAdmin(int id)
    {
        loadFromFile();
        for(Admin ad : admins)
            if(ad.ID==id)
                return ad;
        return null;
    }
    public int getIndexAdmin(int id)
    {
        for(int i=0;i<admins.size();i++)
            if(admins.get(i).ID==id)
                return i;
        return -1;
    }
    public boolean addAdmin()
    {
        //loadFromFile();
        if(FManger.Write(this.getAdminFile(), FilePath, true))
            return true;
        return false;
        //return commitToFile();
    }
    public void commitToFile()
    {
        FManger.Write(admins.get(0).getAdminFile(), FilePath, false);
        for(int i=1;i<admins.size();i++)
            FManger.Write(admins.get(i).getAdminFile(), FilePath, true);
        //return FManger.Write(FilePath, admins);
    }
    public String getAdminFile()
    {
        return this.ID+"`"+this.Name+"`"+this.Email+"`"+this.Pass+"`"+this.Tel+"`";
    }
    public boolean editAdmin(int id)
    {
        if(searchAdmin(id)){
            int index = getIndexAdmin(id);
            admins.set(index, this);
            commitToFile();
            return true;
            //return commitToFile();
        }
        return false;
    }
    public boolean removeAdmin(int id)
    {
        if(searchAdmin(id)){
            int index = getIndexAdmin(id);
            admins.remove(index);
            commitToFile();
            return true;
            //return commitToFile();
        }
        return false;
    }
    public ArrayList<Admin> ListAllAdmin()
    {
        
        loadFromFile();
        return admins;
    }
    
    public boolean logIn(String Email , String Pass)
    {
        if(Email.equals("Admin@yahoo.com")&&Pass.equals("12345678"))
            return true;
        loadFromFile();
        for(Admin ad:admins)
            if(ad.Email.equals(Email)&&ad.Pass.equals(Pass))
                return true;
        return false;
    }
    public boolean dublicate(int ID)
    {
        loadFromFile();
        for(Admin t : admins)
            if(t.ID==ID)
                return true;
        return false;
    }
    
}
