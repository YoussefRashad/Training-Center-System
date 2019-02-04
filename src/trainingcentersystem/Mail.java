

package trainingcentersystem;

import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public final class Mail {
    FileManger FManger = new FileManger();
    
    private final String FilePath = "Email.txt";
    ArrayList<Mail> E = new ArrayList<Mail>();
    
    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;
    
    private String ToEmail = "";
    private String CcEmail = "";
    private String Subject = "";
    private String Emailbody = "";
    
    public Mail(){
        
    }
    public Mail(String To , String Cc , String subject , String body)
    {
        this.CcEmail=Cc;
        this.Emailbody=body;
        this.Subject=subject;
        this.ToEmail = To;
    }
    
    public void generateAndSentMessage()throws AddressException, MessagingException
    {
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        
        getMailSession = Session.getDefaultInstance(mailServerProperties);
        generateMailMessage = new MimeMessage(getMailSession);
        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
        if(!CcEmail.equals(""))
            generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(CcEmail));
        
        generateMailMessage.setSubject(Subject);
        String emailBody = Emailbody +"<br><br>Regards,<br>Manager Youssef Rasahd ..";
        generateMailMessage.setContent(emailBody , "text/html");
        
        Transport transport = getMailSession.getTransport("smtp");
        transport.connect("smtp.yahoo.com", "youssefrashad19@yahoo.com", "");
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        transport.close();
        
        
        loadFromFile();
        E.add(this);
        commitToFile();
        
        
        
    }
    private void loadFromFile()
    {
        E = (ArrayList<Mail>)(Object) FManger.Read(FilePath);
    }
    
    public void setToEmail(String to)
    {
        this.ToEmail=to;
    }
    public void setCcEmail(String cc)
    {
        this.CcEmail=cc;
    }
    public void setSubject(String s)
    {
        this.Subject=s;
    }
    public void setEmailbody(String b)
    {
        this.Emailbody=b;
    }
    public String getToEmail()
    {
        return this.ToEmail;
    }
    public String getCcEmail()
    {
       return this.CcEmail;
    }
    public String getSubject()
    {
       return this.Subject;
    }
    public String getEmailbody()
    {
       return this.Emailbody;
    }
    public void commitToFile()
    {
        FManger.Write(E.get(0).getEmailFile(), FilePath, false);
        for(int i=1;i<E.size();i++)
            FManger.Write(E.get(i).getEmailFile(), FilePath, true);
//        return FManger.Write(FilePath, E);
    }
    public String getEmailFile()
    {
    return this.ToEmail+"`"+this.CcEmail+"`"+this.Subject+"`"+this.Emailbody+"`";
    }
    public ArrayList<Mail> ListMails()
    {
        loadFromFile();
        return E;
    }
    
}
