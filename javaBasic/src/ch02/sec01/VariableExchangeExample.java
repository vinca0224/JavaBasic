package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3; //변수 선언 및 초기화
        int y = 5;
        System.out.println("x: " + x + " y: " + y);
    
        int temp = x; //temp 변수에 x의 값 대입
        x = y; //y값을 변수 x에 대입
        y = temp; //temp에 있었던 원래의 x값을 y에 대입 -> 변수 x,y의 값 교환
        System.out.println("x: " + x + " y: " + y);
    }
}
