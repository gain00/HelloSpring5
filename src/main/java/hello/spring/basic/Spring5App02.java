package hello.spring.basic;

import hello.spring.bean.Spring5Bean02;

public class Spring5App02 {
    //3번째 사례
    //인삿말을 한국어,영어,일본어로 출력하도록 기능 추가

    public static void main(String[] args){
        Spring5Bean02 spring5Bean02 = new Spring5Bean02();
        spring5Bean02.sayHelloEng(" minsu");
        spring5Bean02.sayHelloJpn(" ミンスー");
        spring5Bean02.sayHelloKor(" 민수");
    }
}
