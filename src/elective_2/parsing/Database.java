package elective_2.parsing;

public class Database {
    public String host;
    public int port;
    public String name;
    public String username;
    public String password;
    public boolean sslEnabled;
    public int timeout;

    @Override
    public String toString() {
        return "Database{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sslEnabled=" + sslEnabled +
                ", timeout=" + timeout +
                '}';
    }
}
