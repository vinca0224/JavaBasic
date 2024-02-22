package ch01.sec11; //패키지 선언
//소스파일은 src폴더에, 바이트코드파일은 bin 파일에 저장

public class Hello { //클래스 선언, 클래스명은 소스파일명과 완전히 동일

//  행주석은 //부터 행 끝까지 주석처리
/*  범위주석은 사이에 있는 내용을 모두 주석처리 
    줄을 바꿔도 유효*/
/** 도큐먼트 주석은 범위주석가 비슷하게 작동하고, API 도큐먼트를 생성하는 데 사용 */
//  주석 코드는 문자열("") 내부에 작성할 수 없다

    public static void main(String[] args) {
        System.out.println("Hello, Java"); //실행문의 끝에는 반드시 세미콜론(;)을 붙여야 한다.
    }
}
