import java.time.Year;

public class Methods {
    // <access_modifier> <return_data _type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public int minus(int first, int second) {   // add라는 영역을 벗어났기 때문에 변수 first, second 다시 사용가능.
        int result = 0;
        try {
            result = first - second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    public int add(int first, int second) {
        int result = 0;
        try {
            result = first + second;

        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    public static void main(String[] args) {
        // - 인스턴스는 1회
        // - 초기 값은 2를 넘지 않음
        // - main 결과값은 17
        int first = 2;
        int second = 1;
        int y = 0;
        try {
        Methods method = new Methods();
        y = y + method.add(first, second);
        y = y + method.add(first, second);
        y = y + method.add(first, second);
        y = y + method.add(first, second);
        y = y + method.add(first, second);
        y = y + method.minus(first, second);
        y = y + method.minus(first, second);
        System.out.println("y의 값 : " + y);
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
    }
