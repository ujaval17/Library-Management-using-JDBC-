package Library.Query;

public class Query {
    public static String insert = "Insert into book_ceil_1 (Book_name,Author,Publisher_year) values (?,?,?)";
    public static String update = "update book_ceil_1 set Book_name = ? where Book_id = ?";
    public static String delete = "delete from book_ceil_1 where Book_id = ?";
    public static String select = "select * from book_ceil_1 order by Publisher_year desc";
    public static String check1 = "select * from book_ceil_1 where Book_Name Like ?";
}
