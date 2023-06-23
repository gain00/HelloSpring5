package hello.spring.basic;

public class Spring5App00 {
    //첫번재 사례
    //간단한 인삿말을 출력하는 프로그램 작성
    public static void main(String[] args){
        //sayHello 메서드를 호출하기위해
        //Spring5App00의 객체화 필요!
        Spring5App00 a = new Spring5App00();
        a.sayHello();
    }
    private void sayHello(){
        System.out.println("Hello World");
    }
}
