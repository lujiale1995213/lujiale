import java.sql.*;

public class Demo_07 {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.创建连接对象
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/day_24", "root", "root");
            //3.定义sql语句
            String sql = "insert into user values (null,'宋江','568')";
            //4.创建执行sql对象
            st = con.createStatement();
            //5.执行sql
            int i = st.executeUpdate(sql);
            //6.输出结果
            System.out.println(i);
            if (i > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
