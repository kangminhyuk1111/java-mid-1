package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        final String address = "http://example/com";
        final NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
