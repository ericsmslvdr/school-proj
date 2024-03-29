
import java.sql.*;
import javax.swing.JOptionPane;

public class Books {

  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost:3306/jon";
  static final String USER = "root";
  static final String PASS = "";
  static final String QUERY = "SELECT accession_num, isbn, num_copies, authors, copyright_year, publisher FROM books";

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
      rs = stmt.executeQuery("SELECT * from books");

      while (rs.next()) {
        System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
      }
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void insertRecord() {
    int accession_num, isbn, num_copies, copyright_year;
    String authors, publisher;
    try {
      con = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = con.createStatement();
      java.util.Scanner intinput = new java.util.Scanner(System.in);
      java.util.Scanner strinput = new java.util.Scanner(System.in);
      System.out.print("Enter the book accession number: ");
      accession_num = intinput.nextInt();
      System.out.print("Enter the book isbn: ");
      isbn = intinput.nextInt();
      System.out.print("Enter the number of copies: ");
      num_copies = intinput.nextInt();
      System.out.print("Enter the author name: ");
      authors = strinput.nextLine();
      System.out.print("Enter the copyright year: ");
      copyright_year = intinput.nextInt();
      System.out.print("Enter the publisher: ");
      publisher = strinput.nextLine();

      String SQL = "INSERT INTO books(accession_num, isbn, num_copies, authors, copyright_year, publisher) "
              + "VALUES (" + accession_num + "," + isbn + "," + num_copies + ",'" + authors + "'," + copyright_year + ",'" + publisher + "')";

      stmt.executeUpdate(SQL);
      JOptionPane.showMessageDialog(null, "Book Info added successfully.");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void updateRecord() {
    int accession_num, choice, isbn, num_copies, copyright_year;;
    String authors, publisher, SQL = "";

    try {
      con = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = con.createStatement();
      java.util.Scanner intinput = new java.util.Scanner(System.in);
      java.util.Scanner strinput = new java.util.Scanner(System.in);
      System.out.print("Enter the book accession number you want to update information: ");
      accession_num = intinput.nextInt();
      System.out.println("Which among the fields would you like to update: ");
      System.out.print("1. ISBN\n2. Number of Copies\n3. Authors\n4. Copyright Year\n5. Publisher\nEnter the number of your choice here: ");
      choice = intinput.nextInt();

      if (choice == 1) {
        System.out.print("Enter the new ISBN: ");
        isbn = intinput.nextInt();

        SQL = "UPDATE books "
                + "SET isbn = " + isbn + " "
                + "WHERE accession_num = " + accession_num;

      } else if (choice == 2) {
        System.out.print("Enter the new Number of Copies: ");
        num_copies = intinput.nextInt();

        SQL = "UPDATE books "
                + "SET num_copies = " + num_copies + " "
                + "WHERE accession_num = " + accession_num;

      } else if (choice == 3) {
        System.out.print("Enter the new Author: ");
        authors = strinput.nextLine();

        SQL = "UPDATE books "
                + "SET authors = '" + authors + "' "
                + "WHERE accession_num = " + accession_num;

      } else if (choice == 4) {
        System.out.print("Enter the new Copyright Year: ");
        copyright_year = intinput.nextInt();

        SQL = "UPDATE books "
                + "SET copyright_year = " + copyright_year + " "
                + "WHERE accession_num = " + accession_num;

      } else if (choice == 5) {
        System.out.print("Enter the new Publisher: ");
        publisher = strinput.nextLine();

        SQL = "UPDATE books "
                + "SET publisher = '" + publisher + "' "
                + "WHERE accession_num = " + accession_num;
      }

      stmt.executeUpdate(SQL);
      JOptionPane.showMessageDialog(null, "Record updated successfully!");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void deleteRecord() {
    int accession_num;
    try {
      con = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = con.createStatement();
      java.util.Scanner intinput = new java.util.Scanner(System.in);

      System.out.print("Enter the book accession number to be deleted: ");
      accession_num = intinput.nextInt();

      String SQL = "DELETE FROM books "
              + "WHERE accession_num = " + accession_num;

      int result = JOptionPane.showConfirmDialog(null, "Sure? You want to delete this book?", "Deleting a book", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

      if (result == JOptionPane.YES_OPTION) {
        stmt.executeUpdate(SQL);
        JOptionPane.showMessageDialog(null, "Book deleted successfully!");
      } else if (result == JOptionPane.NO_OPTION) {
        JOptionPane.showMessageDialog(null, "No book has been deleted");
      }

      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
