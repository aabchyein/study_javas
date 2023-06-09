import java.sql.*;

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://localhost:3306/db_cars";
            String user = "root";
            String password = "!yojulab";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            // - query 던지기
            String query = "SELECT * FROM db_cars.factorys";
            ResultSet resultSet = statement.executeQuery(query);   //쿼리문이 실행되면 resultSet으로 결과값이 나옴.
            while(resultSet.next()){
                resultSet.getString("COMPANY_ID");
                resultSet.getString("COMPANY");
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            } //resultSet은 next를 사용하면 처음엔 첫번째row, 두번째 돌 땐 두번째row를 가리킴  

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
