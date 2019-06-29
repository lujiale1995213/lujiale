import java.sql.*;

public class Demo_01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接对象j
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day_24", "root", "root");
        //3定义sql语句
        String sql = "update user set password = '456' where id = 1 ";
        //4.获得Statement对象
        Statement statement = con.createStatement();
        //5.执行
        int i = statement.executeUpdate(sql);
        //6.处理结果
        System.out.println(i);
        //释放资源
        statement.close();
        con.close();
    }
}
