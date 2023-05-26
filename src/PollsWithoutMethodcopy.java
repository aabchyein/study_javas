import java.util.Scanner;

public class PollsWithoutMethodcopy {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String[] answers = {"1","2","3","4"};
        String[][] polls = {{"1. 문항"}, 
        {"(1) 답항", "(2) 답항", "(3) 답항", "(4) 답항"},
        {"2. 문항"},
        {"(1) 답항", "(2) 답항", "(3) 답항", "(4) 답항"},
        {"3. 문항"},
        {"(1) 답항", "(2) 답항", "(3) 답항", "(4) 답항"},
        {"4. 문항"},
        {"(1) 답항", "(2) 답항", "(3) 답항", "(4) 답항"}
        };

        System.out.println("1. 문항");
        System.out.println("(1) 답항"+"(2) 답항"+"(3) 답항"+"(4) 답항");
        answers[0] = myObj.nextLine();
        
        System.out.println("2. 문항");
        System.out.println("(1) 답항"+"(2) 답항"+"(3) 답항"+"(4) 답항");
        answers[1] = myObj.nextLine();

        System.out.println("3. 문항");
        System.out.println("(1) 답항"+"(2) 답항"+"(3) 답항"+"(4) 답항");
        answers[2] = myObj.nextLine();

        System.out.println("4. 문항");
        System.out.println("(1) 답항"+"(2) 답항"+"(3) 답항"+"(4) 답항");
        answers[3] = myObj.nextLine();

        for (int second = 0; second < polls.length; second = second + 1) {

        }
        for (int first=0; first < answers.length; first=first+1) {
            System.out.print(answers[first]+", ");
        }
        System.out.println();
        // return 0;
    }
}
// PollsWithoutMethod를 풀어놓은 것.