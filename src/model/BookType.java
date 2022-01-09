package model;

/**
 * ͼ�����
 * @author WuGuochuan
 * @Date 2021-11-26 19:20
 */
public class BookType {
    private int id;//���
    private String bookTypeName;//ͼ���������
    private String bookTypeDesc;//ͼ���������

    public BookType() {
    }

    public BookType(String bookTypeName, String bookTypeDesc) {
        this.bookTypeName = bookTypeName;
        this.bookTypeDesc = bookTypeDesc;
    }

    public BookType(int id, String bookTypeName, String bookTypeDesc) {
        this.id = id;
        this.bookTypeName = bookTypeName;
        this.bookTypeDesc = bookTypeDesc;
    }

    public int getId() {
        return id;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public String getBookTypeDesc() {
        return bookTypeDesc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public void setBookTypeDesc(String bookTypeDesc) {
        this.bookTypeDesc = bookTypeDesc;
    }

    @Override
    public String toString() {
        return bookTypeName;
    }
}
