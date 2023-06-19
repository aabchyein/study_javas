package vehicles;

import java.util.HashMap;

public class Bicycle {  // 아무것도 적혀 있지 않으면 상속받은게 없는 것이 아니라 가장 최상위인 Object가 상속되는 것이다.
    int price ;
    String color ;
    HashMap<String, Object> spec ;
    public Bicycle() { // 비어있는 생성자
        System.out.println("Bycicle - param empty");
    }
    public Bicycle(int price, String color) { // parameter가 들어간 생성자(=변수가 들어가 있는 생성자)(생성자 - 리턴값이 없음, class이름과 동일해야 함)
        this.price = price;   // 왼쪽은 class 내에 있는 변수인 price, 오른쪽은 parameter로 넘어온 price
        this.color = color;
    }
    public String toString() { // method 만듦(리턴값의 data type은 String)
        String str = "price : " + this.price + ", color : "+ this.color;
        return str;
    }
}