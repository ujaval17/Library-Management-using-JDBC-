package Library.CRUD;

import Library.Connection.Connect;
import Library.Query.Query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class operation {
    Scanner sc = new Scanner(System.in);
    public void insert_op()
    {
        Connection con_insert = Connect.connection();
        System.out.println("Enter a Book_name , Author , Publisher_year");
        sc.nextLine();
        String bname = sc.nextLine();
        String aut = sc.nextLine();
        int year = sc.nextInt();
        try{
            PreparedStatement pst = con_insert.prepareStatement(Query.insert);
            pst.setString(1,bname);
            pst.setString(2,aut);
            pst.setInt(3,year);
            pst.execute();
            System.out.println("The Record is Inserted : ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }public void update_op()
    {
        Connection con_update = Connect.connection();
        System.out.println("Enter a Book_id");
        int update_id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a Book_Name");
        String update_name = sc.nextLine();
        try{
            PreparedStatement pst = con_update.prepareStatement(Query.update);
            pst.setInt(2,update_id);
            pst.setString(1,update_name);
            int affected = pst.executeUpdate();
            if(affected > 0) System.out.println("The Record is Updated : ");
            else System.out.println("Book Id not exists");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void delete_op()
    {
        Connection con_delete = Connect.connection();
        System.out.println("Enter a Book_id");
        int delete_id = sc.nextInt();
        try{

            PreparedStatement pst = con_delete.prepareStatement(Query.delete);
            pst.setInt(1,delete_id);
            int affected = pst.executeUpdate();
            if(affected > 0) System.out.println("The Record is deleted : ");
            else System.out.println("Book Id already not exists");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
