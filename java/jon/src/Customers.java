
import java.sql.*;
import javax.swing.JOptionPane;

public class Customers {

  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost:3306/jon";
  static final String USER = "root";
  static final String PASS = "";
  static final String QUERY = "SELECT customer_id, firstName, lastName, address FROM customers";

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
      rs = stmt.executeQuery("SELECT * from customers");
      while (rs.next()) {
        System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
      }
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void insertRecord() {
    int customer_id;
    String firstName, lastName, address;
    try {
      con = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = con.createStatement();
      java.util.Scanner intinput = new java.util.Scanner(System.in);
      java.util.Scanner strinput = new java.util.Scanner(System.in);
      System.out.print("Enter the customer ID: ");
      customer_id = intinput.nextInt();
      System.out.print("Enter the customer last name: ");
      lastName = strinput.nextLine();
      System.out.print("Enter the customer first name: ");
      firstName = strinput.nextLine();
      System.out.print("Enter the customer address: ");
      address = strinput.nextLine();

      String SQL = "INSERT INTO customers(customer_id, lastName, firstName, address) "
                 + "VALUES (" + customer_id + ",'" + lastName + "','" + firstName + "','" + address + "')";
      stmt.executeUpdate(SQL);
      JOptionPane.showMessageDialog(null, "Customer Info added successfully.");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void updateRecord() {
    int customer_id, choice;
    String firstName, lastName, address, SQL = "";
    try {
      con = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = con.createStatement();
      java.util.Scanner intinput = new java.util.Scanner(System.in);
      java.util.Scanner strinput = new java.util.Scanner(System.in);
      System.out.print("Enter the customer ID you want to update information: ");
      customer_id = intinput.nextInt();
      System.out.println("Which among the fields would you like to update: ");
      System.out.print("1. Last Name\n2. First Name\n3. Address\nEnter the number of your choice here: ");
      choice = intinput.nextInt();

      if (choice == 1) {
        System.out.print("Enter the new last name: ");
        lastName = strinput.nextLine();

        SQL = "UPDATE customers "
            + "SET lastName = '" + lastName + "' "
            + "WHERE customer_id = " + customer_id;

      } else if (choice == 2) {
        System.out.print("Enter the new first name: ");
        firstName = strinput.nextLine();

        SQL = "UPDATE customers "
            + "SET firstName = '" + firstName + "' "
            + "WHERE customer_id = " + customer_id;

      } else if (choice == 3) {
        System.out.print("Enter the new address: ");
        address = strinput.nextLine();

        SQL = "UPDATE customers "
            + "SET address = '" + address + "' "
            + "WHERE customer_id = " + customer_id;
      }

      stmt.executeUpdate(SQL);
      JOptionPane.showMessageDialog(null, "Customer Info updated successfully!");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void deleteRecord() {
    int customer_id;
    try {
      con = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = con.createStatement();
      java.util.Scanner intinput = new java.util.Scanner(System.in);

      System.out.print("Enter the customer id to be deleted: ");
      customer_id = intinput.nextInt();

      String SQL = "DELETE FROM customers "
                 + "WHERE customer_id = " + customer_id;

      int result = JOptionPane.showConfirmDialog(null, "Sure? You want to delete this record?", "Deleting a record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

      if (result == JOptionPane.YES_OPTION) {
        stmt.executeUpdate(SQL);
        JOptionPane.showMessageDialog(null, "Record deleted successfully!");
      } else if (result == JOptionPane.NO_OPTION) {
        JOptionPane.showMessageDialog(null, "No record has been deleted");
      }

      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
