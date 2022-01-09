package dao;

import model.BookType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * ͼ�����DAO��
 * @author WuGuochuan
 * @Date 2021-11-26 19:23
 */
public class BookTypeDao {
    /**
    *@Description: ͼ��������   ���ز������ݵ�����
        *@Author: WuGuochuan
        *@Date: 2021/11/26 19:25
     **/
    public int add(Connection con, BookType bookType)throws Exception{
        String sql="insert into t_bookType values(null,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, bookType.getBookTypeName());
        ps.setString(2, bookType.getBookTypeDesc());

        return ps.executeUpdate();
    }
    /**
    *@Description: ��ѯͼ�����
        *@Author: WuGuochuan
        *@Date: 2021/11/26 21:51
     **/
    public ResultSet list(Connection con,BookType bookType)throws Exception{
        StringBuffer sb=new StringBuffer("select * from t_bookType");
        if(bookType.getBookTypeName()!=null){
            sb.append(" and bookTypeName like '%"+bookType.getBookTypeName()+"%'");
        }
        PreparedStatement pstmt=con.prepareStatement(sb.toString().replaceFirst("and", "where"));
        return pstmt.executeQuery();
    }

    /**
    *@Description: ɾ��ͼ�����
        *@Author: WuGuochuan
        *@Date: 2021/11/27 11:56
     **/
    public int delete(Connection con,String id)throws Exception {
        String sql="delete from t_bookType where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        return ps.executeUpdate();
    }
/**
*@Description: �޸�ͼ�����
    *@Author: WuGuochuan
    *@Date: 2021/11/27 12:09
 **/
    public int update(Connection con, BookType bookType) throws Exception {
        String sql="update t_bookType set bookTypeName=?,bookTypeDesc=? where id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, bookType.getBookTypeName());
        ps.setString(2, bookType.getBookTypeDesc());
        ps.setInt(3, bookType.getId());
        return ps.executeUpdate();
        
    }
}
