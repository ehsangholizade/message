public class TextMessage implements Message{
    private int phoneNumber;
    private String content;

    public TextMessage(int phoneNumber, String content) {
        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    @Override
    public void sendMessage() {
        System.out.println("sending message to "+phoneNumber+" with content "+content);
    }
}
