import java.util.Scanner;

public class CarsWithDB {
    public static void main(String[] args) {
        try {
            Scanner scanners = new Scanner(System.in);
            String workKey = "P";   //workKey에 따라서 동작여부가 결정됨
            while(!workKey.equals("E")) { //workKey가 E가 아닐 때 loop가 계속 돈다
                System.out.print("선택입력 : ");
                workKey = scanners.nextLine();   //workKey에 따라서 while loop의 동작이 결정됨.

            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
    
}
