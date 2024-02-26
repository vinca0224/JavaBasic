package ch02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        // 변수 value 선언
        int value; //변수 초기화 X, 아직 메모리영역에 할당되지 않음

        // 연산 결과를 변수 result의 초기값으로 대입
        // int result = value + 10; //value가 초기화하지않고 사용하기 때문에 컴파일 오류 발생
        value = 10;
        int result = value + 10;

        // 변수 result 값을 읽고 콘솔에 출력
        System.out.println(result);
    }
}
