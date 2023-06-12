package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FactoryDMLs {
    // 메소드 만들기
    public ResultSet selectStatements(Statement statement, String query) throws SQLException {   //결과값을 resultset으로 내뱉음. 숫자가 아니어도 확장성으로 인해 resultset을 결과값으로 내뱉을 수 있다. parameter 써줄 때 타입도 중요하므로 타입도 같이 꼭 써준다.
        ResultSet resultSet = statement.executeQuery(query);  //executeQuery는 resultset 겂울 변환하며 select구문 수행할 때 사용함.
        return resultSet;
    }

    //insert - fuction 만들기
    public int insertStatements(Statement statement, String query) throws SQLException {
        int count = statement.executeUpdate(query);
        return count;

    }
}


// fuction을 만들 때 들어가는 값과 나오는 값을 먼저 생각하고 내부적으로 들어가자 
// throws SQLException을 try catch문 대신 사용해서 에러 없애줌. throws SQLException은 에러 발생했을 때 자신을 호출한 곳에 던져서 거기서 처리하게 만드는 것.
// 한정적인 컴퓨터 자원을 재활용하기 위해 메소드를 써주는 것이다. 그래서 현업에서는 메소드를 많이 쓴다.