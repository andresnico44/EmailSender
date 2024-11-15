package co.edu.ufps.emailsender;

public class EmailRequest {
    private String to;
    private String subject;
    private String cc;
    private String message;

    // Getters y setters
    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getCc() { return cc; }
    public void setCc(String cc) { this.cc = cc; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    @Override
    public String toString() {
        return "EmailRequest{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", cc='" + cc + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
