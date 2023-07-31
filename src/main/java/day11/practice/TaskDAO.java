package day11.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TaskDAO {

    private Connection connection;

    public TaskDAO(Connection connection) {
        this.connection = connection;
    }

    public void insertTasks(List<Task> tasks) throws SQLException {
        String query = "INSERT INTO task_details(task_id, task_name, status) VALUES (?, ?, ?)";

        try (PreparedStatement psmt = connection.prepareStatement(query)) {
            for (Task t : tasks) {
                psmt.setInt(1, t.id);
                psmt.setString(2, t.name);
                psmt.setBoolean(3, t.status);

                int num = psmt.executeUpdate();

                System.out.println(num);
            }
        }
    }
}

