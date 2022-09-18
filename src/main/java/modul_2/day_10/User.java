package modul_2.day_10;

public class User {
    private int id;
    private String name;
    private String email;
    private String def_1;

    public User() {
    }

    public User(String name, String email, String def_1) {
        this.name = name;
        this.email = email;
        this.def_1 = def_1;
    }

    public User(int id, String name, String email, String def_1) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.def_1 = def_1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDef_1(String def_1) {
        this.def_1 = def_1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDef_1() {
        return def_1;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", def_1='" + def_1 + '\'' +
                '}';
    }
}
