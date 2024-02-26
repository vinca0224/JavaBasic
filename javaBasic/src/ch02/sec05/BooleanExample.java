package ch02.sec05;

public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) { //stop가 true이면
            System.out.println("중지합니다.");
        }else{  //stop가 false이면
            System.out.println("시작합니다.");
        }

        int x =10;
        boolean result1 = (x == 20); //x의 값이 20인지
        boolean result2 = (x != 20); //x의 값이 20이 아닌지
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }
}
