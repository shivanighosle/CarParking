package EmailVarifications;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import com.utility.classes.*;

public class SendMail {
	public static boolean send(String YourName, String YourEmail, int r)
	{
      boolean test  = false;
      final  String fromEmail = "aakashbhagore188@gmail.com";
      final  String password  = "A@k1$h!!";
         
        	 Properties pr = new Properties();
        	 pr.put("mail.smtp.host","smtp.gmail.com");
        	 pr.put("mail.smtp.port", "587");
        	 pr.put("mail.smtp.auth","true");
        	 pr.put("mail.smtp.starttls.enable", "true");
        	 pr.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        	 
        	 Session session = Session.getInstance(pr, new javax.mail.Authenticator() {	    
        		 @Override
        		 protected PasswordAuthentication getPasswordAuthentication() {
        			return new PasswordAuthentication(fromEmail, password); 
        		 }
       	 });
        	 
        	// Session session = Session.getDefaultInstance(pr);
        	 try {
        	 MimeMessage mass = new MimeMessage(session); 
        	 mass.setFrom(new InternetAddress(fromEmail));
        	// InternetAddress[] toAddresses = { new InternetAddress(email) };
        	 mass.addRecipient(Message.RecipientType.TO, new InternetAddress(YourEmail));
             mass.setSubject("Client Slot Booking Verification");
             mass.setText("hii you booked your slot");
             mass.setText("YourName:- "+YourName+"\n YourEmail:- "+YourEmail+"\n Rent:- "+r);
             Transport.send(mass);
             System.out.println("Done");
             test = true;
        }
        catch(Exception e) {
         e.printStackTrace();
        }
        return test;
  }	
}
