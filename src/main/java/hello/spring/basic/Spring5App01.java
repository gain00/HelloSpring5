package hello.spring.basic;

import hello.spring.bean.Spring5Bean01;

public class Spring5App01 {
    //두번째 사례
    // sayHello메서드를 외부 클래스로 옮기고
    // 인삿말을 출력하는 기능을 구현했음
    // 즉, 인삿말을 출력하려면 외부 클래스를
    // 객체화한 뒤 sayHello 메서드를 호출해야 함
    public static void main(String[] args){
        //호출할 클래스명 변수명 = new 호출할클래스명();
        Spring5Bean01 spring5Bean01 = new Spring5Bean01();
        spring5Bean01.sayHello("하이");

    }
}
