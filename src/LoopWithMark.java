public class LoopWithMark {
    public static void main(String[] args) {

        for (int row=1; row<5; row = row + 1) {
            System.out.println("for"+ row);
        }
        // return 0;
        System.out.println("end");
    }
}