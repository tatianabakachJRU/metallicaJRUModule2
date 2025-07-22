package elective_2.parsing;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Application {
    //@JsonProperty("app_name")
    @JsonAlias({"app_name", "name"})
    public String name;
    public String version;
    public boolean debug;
    public int maxConnections;
    public String baseUrl;

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", debug=" + debug +
                ", maxConnections=" + maxConnections +
                ", baseUrl='" + baseUrl + '\'' +
                '}';
    }
}
