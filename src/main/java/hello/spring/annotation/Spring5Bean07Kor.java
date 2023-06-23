package hello.spring.annotation;

import hello.spring.bean.Spring5Bean03;
import org.springframework.stereotype.Component;

@Component("kor")
public class Spring5Bean07Kor implements Spring5Bean03 {
    public void sayHello(String a){

        System.out.println("안녕하세요"+a);
    }


}
