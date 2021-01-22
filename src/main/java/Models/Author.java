package Models;

public class Author {
    private long id;
    private String firstName;
    private String lastName;

    public long getId() {
        return id;
    }

    public static void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author(){

    }
}
