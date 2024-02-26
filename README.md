# JacaBasic
자바 기초 다지기

교재 : [이것이 자바다- 개정판](https://www.google.co.kr/books/edition/%EC%9D%B4%EA%B2%83%EC%9D%B4_%EC%9E%90%EB%B0%94%EB%8B%A4_%EA%B0%9C%EC%A0%95%ED%8C%90/SLWGEAAAQBAJ?hl=ko&gbpv=0)

약 한 달동안 배웠던 자바 기초 문법과 개념들을 복기하기 위하여 작성하게 되었습니다.

기초 문법과 개념들, 그리고 교재 내의 예제들을 위주로 작성할 예정입니다. 

##chapter 01. 자바의 특징
- 자바의 특징
    - 객체지향 언어, 메모리 자동정리, 모든 운영체제에서 사용가능
- [JDK? JRE? JavaSE?](https://jindream6128.tistory.com/54)
    - JDK : 자바 개발 도구, JRE : 자바 실행 환경, JavaSE : 자바 문법을 정의하는 청사진
- 자바 컴파일과정
    - (1) 자바언어로 개발자가 자바소스파일(.java)을 작성
    - (2) 소스파일 작성 후 컴파일하여 바이트코드파일(.class) 생성
    - (3) 바이트코드파일을 JVM을 통하여 기계어로 번역시켜 실행
    - 다른 OS에서 작성하였더라도 운영체제에 맞는 JVM을 설치했다면 자바 파일을 읽어낼 수 있다.
- 패키지는 소스파일과 바이트 파일을 관리하기위한 디렉토리

##chapter 02. 변수와 타입
- 변수란 하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름
- 