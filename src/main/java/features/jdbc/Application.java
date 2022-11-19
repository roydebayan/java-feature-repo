package features.jdbc;

import java.sql.*;

public class Application {

    public static Connection getConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "root";
            return DriverManager.getConnection(url,username,password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws SQLException {

        Connection con = getConnection();
//        PreparedStatement preparedStatement = con.prepareStatement("Select * from student where name = ?");
//        preparedStatement.setString(1, "Debayan");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        resultSet.next();
//        String city = resultSet.getString("city");
//        System.out.println("City = " + city);
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("call spGetCity('Delhi')");
        resultSet.next();
//        preparedStatement.setString(1, "Debayan");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        resultSet.next();
        String name = resultSet.getString("name");
        System.out.println("Name = " + name);

        CallableStatement callableStatement = con.prepareCall("call spGetCity(?)");
        callableStatement.execute();

        statement.close();
        con.close();
        
        

    }
}
