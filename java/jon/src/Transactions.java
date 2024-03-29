
import java.sql.*;
import javax.swing.JOptionPane;

public class Transactions {

  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost:3306/jon";
  static final String USER = "root";
  static final String PASS = "";
  static final String QUERY = "SELECT customer_id, accession_num, transaction_date, remarks FROM transactions";

  Connection con;
  Statement stmt;
  ResultSet rs;

  public void setConnection() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jon", "root", "");

      stmt = con.createStatement();
      JOptionPane.showMessageDialog(null, "Connected to the database JON successfully.");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public void showRecords() {
    try {
      con = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = con.createStatement();
      rs = stmt.executeQuery("SELECT * from transactions");
      while (rs.next()) {
        System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
      }
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void insertRecord() {
    int customer_id, accession_num;
    String transaction_date, remarks;
    try {
      con = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = con.createStatement();
      java.util.Scanner intinput = new java.util.Scanner(System.in);
      java.util.Scanner strinput = new java.util.Scanner(System.in);
      System.out.print("Enter customer ID: ");
      customer_id = intinput.nextInt();
      System.out.print("Enter the book accession number: ");
      accession_num = intinput.nextInt();
      System.out.print("Enter the transaction date: ");
      transaction_date = strinput.nextLine();
      System.out.print("Enter remarks: ");
      remarks = strinput.nextLine();

      String SQL = "INSERT INTO transactions(customer_id, accession_num, transaction_date, remarks) "
                 + "VALUES (" + customer_id + "," + accession_num + ",'" + transaction_date + "','" + remarks + "')";

      stmt.executeUpdate(SQL);
      JOptionPane.showMessageDialog(null, "Transaction added successfully.");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void updateRecord() {
    int customer_id, choice;
    String transaction_date, remarks, SQL = "";
    try {
      con = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = con.createStatement();
      java.util.Scanner intinput = new java.util.Scanner(System.in);
      java.util.Scanner strinput = new java.util.Scanner(System.in);
      System.out.print("Enter the customer ID you want to update transaction: ");
      customer_id = intinput.nextInt();
      System.out.println("Which among the fields would you like to update: ");
      System.out.print("1. Transaction Date\n2. Remarks\nEnter the number of your choice here: ");
      choice = intinput.nextInt();

      if (choice == 1) {
        System.out.print("Enter the new Transaction Date: ");
        transaction_date = strinput.nextLine();

        SQL = "UPDATE transactions "
            + "SET transaction_date = '" + transaction_date + "' "
            + "WHERE customer_id = " + customer_id;

      } else if (choice == 2) {
        System.out.print("Enter the new remarks: ");
        remarks = strinput.nextLine();

        SQL = "UPDATE transactions "
            + "SET remarks = '" + remarks + "' "
            + "WHERE customer_id = " + customer_id;
      }

      stmt.executeUpdate(SQL);
      JOptionPane.showMessageDialog(null, "Record updated successfully!");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
