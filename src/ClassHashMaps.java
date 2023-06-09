import java.util.HashMap;
public class ClassHashMaps {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();  //class를 사용하려면 인스턴스화

            hashMap.put("first", 1); //null,     put이라는 fuction을 사용해 value(값), key를 설정할 수 있다.
            hashMap.put("second", 2); //null
            hashMap.put("third", 3); //null
            hashMap.get("third"); //Integer@24 "3" ,   get은 값을 가져올 때 사용. 순서대로 가져오는 것이 아니라 key에 해당하는 값을 가져옴
            hashMap.size(); //3
            hashMap.put("second", 5); //Integer@33 "5"  ,  second의 값을 5로 바꿔줌
            hashMap.remove("second"); //Integer@33 "5" ,         second의 값을 삭제
            
            hashMap.keySet(); //HashMap$KeySet@40 size=2  ,  현재 들어가 있는 key 값들을 모두 볼 수 있음
                              // 0:
                              // "third"
                              // 1:
                              // "first"
            
            hashMap.values(); //HashMap$Values@52 size=2  ,   현재 들어가 있는 values 값들을 모두 볼 수 있음, **value로 들어가는 것이 class로 들어가는 구나. 그럼 value에 다른 class같은 것도 넣을 수 있구나라는 것을 알고 있자!
                              // 0:
                              // Integer@24
                              // 1:
                              // Integer@55

            hashMap.clear(); //(void),   초기화할 때 사용
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // retrun 0;
    }
}
