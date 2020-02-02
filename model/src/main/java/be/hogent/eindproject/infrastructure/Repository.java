package be.hogent.eindproject.infrastructure;

import java.nio.channels.NoConnectionPendingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Repository<T> {
    private Connection repoConnection;

    public Repository() {
        makeJDBCConnection();
    }

    private void makeJDBCConnection() {
        try {
            repoConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "order", "AQWzsxedc1.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NoConnectionPendingException();
        }
    }

    Connection getRepoConnection(){
        return repoConnection;
    }

    public abstract T findByID(int ID);
}
