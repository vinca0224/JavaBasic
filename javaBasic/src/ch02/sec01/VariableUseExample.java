package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;   //변수 선언 및 초기화
        int minute = 5; //변수 선언 및 초기화
        System.out.println(hour + "시간 " + minute + "분"); //변수 대입

        int totalMinute = (hour * 60) + minute; //변수값 활용
        System.out.println("총 " + totalMinute + "분");
    }
}
