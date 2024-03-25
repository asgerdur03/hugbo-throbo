package verkefni.verkefnihbvvol30000;

import java.sql.*;
import java.util.ArrayList;




public class HotelDB {

    private Connection connectToDB() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:HotelSQL.db");
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

    private void closeConnection(Connection conn){
        try{
            if(conn != null)
                conn.close();
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }

    public int insertBooking(String userName,Room room,Date begin, Date end, int count){
        Connection conn = connectToDB();
        try {
            Statement st = conn.createStatement();
            Statement st2 = conn.createStatement();
            ResultSet rs = st2.executeQuery("select id from hotels where name like '" + room.getHotel().getHotelName() + "'");
            rs.next();
            int id = rs.getInt("id");

            rs = st2.executeQuery("select sum(persons) " +
                    "from bookings natural join hotelrooms " +
                    "where hotelid = " + id +
                    " and checkin <= '" + end +
                    "' and checkout >= '" + begin + "';");
            rs.next();
            int num = rs.getInt(1);
            System.out.println(room.getBeds() +" " + num);
            if(room.getBeds() - num < count){
                return room.getBeds()-num;
            }
            for(int i = 0; i < count; i++) {
                System.out.println(i);
                System.out.println(begin + " " + end);
                st.executeUpdate("insert into bookings values( "+ id + " ,'" + userName + begin + "','" + end + "');");
            }
            return room.getBeds() - num;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        finally{
            closeConnection(conn);
        }
        return -1;
    }

    // er buin að reyna svo mikið eg skil ekki þori ekki að skemma lfmao  jaok
    public ArrayList<Room> getAvailableRooms() {
        return getAvailableRooms();
    }
}
