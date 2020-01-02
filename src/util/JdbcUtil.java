package util;

import java.sql.*;

public class JdbcUtil {
    private static Connection conn = null;
    public static Connection createConnect() throws Exception {
        // 加载驱动类
        Class.forName("com.mysql.jdbc.Driver");
        // 用驱动管理器获取数据库连接
        String url = "jdbc:mysql://localhost:3306/testair?&useOldAliasMetadataBehavior=true&useUnicode=true&characterEncoding=utf-8";
        String user = "root";
        String password = "root";
        conn = DriverManager.getConnection(url, user, password);
        return conn;
    }


    public static void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}