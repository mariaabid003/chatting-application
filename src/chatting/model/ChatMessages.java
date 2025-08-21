package chatting.model;

import java.util.LinkedList;

public class ChatMessages {
    private LinkedList<Message> messages;

    public ChatMessages() {
        this.messages = new LinkedList<>();
    }

    public LinkedList<Message> getMessages() {
        return messages;
    }

    public void setMessages(LinkedList<Message> messages) {
        this.messages = messages;
    }
}
