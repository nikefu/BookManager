package util;

/**
 * �ַ���������
 * @author WuGuochuan
 * @Date 2021-11-25 17:03
 */
public class StringUtil{
    /**
    *@Description: �ж��Ƿ�Ϊ��  Ϊ�շ���true
        *@Author: WuGuochuan
        *@Date: 2021/11/25 17:09
     **/
    public static boolean isEmpty(String str){
        if(str==null||"".equals(str.trim())) {
            return true;
        }else {
            return false;
        }
    }

  /**
  *@Description: �ж��Ƿ�Ϊ��   ��Ϊ�շ���true
      *@Author: WuGuochuan
      *@Date: 2021/11/25 17:09
   **/
    public static boolean isNotEmpty(String str) {
        if(str!=null&&"".equals(str.trim())) {
            return true;
        }else {
            return false;
        }
    }


}
