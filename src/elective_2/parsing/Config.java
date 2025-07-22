package elective_2.parsing;

import java.util.List;
import java.util.Map;

public class Config {
    public Application application;
    public Database database;
    public List<String> features;
    public List<Server> servers;
    public Map<String, Object> metadata;

    @Override
    public String toString() {
        return "Config{" +
                "\n application=" + application +
                ",\n database=" + database +
                ",\n features=" + features +
                ",\n servers=" + servers +
                ",\n metadata=" + metadata +
                '}';
    }
}
