package hello.spring.basic;

import hello.spring.bean.*;

public class Spring5App03 {
    //4번째 사례
    //

    public static void main(String[] args){
        Spring5Bean03 spring5Bean03 = null;

        spring5Bean03 = new Spring5Bean03Eng();
        spring5Bean03.sayHello(" minsu");
        spring5Bean03 = new Spring5Bean03Kor();
        spring5Bean03.sayHello(" 민수");
        spring5Bean03 = new Spring5Bean03Jpn();
        spring5Bean03.sayHello(" ミンスー");

    }
}
