package sec04.exam02;

public class KeyCodeExample2 {
    public static void main(String[] args) throws Exception {
        int keyCode;

        // 첫 번째 문자 입력 및 엔터 처리
        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode); // 첫 번째 문자 출력
        System.in.read(); // 엔터 처리

        // 두 번째 문자 입력 및 엔터 처리
        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode); // 두 번째 문자 출력
        System.in.read(); // 엔터 처리

        // 세 번째 문자 입력 및 엔터 처리
        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode); // 세 번째 문자 출력
        System.in.read(); // 엔터 처리
    }
}