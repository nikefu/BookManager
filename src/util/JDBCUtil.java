package util;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * ���ݿ⹤����
 * @author WuGuochuan
 * @Date 2021-11-25 11:16
 */
public class JDBCUtil {
    /**
     *@Description: ��ȡ���ݿ�����
     *@Author: WuGuochuan
     *@Date: 2021/11/25 12:06
     **/
    private static DataSource source;

    static {
        try {
            Properties props = new Properties();
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
            props.load(is);
            source = DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Connection getConnection() throws Exception {
        Connection conn = source.getConnection();
        return conn;
    }



    /**
     *@Description: �ر����ݿ�����
     *@Author: WuGuochuan
     *@Date: 2021/11/25 12:10
     **/
    public void closeCon(Connection con)throws Exception{
        if(con!=null){
            con.close();
        }
    }
}
