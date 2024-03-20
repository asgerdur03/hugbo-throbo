package verkefni.verkefnihbvvol30000;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class SqliteSetupConnection {
    public static Connection Connector(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:verkefni.db");
            return conn;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    // kannski?
    /*
     *  public static void main(String[] args) {
        Connection conn = connectToDB();
        File file = new File("Database.sql");
        Scanner myReader = null;
        try {
            myReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        myReader.useDelimiter("\\Z");
        String setupText = myReader.next();
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(setupText);
            System.out.println("Database has been set up");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
     *
     *
     */


}
