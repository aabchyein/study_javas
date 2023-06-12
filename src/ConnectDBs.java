import java.sql.*;  //패키지 이름(안에 class들이 들어있다.)

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";  //java db connet를 mysql로 한다, localhost는 내가 지금 사용하고 있는 컴퓨터, 3306은 포트를 의미함. 원격으로 db_car를 접속할 수 있는 규칙을 나열한 것이라고 생각하면 됨.
            String user = "root";
            String password = "!yojulab";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            // - query 작성
            String query = "SELECT * FROM db_cars.factorys";
            ResultSet resultSet = statement.executeQuery(query);   //쿼리문이 실행되면 데이터가 테이블 형식으로 되어있는데 테이블 형식으로 값이 resultSet 안으로 들어가는 것이다.(insert,update,delet는 테이블 형태가 아니고 select문만 결과값이 테이블 형태로 나옴)
            while(resultSet.next()){
                resultSet.getString("COMPANY_ID");
                resultSet.getString("COMPANY");
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            } //resultSet인터페이스는 next 메소드를 가지고 있다. 이 메소드는 커서를  다음 행으로 보내는 역할을 하고 타입은 boolean타입이다.(다음으로 이동할 행이 있으면 true, 없으면 flase), next가 있기 때문에 while문을 굳이 써줄 필요는 없지만 우리는 그냥 써주기로 한다.

            // 쿼리 작성1. SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = statement.executeQuery(query);
            int totalCount = 0;
            while(resultSet.next()){
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }

            /*
            쿼리 작성2. INSERT문 
            INSERT INTO factorys
            (COMPANY_ID, COMPANY)
            VALUE
            ('CAR-01', 'AUDI');
            */
            String company_Id = "CAR-01";
            String company = "AUDI" ;
            query = "INSERT INTO factorys " +
                    "(COMPANY_ID, COMPANY) " +
                    " VALUE " +
                    "('"+company_Id+"', '"+company+"') ";
            
            int count = statement.executeUpdate(query);
            System.out.println(count);
            //update, delete, insert문은 결과값이 없으므로 즉 table로 결과값을 받을 필요가 없으므로 executeUpdate를 사용한다.

            /*
            쿼리 작성3. update문
            update factorys
            SET COMPANY = '페라리'
            WHERE COMPANY_ID = 'CAR-01';
            */
            company_Id = "CAR-01";
            company = "페라리";
            query = "update factorys " +
                    "SET COMPANY = '"+company+"' " +
                    "WHERE COMPANY_ID = '"+company_Id+"'" ;
            count = statement.executeUpdate(query);

            /*
            쿼리 작성4. DELETE문
            DELETE FROM factorys
            WHERE COMPANY_ID = 'CAR-01';
             */
            company_Id = "CAR-01";
            query = "DELETE FROM factorys " +
                    "WHERE " +
                    "COMPANY_ID = '"+company_Id+"' ";
            count = statement.executeUpdate(query);


            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());  //에러 내용을 볼 수 있음
        }
        System.out.println();
    }
}
