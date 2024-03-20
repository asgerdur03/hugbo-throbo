package verkefni.verkefnihbvvol30000;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDB {
    Connection connection;

    public UserDB(){ // EKKI BREYTA
        connection = SqliteSetupConnection.Connector();
        if (connection == null){
            System.out.println("Failed to connect to database");
        }
    }
    public boolean islogin(String username, String password) throws SQLException {  // Eru ekki að acsessa database
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        try{
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }
    public void DBsignup(String username, String email, String password) throws SQLException { // ekki að tengjast database
        PreparedStatement preparedStatement = null;
        String query = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
        try{
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
