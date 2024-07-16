package nested.nested.outer.ex2;

public class Network {

    public void sendMessage(String msg) {
        final NetworkMessage networkMessage = new NetworkMessage(msg);
        networkMessage.print();
    }

    private static class NetworkMessage {

        private String content;

        public NetworkMessage(final String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
