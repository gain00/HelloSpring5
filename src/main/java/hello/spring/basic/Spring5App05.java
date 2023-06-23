package hello.spring.basic;

import hello.spring.bean.Spring5App04Factory;
import hello.spring.bean.Spring5Bean03;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Spring5App05 {
    //스프링 프레임워크 첫번째 사례
    //인삿말을 한국어,영ㅇ,일본어로 출력하도록 기능 추가
    //알트 엔터 오류 변환
    public static void main(String[] args){
        BeanFactory bf = new XmlBeanFactory(
                new FileSystemResource("src/bean05.xml"));
        Spring5Bean03 bean = null;
        bean = (Spring5Bean03) bf.getBean("kor");
        bean.sayHello("스프링5");
        bean = (Spring5Bean03) bf.getBean("eng");
        bean.sayHello(" spring");
        bean = (Spring5Bean03) bf.getBean("jpn");
        bean.sayHello(" ミンスー");

    }
}
