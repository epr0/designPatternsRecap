package intro.abstraction;

public class AbstractionMain {

    public static void main(String[] args) {
        MailService mailService = new MailService();
        mailService.sendEmail();
        mailService.doSpecificServiceThings();
    }
}
