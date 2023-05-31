import javax.management.relation.RoleUnresolvedList;
import java.util.Scanner;

public class MethodsIfs {
    public String times(int time) {
        String str ="";
        try {
                if (time < 12) {
            str = "오전입니다.";
        } else if (time < 18) {
            str = "오후입니다.";
        } else if (time <25) {
            str = "밤입니다.";
        }
        return str;
        } catch (Exception e) {
            // TODO: handle exception
        }
    
    }

    public static void main(String[] args) {
        try {
            
            int time = 0;
        Scanner myObj = new Scanner(System.in);
        while (time < 25){
            MethodsIfs methodsifs = new MethodsIfs();
            time = myObj.nextInt();
            String result = methodsifs.times(time);
            System.out.println(result);
        }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        
        // return 0;
    }
}
