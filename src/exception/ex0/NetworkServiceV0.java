package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        final String address = "http://example/com";
        final NetworkClientV1 client = new NetworkClientV1(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
