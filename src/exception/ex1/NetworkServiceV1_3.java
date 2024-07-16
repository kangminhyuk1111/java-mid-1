package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        final String address = "http://example/com";
        final NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        final String connectResult = client.connect();

        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        } else {
            final String sendResult = client.send(data);

            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
                return;
            }
        }

        client.disconnect();
    }

    private boolean isError(final String connectResult) {
        return !connectResult.equals("success");
    }
}
