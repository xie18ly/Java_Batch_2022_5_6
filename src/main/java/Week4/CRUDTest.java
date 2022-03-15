package Week4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDTest {

    Connection con = null;
    Statement statement = null;

    public CRUDTest(){

    }

    public void doTest() throws SQLException {
        try{
            con = Database.getInstance().getConnection();
            statement = con.createStatement();
            //test insert
            System.out.println("---------insert one record-----------");
            String sqlInsert = "insert into employee" +
                    " values ('John', 1000, 'john@gmail.com')";
            int countInsert = statement.executeUpdate(sqlInsert);
            System.out.println(countInsert + " records are inserted");
            //test delete
            String sqlDelete = "delete from employee where name = 'Kirby'";
            int countDelete = statement.executeUpdate(sqlDelete);
            System.out.println(countInsert + " records are deleted");
            //test update
            String strUpdate = "update employee set salary = salary * 2 where email = 'john@gmail.com'";
            System.out.println("The sql query is " + strUpdate);
            System.out.println();
            int countUpdate = statement.executeUpdate(strUpdate);
            System.out.println(countUpdate + " records are updated");
            //get result
            con.commit();
            String sqlSelect = "select * from employee";
            ResultSet result = statement.executeQuery(sqlSelect);
            //process the result
            while(result.next()){
                String name = result.getString("name");
                int salary = result.getInt("salary");
                String email = result.getString("email");
                System.out.println(name + ", " + salary + ", " + email);
            }
        } catch(SQLException e){
            con.rollback();
            e.printStackTrace();
        //close the statement and connection to free up resources
        } finally{
            try{
                if(statement != null) statement.close();
                if(con != null) con.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
