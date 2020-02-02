package be.hogent.eindproject.model;


public class Waiter {
    private final int id;
    private final String lastName;
    private final String firstName;
    private final String password;

    public Waiter(int id, String lastName, String firstName, String password) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
    }
}
