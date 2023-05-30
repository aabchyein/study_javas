import java.util.Scanner; //->class이다.  외부에 있는 class인 스캐너를 사용한다는 뜻!
public class Scanners {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object, new를 써서 스캐너를 instance화 시킴. 맨 앞에 data type을 뒤랑 똑같이 맞춰줘야 하므로 외부에서 가져온 class 이름인 Scanner를 써줌
        System.out.println("Enter username");

        // String userName = myObj.nextLine();  // Read user input
        // System.out.println("Username is: " + userName);  // Output user input
        // //Scanner를 사용할 때 1,4,7을 꼭 써줘야 함
        // 문자는 nextLine();, 숫자는 nextInt();

        int first = 0;
        int second = 0;
        first = myObj.nextInt();
        second = myObj.nextInt();
        System.out.println(first + ", " +second);
        // return 0;
    }
    
}
