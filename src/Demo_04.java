import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_04 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接对象
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/day_24", "root", "root");
        //3.定义sql语句
        String sql = "update user set name='李萌' where id = 2";
        //4.获取执行sql对象
        Statement stmt = con.createStatement();
        //5.执行sql
        int i = stmt.executeUpdate(sql);
        //6.输出结果
        System.out.println(i);
        //释放资源
        stmt.close();
        con.close();
    }
}
