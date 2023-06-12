import java.sql.*;

import cars.FactoryDMLs;

public class ConnectDBsWithMethod {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            FactoryDMLs factoryDMLs = new FactoryDMLs(); //FactoryDMLs class를 사용하기 위해 인스턴스화
            ResultSet resultSet = factoryDMLs.selectStatements(statement, query); //fuction을 사용하는 부분, factoryDMLSs.SelectStatements(statemtment, query)는 factioryDMLs를 호출해서 fuction안의 SelectStatements변수를 사용하겠다는 뜻.(변수 이름이 달라도 값은 그대로 전달됨)
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }

            // SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = statement.executeQuery(query);
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }

            /*
            INSERT INTO factorys
            (COMPANY_ID, COMPANY) 
            VALUE 
            ('CAR-01', 'AUDI');
            */
            String companyId = "CAR-01";
            String company = "AUDI" ;
            query = "INSERT INTO factorys " +
                    "(COMPANY_ID, COMPANY) " +
                    " VALUE " +
                    "('"+companyId+"', '"+company+"') ";
            
            int count = factoryDMLs.insertStatements(statement, query);
            System.out.println();
            statement.close();
            connection.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } finally {

        }
        System.out.println();
    }
}