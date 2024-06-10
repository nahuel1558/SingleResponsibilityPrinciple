package Model;


public class SendEmail {
    
    private String sender;
    private String emailFor;
    private String subject;
    private String message;

    public SendEmail(String sender, String emailFor, String subject, String message) {
        this.sender = sender;
        this.emailFor = emailFor;
        this.subject = subject;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getEmailFor() {
        return emailFor;
    }

    public void setEmailFor(String emailFor) {
        this.emailFor = emailFor;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String sendEmail() {
    return "Email Sent to " + emailFor + "\nSubject: " + subject + "\nMessage: " + message;
}
}
