import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in); // Create a Scanner object
            System.out.println("선택에 따라 안내글을 보여드립니다.");
            System.out.println("----- 작동 key -----");
            System.out.println("(E)xit : 종료");
            System.out.println("(P)oll : 설문 시작");
            System.out.println("(S)tatistic : 설문 통계");


            String answer = "";
            boolean loops = true;
            while (loops) {
                System.out.println("Exit:종료 Poll:설문 시작 Statistic:설문 통계");
                answer = myObj.nextLine();
                if (answer.equals("Exit")||answer.equals("E")) { // '||'표시는 or이라는 표시로 계속 다른 것도 더해서 사용할 수 있음
                    System.out.println("-----설문 종료-----");
                    break;
                }   else if (answer.equals("Poll")||answer.equals("P")) {
                    System.out.println("-----설문 시작-----");
                }   else if (answer.equals("Statistic")||answer.equals("S")) {
                    System.out.println("-----설문 통계-----");
                }
        }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
        // return 0;
    }
}
