import cases.ClassSeconds;

public class ClassMains {
    public static void main(String[] args) {
        try {
            ClassFirsts classFirsts = new ClassFirsts();    // no parameter, class만 return함
            ClassFirsts classFirstsWithVar = new ClassFirsts(5);    // one parameter
            int second = classFirstsWithVar.getSecond();
            ClassSeconds classSeconds = new ClassSeconds(6);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
