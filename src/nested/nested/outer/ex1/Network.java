package nested.nested.outer.ex1;

public class Network {

    public void sendMessage(String msg) {
        final NetworkMessage networkMessage = new NetworkMessage(msg);
        networkMessage.print();
    }
}
