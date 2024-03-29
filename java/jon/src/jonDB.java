
import java.util.Scanner;

public class jonDB {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int choose;
    System.out.println("[1]Manage Customers\n[2]Manage Books\n[3]Manage Transactions");
    choose = input.nextInt();
    switch (choose) {
      case 1:
        Customers customer = new Customers();
        System.out.println(
                "[1]View All Customers\n[2]Add a Customer\n[3]Update Customer Info\n[4]Delete Customer Info");
        choose = input.nextInt();
        if (choose == 1) {
          customer.showRecords();
        } else if (choose == 2) {
          customer.insertRecord();
        } else if (choose == 3) {
          customer.updateRecord();
        } else if (choose == 4) {
          customer.deleteRecord();
        }
        break;

      case 2:
        Books books = new Books();
        System.out.println(
                "[1]View All Books\n[2]Add a Books Info\n[3]Update Existing Book Info\n[4]Delete Book Info");
        choose = input.nextInt();
        if (choose == 1) {
          books.showRecords();
        } else if (choose == 2) {
          books.insertRecord();
        } else if (choose == 3) {
          books.updateRecord();
        } else if (choose == 4) {
          books.deleteRecord();
        }
        break;
      case 3:
        Transactions transactions = new Transactions();
        System.out.println(
                "[1]View All Transactions\n[2]Add new Transaction\n[3]Update Existing Transaction");
        choose = input.nextInt();
        if (choose == 1) {
          transactions.showRecords();
        } else if (choose == 2) {
          transactions.insertRecord();
        } else if (choose == 3) {
          transactions.updateRecord();
        }
        break;
    }
  }
}
