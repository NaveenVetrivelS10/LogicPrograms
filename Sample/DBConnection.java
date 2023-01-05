package newTest.Sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {

	Connection connection;
	String jdbcURL = "jdbc:mysql://localhost:3306/collageconnect";
	String jdbcUsername = "root";
	String jdbcPassword = "master";
	ResultSet resultSet = null;

	public static void main(String[] args) {
		DBConnection bBConnection = new DBConnection();
		// bBConnection.addStudent();
		bBConnection.selectStudent();
		// bBConnection.deleteStudent();
		// bBConnection.updateStudent();

	}

	private void addStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			PreparedStatement preparedStatement = connection.prepareStatement(Constent.ADD_STUDENT);
			preparedStatement.setString(1, "3");
			preparedStatement.setString(2, "Naveen");
			preparedStatement.setString(3, "Mahandra");
			preparedStatement.setString(4, "Namakkal");
			int row = preparedStatement.executeUpdate();

			if (row > 0) {
				System.out.println("Information updated");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void updateStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			PreparedStatement preparedStatement = connection.prepareStatement(Constent.UPDATE_STUDENT);
			preparedStatement.setString(3, "1");
			preparedStatement.setString(1, "Raja");
			preparedStatement.setString(2, "ksr");

			int row = preparedStatement.executeUpdate();

			if (row > 0) {
				System.out.println("Information updated");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void deleteStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			PreparedStatement preparedStatement = connection.prepareStatement(Constent.DELETE_STUDENT);
			preparedStatement.setString(1, "1");

			int row = preparedStatement.executeUpdate();

			if (row > 0) {
				System.out.println("deleted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void selectStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			PreparedStatement preparedStatement = connection.prepareStatement(Constent.Students_info);

			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				System.out.print(resultSet.getInt(1));
				System.out.print("\t"+resultSet.getString(2));
				System.out.print("\t"+resultSet.getString(3));
				System.out.print("\t"+resultSet.getString(4));
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
