package cases;
import java.util.Scanner;

public class CasherFor {
    public static void main(String[] args) {
        try {
            // 장바구니엔 5가지만 담게 선언
            String bucket_1 = "";
            String bucket_2 = "";
            String bucket_3 = "";
            String bucket_4 = "";
            String bucket_5 = "";
            int[] bucket = {0, 0, 0, 0, 0};

            System.out.println("---계산 시작---");
            Scanner myObj = new Scanner(System.in); // Create a Scanner object
            for (int first = 0; first < bucket.length; first = first + 1) {
                bucket[first] = myObj.nextInt();
                if (bucket[first] == 0) {
                    System.out.println((first+1) + "번째 가격");
                    break;
                } else if (bucket[first] >= 100) {
                    System.out.println((first+1) + "번째 가격: " + bucket[first]);
                    bucket[first] = 0;
                } else if (bucket[first] <100) {
                    System.out.println((first+1) + "번째 가격: " + bucket[first]);
                }

            }
           
            System.out.println();
            System.out.println("---담은 총합---");
            System.out.println("합계 : " + (bucket[0]+bucket[1]+bucket[2]+bucket[3]+bucket[4]));
            System.out.println("");
            System.out.println("---계산 종료---");


            

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
        // return 0;
    }
}
