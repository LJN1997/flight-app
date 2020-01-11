package dao;

import entity.ShowPrice;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowPriceDaoImpl implements ShowPriceDao{

    @Override
    public List<ShowPrice> showPrice() {
        Connection connect =null;
        PreparedStatement prestat=null;
        ResultSet rs=null;
        //--创建集合
        List<ShowPrice> list = new ArrayList<>();

        try {
            //--连接数据库
             connect = JdbcUtil.createConnect();
            String sql = "SELECT SUM(f.price),f.arrival_time FROM ticket t RIGHT JOIN flight f ON t.flight_id = f.flight_id GROUP BY f.arrival_time";
            //--准备执行对象
             prestat = connect.prepareStatement(sql);
             rs = prestat.executeQuery();

             while (rs.next()){
                 //--将查询结果封装到集合中
                 ShowPrice showPrice = new ShowPrice();
                 showPrice.setName(rs.getString(2).substring(0,10));
                 showPrice.setValue(rs.getDouble(1));
                 list.add(showPrice);
             }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                //--关闭资源
                rs.close();
                prestat.close();
                connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }
}
