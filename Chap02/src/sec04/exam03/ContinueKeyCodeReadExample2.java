package sec04.exam03;

public class ContinueKeyCodeReadExample2 {
    public static void main(String[] args) throws Exception {
        int keyCode;

        while (true) {
            keyCode = System.in.read();

            // ASCII 13을 확인하기 위해 Carriage Return을 확인합니다.
            if (keyCode == 13) {
                System.out.println("Carriage Return Detected!");
            } else {
                System.out.println("keyCode: " + keyCode);
            }
        }
    }
}
