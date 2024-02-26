package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        // long var3 = 10000000000; //컴파일러는 기본적으로 정수 리터럴을 int로 간주해서 에러 발생
        long var4 = 10000000000L; //int 허용범위 밖의 숫자는 L(l)을 붙여 long 타입값임을 나타내야함

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
