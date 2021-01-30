import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao (Config config){
        try{
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
    List<Ad> output = new ArrayList<>();
    String query = "SELECT * FROM Ads";

    try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                output.add(
                        new Ad(
                                rs.getInt("id"),
                                rs.getLong("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }
    }

