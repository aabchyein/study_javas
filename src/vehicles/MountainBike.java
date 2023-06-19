package vehicles;

public class MountainBike extends Bicycle {  // extends Bicycle (= Bicycle class를 상속 받는다는 의미 - bicycle의 모든 기능을 포함하고 있다고 생각하면 된다.)
    int seatHight;
    public MountainBike() {

    }
    public MountainBike(int price, String color, int seatHight) {
        this.seatHight = seatHight;   // class 내부변수인 seatHight는 this를 사용
        super.price = price;    // 상속받은 class 변수를 그대로 사용할 때는 super를 사용. 이미 상속받아서 이 class 안에도 포함되는 것이므로 this로 써도 동작됨
        super.color = color;
    }

    public String toString() {  // Bicycle의 메서드를 그대로 쓸 것이 아니라 재정의(즉 덮어쓰려고 하는 것), 그럼 맨 마지막 정의된 것이 실행됨.
        String str = "price : " + super.price + ", color : "+ super.color + ", seatHight : " + this.seatHight;  // super라고 안쓰고 this.price, this.color 그대로 써도 무방함.
        return str;
    }
}