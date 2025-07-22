package elective_2.parsing;

public class Server {
    public String name;
    public String ip;
    public boolean active;

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", active=" + active +
                '}';
    }
}
