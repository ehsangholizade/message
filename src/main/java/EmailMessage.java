public class EmailMessage implements Message {
    private String content;
    private String recipient;

    public EmailMessage(String content, String recipient) {
        this.content = content;
        this.recipient = recipient;
    }

    @Override
    public void sendMessage() {
        System.out.println("sending email to: " + recipient + " with content " + content);
    }
}
