package hello.spring.bean;

public class Spring5App04Factory {



        public static Spring5Bean03 create(String bean){
            Spring5Bean03 obj = null;
            if(bean.equals("kor")){
                obj = new Spring5Bean03Kor();
            }else  if(bean.equals("Eng")){
                obj = new Spring5Bean03Eng();
            }else  if(bean.equals("Jpn")){
                obj = new Spring5Bean03Jpn();
            }
            return obj;
    }
}
