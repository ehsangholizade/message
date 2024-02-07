public class InstagramMessage implements Message{
    private String user;
    private String content;

    public InstagramMessage() {
    }

    public InstagramMessage(String user, String content) {
        this.user = user;
        this.content = content;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void sendMessage() {
        System.out.println("sending instagram message to: "+ user + " with content "+ content );
    }
}
