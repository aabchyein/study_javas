import java.util.ArrayList;
import java.util.HashMap;
// refer : https://www.w3schools.com/java/java_foreach_loop.asp
public class LoopForEachs {
    public static void main(String[] args) {
        //묶음 class인 array, ArrayList, HashMaps 
        //For-Each Loop는 array, ArrayList일 때 사용가능
        //HashMaps는 loop로 돌리고 싶다면 values 혹은 keyset 둘 중 하나만 가져오면 가능함 
   
        try {
            ArrayList<String> cars = new ArrayList<String>();  // 이 class에 문자, 숫자, HashMaps 등 어떤 것이든 들어갈 수 있음. 코드 유지, 보수에 좋지 않음. -> 그래서 제너릭을 해줘야 함<>
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");

        // for (type variableName : arrayName) {
        //     // code block to be executed
        //   }
            for (String car:cars){                          //제너릭을 해주지 않으면 cars에 type mismatch 오류가 나타남.
                System.out.println(car);
            }
            //cars에 있는 값이 순서대로 하나씩 튀어나옴, arrayname을 오른쪽에 써주고
            //왼쪽에는 튀어나오는 값의 type과 for문 내에서 사용할 변수 이름을 써준다.
            //for문이 이터레이터 방식.
            //**이터레이터? for 반복문을 이용하여 리스트 안의 요소들에 대해 반복할 수 있다/ 

            //------------------------------------------------------------------------
            // Automobile Company       Vehicle Names
            ArrayList<HashMap> carList = new ArrayList<HashMap>();  //ArrayList에 넣어주려고 하는것이 HashMap을 제너릭해줌
            HashMap<String, String> carSpec = new HashMap<String, String>();  // HashMap에 제너릭 해줌
            carSpec.put("CarCompany", "Ford");
            carSpec.put("CarName", "Mustang");
            carSpec.put("Year", "2022");
            carList.add(carSpec);
            //column별로 HashMaps으로 묶고 그걸 ArrayList에 넣어준다. 이렇게 하면 첫번째 레코드 완성. 밑에 2,3번째 레코드도 작성
            //ArrayList에는 HashMap이 들어있다.

            carSpec = new HashMap<String, String>();    //인스턴스를 하면 메모리에 버킷이 만들어져서 변수 이름이 붙는 것. 처음에만 인스턴스 하고 뒤에 안 해주면 처음 그 버킷을 계속 사용하는 것이라서 새로운 공간을 마련해줘야 첫번째 값도 유지되고 두번째 값도 담을 수 있다.
            carSpec.put("CarCompany", "Toyota");
            carSpec.put("CarName", "Camry");
            carSpec.put("Year", "2021");
            carList.add(carSpec);

            carSpec = new HashMap<String, String>();    //새로운 공간을 마련해줘야 첫번째 값도 유지되고 두번째 값도 담을 수 있다. 1,2번째와 변수 이름은 같지만 새롭게 공간이 생성됨.
            carSpec.put("CarCompany", "Chevrolet");
            carSpec.put("CarName", "Silverado");
            carSpec.put("Year", "2023");
            carList.add(carSpec);
            // key, value로 묶어서 써줘야 table 모양이 형성됨

            // For-Each Loop를 사용해서 table을 출력해보기, HashMap의 값을 가져올 때 get을 사용하고 key를 입력해주면 연결된 값을 가져옴.
            for(HashMap<String, String> car: carList){
                System.out.println(car.get("CarCompany") + car.get("CarName") + car.get("Year"));
            }
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
