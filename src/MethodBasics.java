public class MethodBasics {
//     <access_modifier> <return_data _type> <method_name>( list_of_parameters)
// {
//     //body
// }  -> Syntax of Method

    // x에 +1 (결과값)
    public int F(int X)   // return type(return_data_type) 은 result data type과 같아야 함.(들어올 때와 나갈 때의 data type이 동일해야 함)
    {
        int result = X + 1;
        return result;
    }
       

    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 +1
            // y = F(x); //이 fuction을 가져오기 위해 2개의 class를 싸고 있는 MethodBasics class를 먼저 불러와야 함
            MethodBasics methodBasics = new MethodBasics(); // new는 class를 instance화 시킨다, 클래스 MethodBasics를 이동할 수 있게 변수 methodBasics에 넣어준 것. 이 변수의 data type은 class다. 그래서 맨 앞에 클래스 이름 넣어준 것.
            y = methodBasics.F(x);  //class 내에 있는 fuction을 의미함.

            y = y + 1; // 변수에 +1
            MethodBasics methodBasics_first = new MethodBasics();
            y = methodBasics_first.F(y); // .을 찍으면 호출, Fuction(F)에 변수인 y가 넘어가는 것이 아니라 값인 0이 넘어감.-> F(0) 과 같은 의미
            y = methodBasics_first.F(y); // .을 찍으면 호출, Fuction(F)에 변수인 y가 넘어가는 것이 아니라 값인 0이 넘어감.-> F(0) 과 같은 의미
           

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }    
}
