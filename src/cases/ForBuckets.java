package cases;
import java.util.Scanner;

public class ForBuckets {
    public static void main(String[] args) {
        try {
            // 장바구니 3가지만 담게 선언
            String bucket_1 = "";
            String bucket_2 = "";
            String bucket_3 = "";

            Scanner myObj = new Scanner(System.in); // Create a Scanner object
            System.out.print("1번째 담기");
            bucket_1 = myObj.nextLine(); // Read user input
            System.out.print("2번째 담기");
            bucket_2 = myObj.nextLine(); // Read user input
            System.out.print("3번째 담기");
            bucket_3 = myObj.nextLine(); // Read user input
                    // 변수를 bucket으로 묶어서 담으면 되겠다->array 사용!
                    // bucket을 3번 돌려야 하니까 +1씩 증가하는 정해진 숫자를 반복하므로 ->for문 사용하면 되겠구나!

            System.out.println("--- 담은 내용물 ---");
            System.out.print(bucket_1 + ",");
            System.out.print(bucket_2 + ",");
            System.out.print(bucket_3 + "");


        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
        // return 0;
    }
}
