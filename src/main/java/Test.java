import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void cal(Message message) {
        message.sendMessage();
    }

    public static void cal(List<Message> messageList) {
        for (Message message : messageList) {
            message.sendMessage();
        }
    }

    public static void main(String[] args) {
        InstagramMessage instagramMessage = new InstagramMessage();
        instagramMessage.setUser("ehsan");
        instagramMessage.setContent("test");

        TextMessage textMessage = new TextMessage(912, "test");

        cal(instagramMessage);
        cal(textMessage);

        ArrayList<Message> messageList = new ArrayList<>();
        messageList.add(instagramMessage);
        messageList.add(textMessage);
        cal(messageList);
    }
}
