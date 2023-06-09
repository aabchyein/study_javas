public class StringClasses {
    public static void main(String[] args) {
        try {
            String name = "Hye In Kim";
            String name_second = new String("Friend Jane !") ; // 생성자
            // String을 위와 아래처럼 초기화하는 방식 둘 다 같다

            name.equalsIgnoreCase("Hye In Kim"); //true
            name.equalsIgnoreCase("Hye In"); //false
            name_second.equals("Friend Jane !"); //true
            name_second.length(); //13

            name_second.replaceAll("e","a"); //"Friand Jana !"
            name_second = name_second.replaceAll("e","a"); //"Friand Jana !"

            name_second.split(" "); //String[3]@35
            String[] arrays = name_second.split(" "); //String[3]@40
            // @가 붙었으니 class로 값이 나옴. String뒤에 [] 가 나온다는 것은 array라는 것을 의미함.
            // split을 사용해 값을 잘라내서 그 일부분을 사용할 수 있게 해주는 방법

            name_second.substring(3,11); //"and Jana"  표시만 되는 것이라 바꿔주려면 아래까지 진행해줘야 함
            String name_substring = name_second.substring(3,11); //"and Jana"  위에서는 표시만 되는 것이라 변수로 지정까지 해줘야 끝나는 것임
            //substring을 사용해서 "Friend Jane !"을잘라내보자. Fri, end Jane! 이렇게 두 부분으로. 0부터 글자수를 세서 잘라낼 수 있다.
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}
