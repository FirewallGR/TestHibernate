import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClockDAO {
    public Clock findById(int id) {
        Clock clock = new Clock();
        String sqlRequest = "SELECT * from clocks where id = ?";
        try(PreparedStatement preparedStatement = SessionController.getConnection().prepareStatement(sqlRequest)) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            ResultSet set = preparedStatement.getResultSet();
            if (set.next()) {
                clock.setName(set.getString("name"));
                clock.setId(set.getInt("id"));
                clock.setMark(set.getString("mark"));
                clock.setCost(set.getInt("cost"));
                clock.setTyped(set.getBoolean("isTyped"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clock;
    }
    public void add(Clock clock) {
        String sqlRequest = "INSERT INTO clocks VALUES (? ,?, ?, ?, ?)";
        try(PreparedStatement preparedStatement = SessionController.getConnection().prepareStatement(sqlRequest)) {
            preparedStatement.setInt(1, clock.getId());
            preparedStatement.setString(2, clock.getName());
            preparedStatement.setString(3, clock.getMark());
            preparedStatement.setInt(4, clock.getCost());
            preparedStatement.setBoolean(5, clock.isTyped());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
