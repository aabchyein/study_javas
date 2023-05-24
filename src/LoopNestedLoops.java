public class LoopNestedLoops {
    public static void main(String[] args) {

        for (int first = 1; first < 5; first = first + 1) {
            System.out.println("for " +  first);
            for (int second=1; second  <= 4; second = second + 1) {
                if (second <= first) {
                    System.out.print("_?");
                    }
                    else {
                        break;
                    }
                }
                System.out.println();
            }
            System.out.println("end");


            //if문을 쓰지 않은 경우
            for (int first = 1; first < 5; first = first + 1) {
                System.out.println("for " +  first);
                for (int second=1; second  <= 4; second = second + 1) {
                    if (second <= first) {
                        System.out.print("_?");
                        }
                        else {
                            break;
                        }
                    }
                    System.out.println();
                }
                System.out.println("end");
        // return 0;
    }
}
