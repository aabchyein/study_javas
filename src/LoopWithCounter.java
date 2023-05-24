public class LoopWithCounter {
    public static void main(String[] args) {
        int recall = 5;
        int figure = 1;
        int line = 1;

        while (line <= recall) {
            System.out.println(figure);
            line = line + 1;
            figure = figure +1;
        }

        // return 0;
    }
    
}
