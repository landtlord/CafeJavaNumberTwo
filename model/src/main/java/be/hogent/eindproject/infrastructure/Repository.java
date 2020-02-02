package be.hogent.eindproject.infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Repository<T> {

    Connection getRepoConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "order", "AQWzsxedc1.");
    }

    public abstract T findByID(int ID);
}
