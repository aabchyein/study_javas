public class Breaks {
    public static void main(String[] args) {
        // Try Catch문 사용
        try {
            // break문에 대한 사용법 알기
            for (int first = 0; first < 4; first=first+1) {
                if (first == 2) {   // first값이 2이면 for문 종료
                    break;
                }
                //first=2일 때 밖으로 나오고 싶을 때 if,break 써서 만들어줌.
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
            //catch와 finally 사이의 print는 확인을 위해 넣어준 것 뿐임.
        }
        System.out.println();
        // return 0;
    }
}
