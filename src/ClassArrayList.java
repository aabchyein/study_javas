import java.util.ArrayList;

public class ClassArrayList {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3};
            
            ArrayList arrayList = new ArrayList<>(); //인스턴스화
            arrayList.add(1); //true,  값을 넣는 것은 add
            arrayList.add(2); //true
            arrayList.add(3); //true
            arrayList.size(); //3, length가 아닌 size를 사용함
            arrayList.get(2); // Integer@39 "3",   값을 빼고 싶을 때 get
            
            //int val = arrayList.get(2); //Cannot evaluate because of compilation error(s): The method get(int) in the type ArrayList is not applicable for the arguments ().

            arrayList.set(1,5); // Integer@37 "2",    1번째 자리에 있는 값을 5의 값으로 바꿔준다.
            arrayList.remove(0); // Integer@34 "1",     0번째의 데이터가 삭제되고 한칸씩 앞으로 땡겨진다.
            arrayList.clear(); //(void),   안에 있는 data를 다 삭제하고 초기화하고 싶을 때. 인스턴스는 그대로 있고 재사용할 수 있게 됨.
            // array를 처음부터 끝까지 풀어서 보고 싶을 때 for문을 사용하면 됨.

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
