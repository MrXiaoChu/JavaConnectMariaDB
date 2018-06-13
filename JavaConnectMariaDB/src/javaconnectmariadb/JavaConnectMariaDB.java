package javaconnectmariadb;

/*
insert into demo01 values (1001, 'Java for dummies', 'Tan Ah Teck', 11.11, 11);
insert into demo01 values (1002, 'More Java for dummies', 'Tan Ah Teck', 22.22, 22);
insert into demo01 values (1003, 'More Java for more dummies', 'Mohammad Ali', 33.33, 33);
insert into demo01 values (1004, 'A Cup of Java', 'Kumar', 44.44, 44);
insert into demo01 values (1005, 'A Teaspoon of Java', 'Kevin Jones', 55.55, 55);
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.mariadb.jdbc.Driver;

public class JavaConnectMariaDB {

    public static void main(String[] args) {

        String DriverPath = "jdbc:mariadb://localhost:3306/demo01";
        try {

            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DriverPath, "root", null);
            Statement stmt = conn.createStatement();
            /* String sql1 = "CREATE TABLE demo01 "
                    + "(id int not NULL, "
                    + " title varchar(50), "
                    + " author varchar(50), "
                    + " price float, "
                    + "qty int,"
                    + " PRIMARY KEY ( id ))";
             */
            System.out.printf("stmt.getMaxRows() : %s\n", stmt.getMaxRows());
            System.out.printf("stmt.getConnection() : %s\n", stmt.getConnection());
            System.out.printf("stmt.getClass() : %s\n", stmt.getClass());
            System.out.printf("stmt.getFetchSize() : %s\n", stmt.getFetchSize());
            System.out.printf("stmt.getFetchDirection() : %s\n", stmt.getFetchDirection());
            System.out.printf("stmt.getQueryTimeout() : %s\n", stmt.getQueryTimeout());
            System.out.printf("stmt.getLargeMaxRows() : %s\n", stmt.getLargeMaxRows());
            System.out.printf("conn.getClientInfo() : %s\n", conn.getClientInfo());
            System.out.printf("conn.getClass() : %s\n", conn.getClass());
            System.out.printf("conn.getCatalog() : %s\n", conn.getCatalog());
            System.out.printf("conn.getSchema() : %s\n", conn.getSchema());

        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException!!");
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println("SQLException!!");
            System.out.println(ex);
        }
    }
}
