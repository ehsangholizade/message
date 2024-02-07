import java.util.ArrayList;
import java.util.List;

public class MessageApp {
    List<Message> messages;

    public MessageApp() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void processMessage() {
        for (Message message : messages) {
            try {
                message.sendMessage();
            } catch (Exception e) {
                System.out.println("error in send" + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MessageApp messageApp = new MessageApp();
        messageApp.addMessage(new EmailMessage("emailTest", "a@gmail"));
        messageApp.addMessage(new TextMessage(920, "textTest"));
        messageApp.addMessage(new InstagramMessage("ehsan","instagramTest"));
        messageApp.processMessage();
    }
}
