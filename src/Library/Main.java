package Library;
import Library.CRUD.operation;
import Library.Query.Query;
import Library.Repositry.read_data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WelCome To my Library : ");
        boolean start = true;
        Scanner sc = new Scanner(System.in);
        operation op = new operation();
        while(start)
        {
            System.out.println("Enter Task To Perform \n 1.insert \n 2.update \n 3.delete \n 4.read \n 5.Search book \n 6.Exit");
            int task = sc.nextInt();
            switch (task){
                case 1:
                    op.insert_op();
                    break;
                case 2:
                    op.update_op();
                    break;
                case 3:
                    op.delete_op();
                    break;
                case 4:
                    read_data r = new read_data();
                    break;
                case 5:
                    System.out.println("Enter a Book Name : ");
                    sc.nextLine();
                    String sea_book = sc.nextLine();
                    String search = Query.check1;
                    read_data.search_data(search,sea_book);
                    break;
                case 6:
                    start = false;
                    System.out.println("Visit Again");
                    break;
            }
        }
    }
}