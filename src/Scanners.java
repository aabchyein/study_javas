import java.util.Scanner; //->class이다.  외부에 있는 class인 스캐너를 사용한다는 뜻! java폴더 안에 util 이라는 폴더 안에 scanner라는 클래스 파일이 들어있는 것이다.
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
        myObj.close(); //스캐너 생성시 파라미터로 값을 넘기는데 키보드 입력의 경우 close를 해주지 않아도 별 상관 없지만, 리소스를 사용하는 경우는 되도록 close 해주는 습관을 들이는 것이 좋다.
        // return 0;
    }
    
}
